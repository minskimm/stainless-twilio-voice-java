// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.dialingPermissions

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
import com.twilio_voice_openapi.api.core.prepare
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveResponse

class CountryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryService {

    private val withRawResponse: CountryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DialingPermissionCountryRetrieveParams,
        requestOptions: RequestOptions,
    ): DialingPermissionCountryRetrieveResponse =
        // get /v1/DialingPermissions/Countries/{IsoCode}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DialingPermissionCountryListParams,
        requestOptions: RequestOptions,
    ): DialingPermissionCountryListResponse =
        // get /v1/DialingPermissions/Countries
        withRawResponse().list(params, requestOptions).parse()

    override fun fetchHighRiskSpecialPrefixes(
        params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions,
    ): DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse =
        // get /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes
        withRawResponse().fetchHighRiskSpecialPrefixes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DialingPermissionCountryRetrieveResponse> =
            jsonHandler<DialingPermissionCountryRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DialingPermissionCountryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialingPermissionCountryRetrieveResponse> {
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

        private val listHandler: Handler<DialingPermissionCountryListResponse> =
            jsonHandler<DialingPermissionCountryListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DialingPermissionCountryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialingPermissionCountryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "DialingPermissions", "Countries")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
