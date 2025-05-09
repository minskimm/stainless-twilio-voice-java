// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

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
import com.twilio_voice_openapi.api.services.async.connectionpolicies.TargetServiceAsync
import java.util.concurrent.CompletableFuture

interface ConnectionPolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun targets(): TargetServiceAsync

    fun create(): CompletableFuture<ConnectionPolicy> = create(ConnectionPolicyCreateParams.none())

    /** @see [create] */
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    /** @see [create] */
    fun create(
        params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none()
    ): CompletableFuture<ConnectionPolicy> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ConnectionPolicy> =
        create(ConnectionPolicyCreateParams.none(), requestOptions)

    fun retrieve(sid: String): CompletableFuture<ConnectionPolicy> =
        retrieve(sid, ConnectionPolicyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: ConnectionPolicyRetrieveParams = ConnectionPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy> =
        retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: ConnectionPolicyRetrieveParams = ConnectionPolicyRetrieveParams.none(),
    ): CompletableFuture<ConnectionPolicy> = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ConnectionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    /** @see [retrieve] */
    fun retrieve(params: ConnectionPolicyRetrieveParams): CompletableFuture<ConnectionPolicy> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(sid: String, requestOptions: RequestOptions): CompletableFuture<ConnectionPolicy> =
        retrieve(sid, ConnectionPolicyRetrieveParams.none(), requestOptions)

    fun update(sid: String): CompletableFuture<ConnectionPolicy> =
        update(sid, ConnectionPolicyUpdateParams.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: ConnectionPolicyUpdateParams = ConnectionPolicyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy> =
        update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(
        sid: String,
        params: ConnectionPolicyUpdateParams = ConnectionPolicyUpdateParams.none(),
    ): CompletableFuture<ConnectionPolicy> = update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ConnectionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicy>

    /** @see [update] */
    fun update(params: ConnectionPolicyUpdateParams): CompletableFuture<ConnectionPolicy> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(sid: String, requestOptions: RequestOptions): CompletableFuture<ConnectionPolicy> =
        update(sid, ConnectionPolicyUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<ConnectionPolicyListResponse> =
        list(ConnectionPolicyListParams.none())

    /** @see [list] */
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyListResponse>

    /** @see [list] */
    fun list(
        params: ConnectionPolicyListParams = ConnectionPolicyListParams.none()
    ): CompletableFuture<ConnectionPolicyListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConnectionPolicyListResponse> =
        list(ConnectionPolicyListParams.none(), requestOptions)

    fun delete(sid: String): CompletableFuture<Void?> =
        delete(sid, ConnectionPolicyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: ConnectionPolicyDeleteParams = ConnectionPolicyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        sid: String,
        params: ConnectionPolicyDeleteParams = ConnectionPolicyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ConnectionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: ConnectionPolicyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(sid: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(sid, ConnectionPolicyDeleteParams.none(), requestOptions)

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
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            create(ConnectionPolicyCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ConnectionPolicyCreateParams = ConnectionPolicyCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            create(ConnectionPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(sid: String): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            retrieve(sid, ConnectionPolicyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: ConnectionPolicyRetrieveParams = ConnectionPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: ConnectionPolicyRetrieveParams = ConnectionPolicyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConnectionPolicyRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            retrieve(sid, ConnectionPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/ConnectionPolicies/{Sid}`, but is otherwise the
         * same as [ConnectionPolicyServiceAsync.update].
         */
        @MustBeClosed
        fun update(sid: String): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            update(sid, ConnectionPolicyUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: ConnectionPolicyUpdateParams = ConnectionPolicyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: ConnectionPolicyUpdateParams = ConnectionPolicyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ConnectionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ConnectionPolicyUpdateParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicy>> =
            update(sid, ConnectionPolicyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ConnectionPolicies`, but is otherwise the same
         * as [ConnectionPolicyServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>> =
            list(ConnectionPolicyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ConnectionPolicyListParams = ConnectionPolicyListParams.none()
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyListResponse>> =
            list(ConnectionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ConnectionPolicies/{Sid}`, but is otherwise
         * the same as [ConnectionPolicyServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(sid: String): CompletableFuture<HttpResponse> =
            delete(sid, ConnectionPolicyDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: ConnectionPolicyDeleteParams = ConnectionPolicyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: ConnectionPolicyDeleteParams = ConnectionPolicyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ConnectionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ConnectionPolicyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(sid: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(sid, ConnectionPolicyDeleteParams.none(), requestOptions)
    }
}
