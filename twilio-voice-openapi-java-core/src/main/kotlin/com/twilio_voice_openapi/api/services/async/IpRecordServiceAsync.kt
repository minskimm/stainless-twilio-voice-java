// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.iprecords.IpRecord
import com.twilio_voice_openapi.api.models.iprecords.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordDeleteParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListResponse
import com.twilio_voice_openapi.api.models.iprecords.IpRecordRetrieveParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordUpdateParams
import java.util.concurrent.CompletableFuture

interface IpRecordServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: IpRecordCreateParams): CompletableFuture<IpRecord> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: IpRecordCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IpRecord>

    fun retrieve(params: IpRecordRetrieveParams): CompletableFuture<IpRecord> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: IpRecordRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IpRecord>

    fun update(params: IpRecordUpdateParams): CompletableFuture<IpRecord> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: IpRecordUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IpRecord>

    fun list(): CompletableFuture<IpRecordListResponse> = list(IpRecordListParams.none())

    /** @see [list] */
    fun list(params: IpRecordListParams = IpRecordListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IpRecordListResponse>

    /** @see [list] */
    fun list(params: IpRecordListParams = IpRecordListParams.none()): CompletableFuture<IpRecordListResponse> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<IpRecordListResponse> = list(IpRecordListParams.none(), requestOptions)

    fun delete(params: IpRecordDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: IpRecordDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /**
     * A view of [IpRecordServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords`, but is otherwise the same
         * as [IpRecordServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: IpRecordCreateParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: IpRecordCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords/{Sid}`, but is otherwise the
         * same as [IpRecordServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: IpRecordRetrieveParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IpRecordRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords/{Sid}`, but is otherwise the
         * same as [IpRecordServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: IpRecordUpdateParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: IpRecordUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords`, but is otherwise the same
         * as [IpRecordServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<IpRecordListResponse>> = list(IpRecordListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: IpRecordListParams = IpRecordListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IpRecordListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: IpRecordListParams = IpRecordListParams.none()): CompletableFuture<HttpResponseFor<IpRecordListResponse>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IpRecordListResponse>> = list(IpRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/IpRecords/{Sid}`, but is otherwise
         * the same as [IpRecordServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: IpRecordDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: IpRecordDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
