// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.connectionPolicies

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.handlers.emptyHandler
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.jsonHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.core.http.json
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepare
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.ConnectionPolicyTarget
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetCreateParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetDeleteParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListResponse
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetRetrieveParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetUpdateParams

class TargetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TargetService {

    private val withRawResponse: TargetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TargetService.WithRawResponse = withRawResponse

    override fun create(
        params: ConnectionPolicyTargetCreateParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicyTarget =
        // post /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ConnectionPolicyTargetRetrieveParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicyTarget =
        // get /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConnectionPolicyTargetUpdateParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicyTarget =
        // post /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConnectionPolicyTargetListParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicyTargetListResponse =
        // get /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ConnectionPolicyTargetDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TargetService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ConnectionPolicyTargetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicyTarget> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0), "Targets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConnectionPolicyTargetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicyTarget> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "ConnectionPolicies",
                        params.getPathParam(0),
                        "Targets",
                        params.getPathParam(1),
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

        private val updateHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ConnectionPolicyTargetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicyTarget> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "ConnectionPolicies",
                        params.getPathParam(0),
                        "Targets",
                        params.getPathParam(1),
                    )
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

        private val listHandler: Handler<ConnectionPolicyTargetListResponse> =
            jsonHandler<ConnectionPolicyTargetListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ConnectionPolicyTargetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicyTargetListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0), "Targets")
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

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: ConnectionPolicyTargetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "v1",
                        "ConnectionPolicies",
                        params.getPathParam(0),
                        "Targets",
                        params.getPathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
