// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.dialingpermissions

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
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveResponse

class CountryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryService {

    private val withRawResponse: CountryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions,
    ): CountryRetrieveResponse =
        // get /v1/DialingPermissions/Countries/{IsoCode}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CountryListParams,
        requestOptions: RequestOptions,
    ): CountryListResponse =
        // get /v1/DialingPermissions/Countries
        withRawResponse().list(params, requestOptions).parse()

    override fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions,
    ): CountryFetchHighRiskSpecialPrefixesResponse =
        // get /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes
        withRawResponse().fetchHighRiskSpecialPrefixes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CountryRetrieveResponse> =
            jsonHandler<CountryRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryRetrieveResponse> {
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

        private val listHandler: Handler<CountryListResponse> =
            jsonHandler<CountryListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CountryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryListResponse> {
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
            Handler<CountryFetchHighRiskSpecialPrefixesResponse> =
            jsonHandler<CountryFetchHighRiskSpecialPrefixesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> {
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
