// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.checkRequired
import com.twilio_voice_openapi.api.core.handlers.emptyHandler
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.json
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepareAsync
import com.twilio_voice_openapi.api.models.archives.ArchiveDeleteCallParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class ArchiveServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ArchiveServiceAsync {

    private val withRawResponse: ArchiveServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArchiveServiceAsync.WithRawResponse = withRawResponse

    override fun deleteCall(
        params: ArchiveDeleteCallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/Archives/{Date}/Calls/{Sid}
        withRawResponse().deleteCall(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArchiveServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val deleteCallHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun deleteCall(
            params: ArchiveDeleteCallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sid", params.sid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "v1",
                        "Archives",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteCallHandler.handle(it) } }
                }
        }
    }
}
