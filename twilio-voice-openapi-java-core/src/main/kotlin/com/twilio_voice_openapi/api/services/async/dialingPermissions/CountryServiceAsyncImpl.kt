// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.dialingPermissions

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.jsonHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepareAsync
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveResponse
import java.util.concurrent.CompletableFuture

class CountryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryServiceAsync {

    private val withRawResponse: CountryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DialingPermissionCountryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DialingPermissionCountryRetrieveResponse> =
        // get /v1/DialingPermissions/Countries/{IsoCode}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DialingPermissionCountryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DialingPermissionCountryListResponse> =
        // get /v1/DialingPermissions/Countries
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun fetchHighRiskSpecialPrefixes(
        params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse> =
        // get /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes
        withRawResponse().fetchHighRiskSpecialPrefixes(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DialingPermissionCountryRetrieveResponse> =
            jsonHandler<DialingPermissionCountryRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DialingPermissionCountryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "DialingPermissions",
                        "Countries",
                        params.getPathParam(0),
                    )
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

        private val listHandler: Handler<DialingPermissionCountryListResponse> =
            jsonHandler<DialingPermissionCountryListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DialingPermissionCountryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>> {
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
            Handler<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse> =
            jsonHandler<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun fetchHighRiskSpecialPrefixes(
            params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "DialingPermissions",
                        "Countries",
                        params.getPathParam(0),
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
