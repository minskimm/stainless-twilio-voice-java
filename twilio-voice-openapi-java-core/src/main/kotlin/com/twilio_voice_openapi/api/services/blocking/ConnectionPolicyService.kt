// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.ConnectionPolicy
import com.twilio_voice_openapi.api.models.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyDeleteParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyListResponse
import com.twilio_voice_openapi.api.models.ConnectionPolicyRetrieveParams
import com.twilio_voice_openapi.api.models.ConnectionPolicyUpdateParams
import com.twilio_voice_openapi.api.services.blocking.connectionPolicies.TargetService

interface ConnectionPolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun targets(): TargetService

    @JvmOverloads
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    fun create(requestOptions: RequestOptions): ConnectionPolicy =
        create(ConnectionPolicyCreateParams.none(), requestOptions)

    @JvmOverloads
    fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    @JvmOverloads
    fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    @JvmOverloads
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyListResponse

    fun list(requestOptions: RequestOptions): ConnectionPolicyListResponse =
        list(ConnectionPolicyListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: ConnectionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ConnectionPolicyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun targets(): TargetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ConnectionPolicy> =
            create(ConnectionPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyListResponse>

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionPolicyListResponse> =
            list(ConnectionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ConnectionPolicies/{Sid}`, but is otherwise
         * the same as [ConnectionPolicyService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
