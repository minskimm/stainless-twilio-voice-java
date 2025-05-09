// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

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

interface ByocTrunkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(): ByocTrunk = create(ByocTrunkCreateParams.none())

    /** @see [create] */
    fun create(
        params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    /** @see [create] */
    fun create(params: ByocTrunkCreateParams = ByocTrunkCreateParams.none()): ByocTrunk =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ByocTrunk =
        create(ByocTrunkCreateParams.none(), requestOptions)

    fun retrieve(sid: String): ByocTrunk = retrieve(sid, ByocTrunkRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: ByocTrunkRetrieveParams = ByocTrunkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: ByocTrunkRetrieveParams = ByocTrunkRetrieveParams.none(),
    ): ByocTrunk = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ByocTrunkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    /** @see [retrieve] */
    fun retrieve(params: ByocTrunkRetrieveParams): ByocTrunk =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(sid: String, requestOptions: RequestOptions): ByocTrunk =
        retrieve(sid, ByocTrunkRetrieveParams.none(), requestOptions)

    fun update(sid: String): ByocTrunk = update(sid, ByocTrunkUpdateParams.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: ByocTrunkUpdateParams = ByocTrunkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk = update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(
        sid: String,
        params: ByocTrunkUpdateParams = ByocTrunkUpdateParams.none(),
    ): ByocTrunk = update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ByocTrunkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    /** @see [update] */
    fun update(params: ByocTrunkUpdateParams): ByocTrunk = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(sid: String, requestOptions: RequestOptions): ByocTrunk =
        update(sid, ByocTrunkUpdateParams.none(), requestOptions)

    fun list(): ByocTrunkListResponse = list(ByocTrunkListParams.none())

    /** @see [list] */
    fun list(
        params: ByocTrunkListParams = ByocTrunkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunkListResponse

    /** @see [list] */
    fun list(params: ByocTrunkListParams = ByocTrunkListParams.none()): ByocTrunkListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ByocTrunkListResponse =
        list(ByocTrunkListParams.none(), requestOptions)

    fun delete(sid: String) = delete(sid, ByocTrunkDeleteParams.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: ByocTrunkDeleteParams = ByocTrunkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(sid: String, params: ByocTrunkDeleteParams = ByocTrunkDeleteParams.none()) =
        delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ByocTrunkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    fun delete(params: ByocTrunkDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(sid: String, requestOptions: RequestOptions) =
        delete(sid, ByocTrunkDeleteParams.none(), requestOptions)

    /** A view of [ByocTrunkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ByocTrunk> = create(ByocTrunkCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ByocTrunkCreateParams = ByocTrunkCreateParams.none()
        ): HttpResponseFor<ByocTrunk> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> =
            create(ByocTrunkCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sid: String): HttpResponseFor<ByocTrunk> =
            retrieve(sid, ByocTrunkRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: ByocTrunkRetrieveParams = ByocTrunkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: ByocTrunkRetrieveParams = ByocTrunkRetrieveParams.none(),
        ): HttpResponseFor<ByocTrunk> = retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ByocTrunkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ByocTrunkRetrieveParams): HttpResponseFor<ByocTrunk> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(sid: String, requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> =
            retrieve(sid, ByocTrunkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkService.update].
         */
        @MustBeClosed
        fun update(sid: String): HttpResponseFor<ByocTrunk> =
            update(sid, ByocTrunkUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: ByocTrunkUpdateParams = ByocTrunkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk> = update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: ByocTrunkUpdateParams = ByocTrunkUpdateParams.none(),
        ): HttpResponseFor<ByocTrunk> = update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ByocTrunkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /** @see [update] */
        @MustBeClosed
        fun update(params: ByocTrunkUpdateParams): HttpResponseFor<ByocTrunk> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(sid: String, requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> =
            update(sid, ByocTrunkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ByocTrunkListResponse> = list(ByocTrunkListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ByocTrunkListParams = ByocTrunkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunkListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ByocTrunkListParams = ByocTrunkListParams.none()
        ): HttpResponseFor<ByocTrunkListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ByocTrunkListResponse> =
            list(ByocTrunkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ByocTrunks/{Sid}`, but is otherwise the same
         * as [ByocTrunkService.delete].
         */
        @MustBeClosed
        fun delete(sid: String): HttpResponse = delete(sid, ByocTrunkDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: ByocTrunkDeleteParams = ByocTrunkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: ByocTrunkDeleteParams = ByocTrunkDeleteParams.none(),
        ): HttpResponse = delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ByocTrunkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ByocTrunkDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(sid: String, requestOptions: RequestOptions): HttpResponse =
            delete(sid, ByocTrunkDeleteParams.none(), requestOptions)
    }
}
