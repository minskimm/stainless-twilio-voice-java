package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

abstract class TwilioVoiceOpenAPIServiceException
@JvmOverloads
constructor(
        private val statusCode: Int,
        private val headers: Headers,
        private val body: String,
        private val error: TwilioVoiceOpenAPIError,
        message: String = "$statusCode: $error",
        cause: Throwable? = null
) : TwilioVoiceOpenAPIException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): TwilioVoiceOpenAPIError = error
}
