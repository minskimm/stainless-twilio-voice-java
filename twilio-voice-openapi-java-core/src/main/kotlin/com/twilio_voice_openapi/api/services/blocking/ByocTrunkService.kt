// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

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

    fun retrieve(params: ByocTrunkRetrieveParams): ByocTrunk =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ByocTrunkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    fun update(params: ByocTrunkUpdateParams): ByocTrunk = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ByocTrunkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

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

    fun delete(params: ByocTrunkDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ByocTrunkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
        fun retrieve(params: ByocTrunkRetrieveParams): HttpResponseFor<ByocTrunk> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ByocTrunkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkService.update].
         */
        @MustBeClosed
        fun update(params: ByocTrunkUpdateParams): HttpResponseFor<ByocTrunk> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ByocTrunkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

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
        fun delete(params: ByocTrunkDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ByocTrunkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
