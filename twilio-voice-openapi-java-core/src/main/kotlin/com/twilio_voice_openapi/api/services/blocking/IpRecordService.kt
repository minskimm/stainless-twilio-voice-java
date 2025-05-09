// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

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

interface IpRecordService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: IpRecordCreateParams): IpRecord = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: IpRecordCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecord

    fun retrieve(sid: String): IpRecord = retrieve(sid, IpRecordRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecord = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
    ): IpRecord = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: IpRecordRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecord

    /** @see [retrieve] */
    fun retrieve(params: IpRecordRetrieveParams): IpRecord = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(sid: String, requestOptions: RequestOptions): IpRecord =
        retrieve(sid, IpRecordRetrieveParams.none(), requestOptions)

    fun update(sid: String): IpRecord = update(sid, IpRecordUpdateParams.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecord = update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(sid: String, params: IpRecordUpdateParams = IpRecordUpdateParams.none()): IpRecord =
        update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: IpRecordUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecord

    /** @see [update] */
    fun update(params: IpRecordUpdateParams): IpRecord = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(sid: String, requestOptions: RequestOptions): IpRecord =
        update(sid, IpRecordUpdateParams.none(), requestOptions)

    fun list(): IpRecordListResponse = list(IpRecordListParams.none())

    /** @see [list] */
    fun list(
        params: IpRecordListParams = IpRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRecordListResponse

    /** @see [list] */
    fun list(params: IpRecordListParams = IpRecordListParams.none()): IpRecordListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): IpRecordListResponse =
        list(IpRecordListParams.none(), requestOptions)

    fun delete(sid: String) = delete(sid, IpRecordDeleteParams.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(sid: String, params: IpRecordDeleteParams = IpRecordDeleteParams.none()) =
        delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: IpRecordDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see [delete] */
    fun delete(params: IpRecordDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(sid: String, requestOptions: RequestOptions) =
        delete(sid, IpRecordDeleteParams.none(), requestOptions)

    /** A view of [IpRecordService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords`, but is otherwise the same as
         * [IpRecordService.create].
         */
        @MustBeClosed
        fun create(params: IpRecordCreateParams): HttpResponseFor<IpRecord> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: IpRecordCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecord>

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sid: String): HttpResponseFor<IpRecord> =
            retrieve(sid, IpRecordRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecord> = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: IpRecordRetrieveParams = IpRecordRetrieveParams.none(),
        ): HttpResponseFor<IpRecord> = retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IpRecordRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecord>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IpRecordRetrieveParams): HttpResponseFor<IpRecord> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(sid: String, requestOptions: RequestOptions): HttpResponseFor<IpRecord> =
            retrieve(sid, IpRecordRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/IpRecords/{Sid}`, but is otherwise the same as
         * [IpRecordService.update].
         */
        @MustBeClosed
        fun update(sid: String): HttpResponseFor<IpRecord> =
            update(sid, IpRecordUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecord> = update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: IpRecordUpdateParams = IpRecordUpdateParams.none(),
        ): HttpResponseFor<IpRecord> = update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: IpRecordUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecord>

        /** @see [update] */
        @MustBeClosed
        fun update(params: IpRecordUpdateParams): HttpResponseFor<IpRecord> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(sid: String, requestOptions: RequestOptions): HttpResponseFor<IpRecord> =
            update(sid, IpRecordUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/IpRecords`, but is otherwise the same as
         * [IpRecordService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IpRecordListResponse> = list(IpRecordListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IpRecordListParams = IpRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRecordListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IpRecordListParams = IpRecordListParams.none()
        ): HttpResponseFor<IpRecordListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IpRecordListResponse> =
            list(IpRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/IpRecords/{Sid}`, but is otherwise the same
         * as [IpRecordService.delete].
         */
        @MustBeClosed
        fun delete(sid: String): HttpResponse = delete(sid, IpRecordDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: IpRecordDeleteParams = IpRecordDeleteParams.none(),
        ): HttpResponse = delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: IpRecordDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: IpRecordDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(sid: String, requestOptions: RequestOptions): HttpResponse =
            delete(sid, IpRecordDeleteParams.none(), requestOptions)
    }
}
