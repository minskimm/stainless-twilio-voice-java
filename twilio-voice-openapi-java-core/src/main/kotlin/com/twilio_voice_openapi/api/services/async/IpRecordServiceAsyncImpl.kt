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
import com.twilio_voice_openapi.api.models.IpRecord
import com.twilio_voice_openapi.api.models.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.IpRecordDeleteParams
import com.twilio_voice_openapi.api.models.IpRecordListParams
import com.twilio_voice_openapi.api.models.IpRecordListResponse
import com.twilio_voice_openapi.api.models.IpRecordRetrieveParams
import com.twilio_voice_openapi.api.models.IpRecordUpdateParams
import java.util.concurrent.CompletableFuture

class IpRecordServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IpRecordServiceAsync {

    private val withRawResponse: IpRecordServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IpRecordServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: IpRecordCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpRecord> =
        // post /v1/IpRecords
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: IpRecordRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpRecord> =
        // get /v1/IpRecords/{Sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: IpRecordUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpRecord> =
        // post /v1/IpRecords/{Sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IpRecordListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpRecordListResponse> =
        // get /v1/IpRecords
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: IpRecordDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/IpRecords/{Sid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpRecordServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: IpRecordCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecord>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "IpRecords")
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

        private val retrieveHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: IpRecordRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecord>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
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

        private val updateHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: IpRecordUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecord>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
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

        private val listHandler: Handler<IpRecordListResponse> =
            jsonHandler<IpRecordListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IpRecordListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "IpRecords")
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
            params: IpRecordDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
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
