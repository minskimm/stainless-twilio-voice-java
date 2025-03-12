// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunk
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListResponse
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkUpdateParams
import java.util.concurrent.CompletableFuture

interface ByocTrunkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(): CompletableFuture<ByocTrunk> = create(ByocTrunkCreateParams.none())

    /** @see [create] */
    fun create(params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ByocTrunk>

    /** @see [create] */
    fun create(params: ByocTrunkCreateParams = ByocTrunkCreateParams.none()): CompletableFuture<ByocTrunk> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ByocTrunk> = create(ByocTrunkCreateParams.none(), requestOptions)

    fun retrieve(params: ByocTrunkRetrieveParams): CompletableFuture<ByocTrunk> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ByocTrunkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ByocTrunk>

    fun update(params: ByocTrunkUpdateParams): CompletableFuture<ByocTrunk> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ByocTrunkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ByocTrunk>

    fun list(): CompletableFuture<ByocTrunkListResponse> = list(ByocTrunkListParams.none())

    /** @see [list] */
    fun list(params: ByocTrunkListParams = ByocTrunkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ByocTrunkListResponse>

    /** @see [list] */
    fun list(params: ByocTrunkListParams = ByocTrunkListParams.none()): CompletableFuture<ByocTrunkListResponse> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ByocTrunkListResponse> = list(ByocTrunkListParams.none(), requestOptions)

    fun delete(params: ByocTrunkDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: ByocTrunkDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /**
     * A view of [ByocTrunkServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks`, but is otherwise the same
         * as [ByocTrunkServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ByocTrunk>> = create(ByocTrunkCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /** @see [create] */
        @MustBeClosed
        fun create(params: ByocTrunkCreateParams = ByocTrunkCreateParams.none()): CompletableFuture<HttpResponseFor<ByocTrunk>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ByocTrunk>> = create(ByocTrunkCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks/{Sid}`, but is otherwise the
         * same as [ByocTrunkServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ByocTrunkRetrieveParams): CompletableFuture<HttpResponseFor<ByocTrunk>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ByocTrunkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks/{Sid}`, but is otherwise
         * the same as [ByocTrunkServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ByocTrunkUpdateParams): CompletableFuture<HttpResponseFor<ByocTrunk>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ByocTrunkUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same
         * as [ByocTrunkServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>> = list(ByocTrunkListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ByocTrunkListParams = ByocTrunkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ByocTrunkListParams = ByocTrunkListParams.none()): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>> = list(ByocTrunkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ByocTrunks/{Sid}`, but is otherwise
         * the same as [ByocTrunkServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ByocTrunkDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ByocTrunkDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
