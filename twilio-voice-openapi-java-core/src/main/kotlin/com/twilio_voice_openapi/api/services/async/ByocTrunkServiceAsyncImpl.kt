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
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunk
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListResponse
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkUpdateParams
import java.util.concurrent.CompletableFuture

class ByocTrunkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ByocTrunkServiceAsync {

    private val withRawResponse: ByocTrunkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ByocTrunkServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ByocTrunkCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ByocTrunk> =
        // post /v1/ByocTrunks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ByocTrunkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ByocTrunk> =
        // get /v1/ByocTrunks/{Sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ByocTrunkUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ByocTrunk> =
        // post /v1/ByocTrunks/{Sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ByocTrunkListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ByocTrunkListResponse> =
        // get /v1/ByocTrunks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ByocTrunkDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/ByocTrunks/{Sid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ByocTrunkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ByocTrunk> =
            jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ByocTrunkCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ByocTrunk>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ByocTrunks")
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

        private val retrieveHandler: Handler<ByocTrunk> =
            jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ByocTrunkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ByocTrunk>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ByocTrunks", params._pathParam(0))
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

        private val updateHandler: Handler<ByocTrunk> =
            jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ByocTrunkUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ByocTrunk>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "ByocTrunks", params._pathParam(0))
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

        private val listHandler: Handler<ByocTrunkListResponse> =
            jsonHandler<ByocTrunkListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ByocTrunkListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "ByocTrunks")
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
            params: ByocTrunkDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "ByocTrunks", params._pathParam(0))
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
