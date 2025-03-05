// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.blocking.connectionPolicies

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.ConnectionPolicyTarget
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetCreateParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetDeleteParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetListResponse
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetRetrieveParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyTargetUpdateParams

interface TargetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    @JvmOverloads
    fun create(
        params: ConnectionPolicyTargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    @JvmOverloads
    fun retrieve(
        params: ConnectionPolicyTargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    @JvmOverloads
    fun update(
        params: ConnectionPolicyTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    @JvmOverloads
    fun list(
        params: ConnectionPolicyTargetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTargetListResponse

    @JvmOverloads
    fun delete(
        params: ConnectionPolicyTargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TargetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ConnectionPolicyTargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyTargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ConnectionPolicyTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionPolicyTargetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTargetListResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyTargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
