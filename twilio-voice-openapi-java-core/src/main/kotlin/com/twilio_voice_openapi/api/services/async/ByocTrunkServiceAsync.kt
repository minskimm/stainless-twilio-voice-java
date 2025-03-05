// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.ByocTrunk
import com.twilio_voice_openapi.api.models.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.ByocTrunkListResponse
import com.twilio_voice_openapi.api.models.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.ByocTrunkUpdateParams
import java.util.concurrent.CompletableFuture

interface ByocTrunkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    @JvmOverloads
    fun create(
        params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByocTrunk>

    fun create(requestOptions: RequestOptions): CompletableFuture<ByocTrunk> =
        create(ByocTrunkCreateParams.none(), requestOptions)

    @JvmOverloads
    fun retrieve(
        params: ByocTrunkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByocTrunk>

    @JvmOverloads
    fun update(
        params: ByocTrunkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByocTrunk>

    @JvmOverloads
    fun list(
        params: ByocTrunkListParams = ByocTrunkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByocTrunkListResponse>

    fun list(requestOptions: RequestOptions): CompletableFuture<ByocTrunkListResponse> =
        list(ByocTrunkListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: ByocTrunkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ByocTrunkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkServiceAsync.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ByocTrunk>> =
            create(ByocTrunkCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ByocTrunkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ByocTrunkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByocTrunk>>

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ByocTrunkListParams = ByocTrunkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ByocTrunkListResponse>> =
            list(ByocTrunkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ByocTrunks/{Sid}`, but is otherwise the same
         * as [ByocTrunkServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ByocTrunkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
