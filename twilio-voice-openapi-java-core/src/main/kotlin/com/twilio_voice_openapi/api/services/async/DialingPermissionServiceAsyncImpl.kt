// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

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
import com.twilio_voice_openapi.api.core.prepareAsync
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesResponse
import com.twilio_voice_openapi.api.services.async.dialingpermissions.CountryServiceAsync
import com.twilio_voice_openapi.api.services.async.dialingpermissions.CountryServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class DialingPermissionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DialingPermissionServiceAsync {

    private val withRawResponse: DialingPermissionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val countries: CountryServiceAsync by lazy { CountryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DialingPermissionServiceAsync.WithRawResponse = withRawResponse

    override fun countries(): CountryServiceAsync = countries

    override fun createBulkCountryUpdates(
        params: DialingPermissionCreateBulkCountryUpdatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DialingPermissionCreateBulkCountryUpdatesResponse> =
        // post /v1/DialingPermissions/BulkCountryUpdates
        withRawResponse().createBulkCountryUpdates(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DialingPermissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val countries: CountryServiceAsync.WithRawResponse by lazy {
            CountryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun countries(): CountryServiceAsync.WithRawResponse = countries

        private val createBulkCountryUpdatesHandler:
            Handler<DialingPermissionCreateBulkCountryUpdatesResponse> =
            jsonHandler<DialingPermissionCreateBulkCountryUpdatesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createBulkCountryUpdates(
            params: DialingPermissionCreateBulkCountryUpdatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DialingPermissionCreateBulkCountryUpdatesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "DialingPermissions", "BulkCountryUpdates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
