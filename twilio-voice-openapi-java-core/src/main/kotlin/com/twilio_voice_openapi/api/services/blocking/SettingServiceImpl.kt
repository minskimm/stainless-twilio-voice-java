// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.jsonHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.core.http.json
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepare
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.SettingRetrieveParams
import com.twilio_voice_openapi.api.models.SettingUpdateParams
import com.twilio_voice_openapi.api.models.VoiceDialingPermissions

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: SettingRetrieveParams,
        requestOptions: RequestOptions,
    ): VoiceDialingPermissions =
        // get /v1/Settings
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions,
    ): VoiceDialingPermissions =
        // post /v1/Settings
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<VoiceDialingPermissions> =
            jsonHandler<VoiceDialingPermissions>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDialingPermissions> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "Settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<VoiceDialingPermissions> =
            jsonHandler<VoiceDialingPermissions>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDialingPermissions> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "Settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
