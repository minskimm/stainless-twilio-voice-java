// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicy
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyDeleteParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListResponse
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyRetrieveParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyUpdateParams
import com.twilio_voice_openapi.api.services.blocking.connectionpolicies.TargetService

interface ConnectionPolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun targets(): TargetService

    fun create(): ConnectionPolicy = create(ConnectionPolicyCreateParams.none())

    /** @see [create] */
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    /** @see [create] */
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none()
    ): ConnectionPolicy = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ConnectionPolicy =
        create(ConnectionPolicyCreateParams.none(), requestOptions)

    fun retrieve(params: ConnectionPolicyRetrieveParams): ConnectionPolicy =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    fun update(params: ConnectionPolicyUpdateParams): ConnectionPolicy =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicy

    fun list(): ConnectionPolicyListResponse = list(ConnectionPolicyListParams.none())

    /** @see [list] */
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyListResponse

    /** @see [list] */
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none()
    ): ConnectionPolicyListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ConnectionPolicyListResponse =
        list(ConnectionPolicyListParams.none(), requestOptions)

    fun delete(params: ConnectionPolicyDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
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
        @MustBeClosed
        fun create(): HttpResponseFor<ConnectionPolicy> =
            create(ConnectionPolicyCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none()
        ): HttpResponseFor<ConnectionPolicy> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ConnectionPolicy> =
            create(ConnectionPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ConnectionPolicyRetrieveParams): HttpResponseFor<ConnectionPolicy> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyService.update].
         */
        @MustBeClosed
        fun update(params: ConnectionPolicyUpdateParams): HttpResponseFor<ConnectionPolicy> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicy>

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConnectionPolicyListResponse> =
            list(ConnectionPolicyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none()
        ): HttpResponseFor<ConnectionPolicyListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionPolicyListResponse> =
            list(ConnectionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ConnectionPolicies/{Sid}`, but is otherwise
         * the same as [ConnectionPolicyService.delete].
         */
        @MustBeClosed
        fun delete(params: ConnectionPolicyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
