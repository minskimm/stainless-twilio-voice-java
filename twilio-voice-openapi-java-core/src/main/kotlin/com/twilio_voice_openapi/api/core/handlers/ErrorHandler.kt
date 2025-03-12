@file:JvmName("ErrorHandler")

package com.twilio_voice_openapi.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.errors.BadRequestException
import com.twilio_voice_openapi.api.errors.InternalServerException
import com.twilio_voice_openapi.api.errors.NotFoundException
import com.twilio_voice_openapi.api.errors.PermissionDeniedException
import com.twilio_voice_openapi.api.errors.RateLimitException
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.errors.UnauthorizedException
import com.twilio_voice_openapi.api.errors.UnexpectedStatusCodeException
import com.twilio_voice_openapi.api.errors.UnprocessableEntityException
import java.io.ByteArrayInputStream
import java.io.InputStream

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<TwilioVoiceOpenAPIError> {
    val handler = jsonHandler<TwilioVoiceOpenAPIError>(jsonMapper)

    return object : Handler<TwilioVoiceOpenAPIError> {
        override fun handle(response: HttpResponse): TwilioVoiceOpenAPIError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                TwilioVoiceOpenAPIError.builder().build()
            }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(
    errorHandler: Handler<TwilioVoiceOpenAPIError>
): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): Headers = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}
