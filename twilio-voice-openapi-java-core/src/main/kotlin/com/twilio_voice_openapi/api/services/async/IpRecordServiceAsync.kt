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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: IpRecordCreateParams): CompletableFuture<IpRecord> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: IpRecordCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    fun retrieve(sid: String): CompletableFuture<IpRecord> =
        retrieve(sid, IpRecordRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord> = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
    ): CompletableFuture<IpRecord> = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: IpRecordRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    /** @see [retrieve] */
    fun retrieve(params: IpRecordRetrieveParams): CompletableFuture<IpRecord> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(sid: String, requestOptions: RequestOptions): CompletableFuture<IpRecord> =
        retrieve(sid, IpRecordRetrieveParams.none(), requestOptions)

    fun update(sid: String): CompletableFuture<IpRecord> = update(sid, IpRecordUpdateParams.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord> = update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(
        sid: String,
        params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
    ): CompletableFuture<IpRecord> = update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: IpRecordUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecord>

    /** @see [update] */
    fun update(params: IpRecordUpdateParams): CompletableFuture<IpRecord> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(sid: String, requestOptions: RequestOptions): CompletableFuture<IpRecord> =
        update(sid, IpRecordUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<IpRecordListResponse> = list(IpRecordListParams.none())

    /** @see [list] */
    fun list(
        params: IpRecordListParams = IpRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRecordListResponse>

    /** @see [list] */
    fun list(
        params: IpRecordListParams = IpRecordListParams.none()
    ): CompletableFuture<IpRecordListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<IpRecordListResponse> =
        list(IpRecordListParams.none(), requestOptions)

    fun delete(sid: String): CompletableFuture<Void?> = delete(sid, IpRecordDeleteParams.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        sid: String,
        params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: IpRecordDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: IpRecordDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(sid: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(sid, IpRecordDeleteParams.none(), requestOptions)

    /**
     * A view of [IpRecordServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords`, but is otherwise the same as
         * [IpRecordServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: IpRecordCreateParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: IpRecordCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(sid: String): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(sid, IpRecordRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IpRecordRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IpRecordRetrieveParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecord>> =
            retrieve(sid, IpRecordRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordServiceAsync.update].
         */
        @MustBeClosed
        fun update(sid: String): CompletableFuture<HttpResponseFor<IpRecord>> =
            update(sid, IpRecordUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>> =
            update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>> = update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: IpRecordUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecord>>

        /** @see [update] */
        @MustBeClosed
        fun update(params: IpRecordUpdateParams): CompletableFuture<HttpResponseFor<IpRecord>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRecord>> =
            update(sid, IpRecordUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords`, but is otherwise the same as
         * [IpRecordServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<IpRecordListResponse>> =
            list(IpRecordListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IpRecordListParams = IpRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IpRecordListParams = IpRecordListParams.none()
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpRecordListResponse>> =
            list(IpRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/IpRecords/{Sid}`, but is otherwise the same
         * as [IpRecordServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(sid: String): CompletableFuture<HttpResponse> =
            delete(sid, IpRecordDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: IpRecordDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: IpRecordDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(sid: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(sid, IpRecordDeleteParams.none(), requestOptions)
    }
}
