// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.JsonValue
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
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesResponse
import com.twilio_voice_openapi.api.services.blocking.dialingpermissions.CountryService
import com.twilio_voice_openapi.api.services.blocking.dialingpermissions.CountryServiceImpl

class DialingPermissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DialingPermissionService {

    private val withRawResponse: DialingPermissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val countries: CountryService by lazy { CountryServiceImpl(clientOptions) }

    override fun withRawResponse(): DialingPermissionService.WithRawResponse = withRawResponse

    override fun countries(): CountryService = countries

    override fun createBulkCountryUpdates(
        params: DialingPermissionCreateBulkCountryUpdatesParams,
        requestOptions: RequestOptions,
    ): DialingPermissionCreateBulkCountryUpdatesResponse =
        // post /v1/DialingPermissions/BulkCountryUpdates
        withRawResponse().createBulkCountryUpdates(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DialingPermissionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val countries: CountryService.WithRawResponse by lazy {
            CountryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun countries(): CountryService.WithRawResponse = countries

        private val createBulkCountryUpdatesHandler:
            Handler<DialingPermissionCreateBulkCountryUpdatesResponse> =
            jsonHandler<DialingPermissionCreateBulkCountryUpdatesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createBulkCountryUpdates(
            params: DialingPermissionCreateBulkCountryUpdatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialingPermissionCreateBulkCountryUpdatesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "DialingPermissions", "BulkCountryUpdates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createBulkCountryUpdatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
