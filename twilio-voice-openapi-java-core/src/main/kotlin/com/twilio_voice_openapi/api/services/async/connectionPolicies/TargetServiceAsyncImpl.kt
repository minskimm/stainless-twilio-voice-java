// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.connectionPolicies

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
import com.twilio_voice_openapi.api.models.ConnectionPolicyTarget
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetCreateParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetDeleteParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListResponse
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetRetrieveParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetUpdateParams
import java.util.concurrent.CompletableFuture

class TargetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TargetServiceAsync {

    private val withRawResponse: TargetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TargetServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ConnectionPolicyTargetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicyTarget> =
        // post /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ConnectionPolicyTargetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicyTarget> =
        // get /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConnectionPolicyTargetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicyTarget> =
        // post /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConnectionPolicyTargetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionPolicyTargetListResponse> =
        // get /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ConnectionPolicyTargetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TargetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ConnectionPolicyTargetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0), "Targets")
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

        private val retrieveHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConnectionPolicyTargetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> {
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

        private val updateHandler: Handler<ConnectionPolicyTarget> =
            jsonHandler<ConnectionPolicyTarget>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ConnectionPolicyTargetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> {
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

        private val listHandler: Handler<ConnectionPolicyTargetListResponse> =
            jsonHandler<ConnectionPolicyTargetListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ConnectionPolicyTargetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTargetListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ConnectionPolicies", params.getPathParam(0), "Targets")
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
            params: ConnectionPolicyTargetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
