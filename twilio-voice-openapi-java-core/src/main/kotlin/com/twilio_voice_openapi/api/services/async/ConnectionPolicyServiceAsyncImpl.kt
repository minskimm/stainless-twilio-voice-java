// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

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
import com.twilio_voice_openapi.api.core.prepareAsync
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicy
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyDeleteParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListResponse
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyRetrieveParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyUpdateParams
import com.twilio_voice_openapi.api.services.async.connectionpolicies.TargetServiceAsync
import com.twilio_voice_openapi.api.services.async.connectionpolicies.TargetServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class ConnectionPolicyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ConnectionPolicyServiceAsync {

    private val withRawResponse: ConnectionPolicyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val targets: TargetServiceAsync by lazy { TargetServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ConnectionPolicyServiceAsync.WithRawResponse = withRawResponse

    override fun targets(): TargetServiceAsync = targets

    override fun create(
        params: ConnectionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicy> =
        // post /v1/ConnectionPolicies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicy> =
        // get /v1/ConnectionPolicies/{Sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicy> =
        // post /v1/ConnectionPolicies/{Sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConnectionPolicyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicyListResponse> =
        // get /v1/ConnectionPolicies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ConnectionPolicyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/ConnectionPolicies/{Sid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionPolicyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val targets: TargetServiceAsync.WithRawResponse by lazy {
            TargetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun targets(): TargetServiceAsync.WithRawResponse = targets

        private val createHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ConnectionPolicyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies", params._pathParam(0))
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

        private val updateHandler: Handler<ConnectionPolicy> =
            jsonHandler<ConnectionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<ConnectionPolicyListResponse> =
            jsonHandler<ConnectionPolicyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ConnectionPolicyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies")
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

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "ConnectionPolicies", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }
    }
}
