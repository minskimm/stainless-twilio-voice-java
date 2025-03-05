// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.SourceIpMapping
import com.twilio_voice_openapi.api.models.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.SourceIpMappingListResponse
import com.twilio_voice_openapi.api.models.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.SourceIpMappingUpdateParams

interface SourceIpMappingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    @JvmOverloads
    fun create(
        params: SourceIpMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    @JvmOverloads
    fun retrieve(
        params: SourceIpMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    @JvmOverloads
    fun update(
        params: SourceIpMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMapping

    @JvmOverloads
    fun list(
        params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceIpMappingListResponse

    fun list(requestOptions: RequestOptions): SourceIpMappingListResponse =
        list(SourceIpMappingListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: SourceIpMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SourceIpMappingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SourceIpMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: SourceIpMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /**
         * Returns a raw HTTP response for `post /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: SourceIpMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMapping>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: SourceIpMappingListParams = SourceIpMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceIpMappingListResponse>

        /**
         * Returns a raw HTTP response for `get /v1/SourceIpMappings`, but is otherwise the same as
         * [SourceIpMappingService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SourceIpMappingListResponse> =
            list(SourceIpMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/SourceIpMappings/{Sid}`, but is otherwise the
         * same as [SourceIpMappingService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: SourceIpMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
