// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.SourceIpMapping
import com.twilio_voice_openapi.api.models.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.SourceIpMappingListResponse
import com.twilio_voice_openapi.api.models.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.SourceIpMappingUpdateParams
import java.util.concurrent.CompletableFuture

interface SourceIpMappingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    @JvmOverloads
    fun create(
        params: SourceIpMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    @JvmOverloads
    fun retrieve(
        params: SourceIpMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    @JvmOverloads
    fun update(
        params: SourceIpMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    @JvmOverloads
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMappingListResponse>

    fun list(requestOptions: RequestOptions): CompletableFuture<SourceIpMappingListResponse> =
        list(SourceIpMappingListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: SourceIpMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SourceIpMappingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SourceIpMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: SourceIpMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: SourceIpMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>> =
            list(SourceIpMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: SourceIpMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
