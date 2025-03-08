// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.connectionPolicies

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
import java.util.concurrent.CompletableFuture

interface TargetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(
        params: ConnectionPolicyTargetCreateParams
    ): CompletableFuture<ConnectionPolicyTarget> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ConnectionPolicyTargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun retrieve(
        params: ConnectionPolicyTargetRetrieveParams
    ): CompletableFuture<ConnectionPolicyTarget> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ConnectionPolicyTargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun update(
        params: ConnectionPolicyTargetUpdateParams
    ): CompletableFuture<ConnectionPolicyTarget> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ConnectionPolicyTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun list(
        params: ConnectionPolicyTargetListParams
    ): CompletableFuture<ConnectionPolicyTargetListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ConnectionPolicyTargetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTargetListResponse>

    fun delete(params: ConnectionPolicyTargetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ConnectionPolicyTargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TargetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyTargetCreateParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyTargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyTargetRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyTargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ConnectionPolicyTargetUpdateParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ConnectionPolicyTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyTargetListParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTargetListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyTargetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTargetListResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ConnectionPolicyTargetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyTargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
