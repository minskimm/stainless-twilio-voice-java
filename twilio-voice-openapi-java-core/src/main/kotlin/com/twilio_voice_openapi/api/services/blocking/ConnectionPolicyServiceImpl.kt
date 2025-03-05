// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

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
import com.twilio_voice_openapi.api.models.ConnectionPolicy
import com.twilio_voice_openapi.api.models.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyDeleteParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyListResponse
import com.twilio_voice_openapi.api.models.ConnectionPolicyRetrieveParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyUpdateParams
import com.twilio_voice_openapi.api.services.blocking.connectionPolicies.TargetService
import com.twilio_voice_openapi.api.services.blocking.connectionPolicies.TargetServiceImpl

class ConnectionPolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectionPolicyService {

    private val withRawResponse: ConnectionPolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val targets: TargetService by lazy { TargetServiceImpl(clientOptions) }

    override fun withRawResponse(): ConnectionPolicyService.WithRawResponse = withRawResponse

    override fun targets(): TargetService = targets

    override fun create(
        params: ConnectionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicy =
        // post /v1/ConnectionPolicies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicy =
        // get /v1/ConnectionPolicies/{Sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicy =
        // post /v1/ConnectionPolicies/{Sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConnectionPolicyListParams,
        requestOptions: RequestOptions,
    ): ConnectionPolicyListResponse =
        // get /v1/ConnectionPolicies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ConnectionPolicyDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/ConnectionPolicies/{Sid}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionPolicyService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val targets: TargetService.WithRawResponse by lazy {
            TargetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun targets(): TargetService.WithRawResponse = targets

        private val createHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ConnectionPolicyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicy> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies")
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

        private val retrieveHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicy> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0))
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

        private val updateHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicy> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0))
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

        private val listHandler: Handler<ConnectionPolicyListResponse> =
            jsonHandler<ConnectionPolicyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ConnectionPolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionPolicyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies")
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
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
