// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMapping
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListResponse
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingUpdateParams
import java.util.concurrent.CompletableFuture

interface SourceIpMappingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: SourceIpMappingCreateParams): CompletableFuture<SourceIpMapping> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SourceIpMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    fun retrieve(params: SourceIpMappingRetrieveParams): CompletableFuture<SourceIpMapping> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SourceIpMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    fun update(params: SourceIpMappingUpdateParams): CompletableFuture<SourceIpMapping> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SourceIpMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMapping>

    fun list(): CompletableFuture<SourceIpMappingListResponse> =
        list(SourceIpMappingListParams.none())

    /** @see [list] */
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SourceIpMappingListResponse>

    /** @see [list] */
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none()
    ): CompletableFuture<SourceIpMappingListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<SourceIpMappingListResponse> =
        list(SourceIpMappingListParams.none(), requestOptions)

    fun delete(params: SourceIpMappingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
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
        @MustBeClosed
        fun create(
            params: SourceIpMappingCreateParams
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SourceIpMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SourceIpMappingRetrieveParams
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SourceIpMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: SourceIpMappingUpdateParams
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SourceIpMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMapping>>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>> =
            list(SourceIpMappingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none()
        ): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SourceIpMappingListResponse>> =
            list(SourceIpMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: SourceIpMappingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: SourceIpMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
