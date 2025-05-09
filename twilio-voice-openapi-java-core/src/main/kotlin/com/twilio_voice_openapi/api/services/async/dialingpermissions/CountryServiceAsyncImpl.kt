// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.dialingpermissions

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.checkRequired
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.jsonHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepareAsync
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class CountryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryServiceAsync {

    private val withRawResponse: CountryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryRetrieveResponse> =
        // get /v1/DialingPermissions/Countries/{IsoCode}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CountryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryListResponse> =
        // get /v1/DialingPermissions/Countries
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        // get /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes
        withRawResponse().fetchHighRiskSpecialPrefixes(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CountryRetrieveResponse> =
            jsonHandler<CountryRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("isoCode", params.isoCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "DialingPermissions", "Countries", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CountryListResponse> =
            jsonHandler<CountryListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CountryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "DialingPermissions", "Countries")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchHighRiskSpecialPrefixesHandler:
            Handler<CountryFetchHighRiskSpecialPrefixesResponse> =
            jsonHandler<CountryFetchHighRiskSpecialPrefixesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("isoCode", params.isoCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "DialingPermissions",
                        "Countries",
                        params._pathParam(0),
                        "HighRiskSpecialPrefixes",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchHighRiskSpecialPrefixesHandler.handle(it) }
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
