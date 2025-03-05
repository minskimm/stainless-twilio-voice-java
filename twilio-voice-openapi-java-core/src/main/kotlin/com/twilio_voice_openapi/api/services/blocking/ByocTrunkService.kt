// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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

    @JvmOverloads
    fun create(
        params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    fun create(requestOptions: RequestOptions): ByocTrunk =
        create(ByocTrunkCreateParams.none(), requestOptions)

    @JvmOverloads
    fun retrieve(
        params: ByocTrunkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    @JvmOverloads
    fun update(
        params: ByocTrunkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunk

    @JvmOverloads
    fun list(
        params: ByocTrunkListParams = ByocTrunkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByocTrunkListResponse

    fun list(requestOptions: RequestOptions): ByocTrunkListResponse =
        list(ByocTrunkListParams.none(), requestOptions)

    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ByocTrunkCreateParams = ByocTrunkCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> =
            create(ByocTrunkCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ByocTrunkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /**
         * Returns a raw HTTP response for `post /v1/ByocTrunks/{Sid}`, but is otherwise the same as
         * [ByocTrunkService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ByocTrunkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunk>

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ByocTrunkListParams = ByocTrunkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByocTrunkListResponse>

        /**
         * Returns a raw HTTP response for `get /v1/ByocTrunks`, but is otherwise the same as
         * [ByocTrunkService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ByocTrunkListResponse> =
            list(ByocTrunkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ByocTrunks/{Sid}`, but is otherwise the same
         * as [ByocTrunkService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ByocTrunkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
