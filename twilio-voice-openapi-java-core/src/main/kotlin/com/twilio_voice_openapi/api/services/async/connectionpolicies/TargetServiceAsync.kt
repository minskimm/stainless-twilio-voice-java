// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.connectionpolicies

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.ConnectionPolicyTarget
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetDeleteParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetListResponse
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetRetrieveParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetUpdateParams
import java.util.concurrent.CompletableFuture

interface TargetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(
        connectionPolicySid: String,
        params: TargetCreateParams,
    ): CompletableFuture<ConnectionPolicyTarget> =
        create(connectionPolicySid, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        connectionPolicySid: String,
        params: TargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget> =
        create(params.toBuilder().connectionPolicySid(connectionPolicySid).build(), requestOptions)

    /** @see [create] */
    fun create(params: TargetCreateParams): CompletableFuture<ConnectionPolicyTarget> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun retrieve(
        sid: String,
        params: TargetRetrieveParams,
    ): CompletableFuture<ConnectionPolicyTarget> = retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: TargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget> =
        retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: TargetRetrieveParams): CompletableFuture<ConnectionPolicyTarget> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun update(sid: String, params: TargetUpdateParams): CompletableFuture<ConnectionPolicyTarget> =
        update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: TargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget> =
        update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(params: TargetUpdateParams): CompletableFuture<ConnectionPolicyTarget> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionPolicyTarget>

    fun list(connectionPolicySid: String): CompletableFuture<TargetListResponse> =
        list(connectionPolicySid, TargetListParams.none())

    /** @see [list] */
    fun list(
        connectionPolicySid: String,
        params: TargetListParams = TargetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TargetListResponse> =
        list(params.toBuilder().connectionPolicySid(connectionPolicySid).build(), requestOptions)

    /** @see [list] */
    fun list(
        connectionPolicySid: String,
        params: TargetListParams = TargetListParams.none(),
    ): CompletableFuture<TargetListResponse> =
        list(connectionPolicySid, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TargetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TargetListResponse>

    /** @see [list] */
    fun list(params: TargetListParams): CompletableFuture<TargetListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        connectionPolicySid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TargetListResponse> =
        list(connectionPolicySid, TargetListParams.none(), requestOptions)

    fun delete(sid: String, params: TargetDeleteParams): CompletableFuture<Void?> =
        delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: TargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: TargetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TargetDeleteParams,
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
            connectionPolicySid: String,
            params: TargetCreateParams,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            create(connectionPolicySid, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            connectionPolicySid: String,
            params: TargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            create(
                params.toBuilder().connectionPolicySid(connectionPolicySid).build(),
                requestOptions,
            )

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TargetCreateParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: TargetRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: TargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TargetRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            sid: String,
            params: TargetUpdateParams,
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: TargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TargetUpdateParams
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionPolicyTarget>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            connectionPolicySid: String
        ): CompletableFuture<HttpResponseFor<TargetListResponse>> =
            list(connectionPolicySid, TargetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            params: TargetListParams = TargetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TargetListResponse>> =
            list(
                params.toBuilder().connectionPolicySid(connectionPolicySid).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            params: TargetListParams = TargetListParams.none(),
        ): CompletableFuture<HttpResponseFor<TargetListResponse>> =
            list(connectionPolicySid, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TargetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TargetListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TargetListParams): CompletableFuture<HttpResponseFor<TargetListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TargetListResponse>> =
            list(connectionPolicySid, TargetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(sid: String, params: TargetDeleteParams): CompletableFuture<HttpResponse> =
            delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: TargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: TargetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
