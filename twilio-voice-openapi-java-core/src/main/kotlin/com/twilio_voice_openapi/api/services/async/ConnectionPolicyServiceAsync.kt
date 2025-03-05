// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async

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
import com.twilio_voice_openapi.api.services.async.connectionPolicies.TargetServiceAsync
import java.util.concurrent.CompletableFuture

interface ConnectionPolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun targets(): TargetServiceAsync

    @JvmOverloads
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    fun create(requestOptions: RequestOptions): CompletableFuture<ConnectionPolicy> =
        create(ConnectionPolicyCreateParams.none(), requestOptions)

    @JvmOverloads
    fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    @JvmOverloads
    fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    @JvmOverloads
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyListResponse>

    fun list(requestOptions: RequestOptions): CompletableFuture<ConnectionPolicyListResponse> =
        list(ConnectionPolicyListParams.none(), requestOptions)

    @JvmOverloads
    fun delete(
        params: ConnectionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ConnectionPolicyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun targets(): TargetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            create(ConnectionPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>> =
            list(ConnectionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ConnectionPolicies/{Sid}`, but is otherwise
         * the same as [ConnectionPolicyServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
