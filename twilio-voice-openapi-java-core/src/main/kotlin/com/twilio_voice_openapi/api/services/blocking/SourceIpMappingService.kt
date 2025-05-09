// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

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

interface SourceIpMappingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: SourceIpMappingCreateParams): SourceIpMapping =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SourceIpMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    fun retrieve(sid: String): SourceIpMapping = retrieve(sid, SourceIpMappingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: SourceIpMappingRetrieveParams = SourceIpMappingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: SourceIpMappingRetrieveParams = SourceIpMappingRetrieveParams.none(),
    ): SourceIpMapping = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SourceIpMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    /** @see [retrieve] */
    fun retrieve(params: SourceIpMappingRetrieveParams): SourceIpMapping =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(sid: String, requestOptions: RequestOptions): SourceIpMapping =
        retrieve(sid, SourceIpMappingRetrieveParams.none(), requestOptions)

    fun update(sid: String, params: SourceIpMappingUpdateParams): SourceIpMapping =
        update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: SourceIpMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping = update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(params: SourceIpMappingUpdateParams): SourceIpMapping =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SourceIpMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    fun list(): SourceIpMappingListResponse = list(SourceIpMappingListParams.none())

    /** @see [list] */
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMappingListResponse

    /** @see [list] */
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none()
    ): SourceIpMappingListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SourceIpMappingListResponse =
        list(SourceIpMappingListParams.none(), requestOptions)

    fun delete(sid: String) = delete(sid, SourceIpMappingDeleteParams.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: SourceIpMappingDeleteParams = SourceIpMappingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        sid: String,
        params: SourceIpMappingDeleteParams = SourceIpMappingDeleteParams.none(),
    ) = delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: SourceIpMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    fun delete(params: SourceIpMappingDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(sid: String, requestOptions: RequestOptions) =
        delete(sid, SourceIpMappingDeleteParams.none(), requestOptions)

    /**
     * A view of [SourceIpMappingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingService.create].
         */
        @MustBeClosed
        fun create(params: SourceIpMappingCreateParams): HttpResponseFor<SourceIpMapping> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SourceIpMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sid: String): HttpResponseFor<SourceIpMapping> =
            retrieve(sid, SourceIpMappingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: SourceIpMappingRetrieveParams = SourceIpMappingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: SourceIpMappingRetrieveParams = SourceIpMappingRetrieveParams.none(),
        ): HttpResponseFor<SourceIpMapping> = retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SourceIpMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: SourceIpMappingRetrieveParams): HttpResponseFor<SourceIpMapping> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SourceIpMapping> =
            retrieve(sid, SourceIpMappingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.update].
         */
        @MustBeClosed
        fun update(
            sid: String,
            params: SourceIpMappingUpdateParams,
        ): HttpResponseFor<SourceIpMapping> = update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: SourceIpMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping> =
            update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: SourceIpMappingUpdateParams): HttpResponseFor<SourceIpMapping> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SourceIpMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SourceIpMappingListResponse> =
            list(SourceIpMappingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMappingListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none()
        ): HttpResponseFor<SourceIpMappingListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SourceIpMappingListResponse> =
            list(SourceIpMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.delete].
         */
        @MustBeClosed
        fun delete(sid: String): HttpResponse = delete(sid, SourceIpMappingDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: SourceIpMappingDeleteParams = SourceIpMappingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: SourceIpMappingDeleteParams = SourceIpMappingDeleteParams.none(),
        ): HttpResponse = delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: SourceIpMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: SourceIpMappingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(sid: String, requestOptions: RequestOptions): HttpResponse =
            delete(sid, SourceIpMappingDeleteParams.none(), requestOptions)
    }
}
