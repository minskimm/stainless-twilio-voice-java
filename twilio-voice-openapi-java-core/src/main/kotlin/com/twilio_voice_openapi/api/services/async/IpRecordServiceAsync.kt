// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.IpRecord
import com.twilio_voice_openapi.api.models.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.IpRecordDeleteParams
import com.twilio_voice_openapi.api.models.IpRecordListParams
import com.twilio_voice_openapi.api.models.IpRecordListResponse
import com.twilio_voice_openapi.api.models.IpRecordRetrieveParams
import com.twilio_voice_openapi.api.models.IpRecordUpdateParams
import java.util.concurrent.CompletableFuture

interface IpRecordServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    @JvmOverloads
    fun create(
        params: IpRecordCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    @JvmOverloads
    fun retrieve(
        params: IpRecordRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    @JvmOverloads
    fun update(
        params: IpRecordUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    @JvmOverloads
    fun list(
        params: IpRecordListParams = IpRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecordListResponse>

    fun list(requestOptions: RequestOptions): CompletableFuture<IpRecordListResponse> =
        list(IpRecordListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: IpRecordDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [IpRecordServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords`, but is otherwise the same as
         * [IpRecordServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: IpRecordCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: IpRecordRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: IpRecordUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords`, but is otherwise the same as
         * [IpRecordServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: IpRecordListParams = IpRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords`, but is otherwise the same as
         * [IpRecordServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>> =
            list(IpRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/IpRecords/{Sid}`, but is otherwise the same
         * as [IpRecordServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: IpRecordDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
