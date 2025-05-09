// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.connectionpolicies

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

interface TargetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(connectionPolicySid: String, params: TargetCreateParams): ConnectionPolicyTarget =
        create(connectionPolicySid, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        connectionPolicySid: String,
        params: TargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget =
        create(params.toBuilder().connectionPolicySid(connectionPolicySid).build(), requestOptions)

    /** @see [create] */
    fun create(params: TargetCreateParams): ConnectionPolicyTarget =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    fun retrieve(sid: String, params: TargetRetrieveParams): ConnectionPolicyTarget =
        retrieve(sid, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        sid: String,
        params: TargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget = retrieve(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: TargetRetrieveParams): ConnectionPolicyTarget =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TargetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    fun update(sid: String, params: TargetUpdateParams): ConnectionPolicyTarget =
        update(sid, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        sid: String,
        params: TargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget = update(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [update] */
    fun update(params: TargetUpdateParams): ConnectionPolicyTarget =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionPolicyTarget

    fun list(connectionPolicySid: String): TargetListResponse =
        list(connectionPolicySid, TargetListParams.none())

    /** @see [list] */
    fun list(
        connectionPolicySid: String,
        params: TargetListParams = TargetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TargetListResponse =
        list(params.toBuilder().connectionPolicySid(connectionPolicySid).build(), requestOptions)

    /** @see [list] */
    fun list(
        connectionPolicySid: String,
        params: TargetListParams = TargetListParams.none(),
    ): TargetListResponse = list(connectionPolicySid, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TargetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TargetListResponse

    /** @see [list] */
    fun list(params: TargetListParams): TargetListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(connectionPolicySid: String, requestOptions: RequestOptions): TargetListResponse =
        list(connectionPolicySid, TargetListParams.none(), requestOptions)

    fun delete(sid: String, params: TargetDeleteParams) = delete(sid, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        sid: String,
        params: TargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sid(sid).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: TargetDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: TargetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TargetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetService.create].
         */
        @MustBeClosed
        fun create(
            connectionPolicySid: String,
            params: TargetCreateParams,
        ): HttpResponseFor<ConnectionPolicyTarget> =
            create(connectionPolicySid, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            connectionPolicySid: String,
            params: TargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget> =
            create(
                params.toBuilder().connectionPolicySid(connectionPolicySid).build(),
                requestOptions,
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: TargetCreateParams): HttpResponseFor<ConnectionPolicyTarget> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: TargetRetrieveParams,
        ): HttpResponseFor<ConnectionPolicyTarget> = retrieve(sid, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sid: String,
            params: TargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget> =
            retrieve(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: TargetRetrieveParams): HttpResponseFor<ConnectionPolicyTarget> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TargetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `post
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.update].
         */
        @MustBeClosed
        fun update(
            sid: String,
            params: TargetUpdateParams,
        ): HttpResponseFor<ConnectionPolicyTarget> = update(sid, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            sid: String,
            params: TargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget> =
            update(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: TargetUpdateParams): HttpResponseFor<ConnectionPolicyTarget> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionPolicyTarget>

        /**
         * Returns a raw HTTP response for `get
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets`, but is otherwise the same as
         * [TargetService.list].
         */
        @MustBeClosed
        fun list(connectionPolicySid: String): HttpResponseFor<TargetListResponse> =
            list(connectionPolicySid, TargetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            params: TargetListParams = TargetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TargetListResponse> =
            list(
                params.toBuilder().connectionPolicySid(connectionPolicySid).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            params: TargetListParams = TargetListParams.none(),
        ): HttpResponseFor<TargetListResponse> =
            list(connectionPolicySid, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TargetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TargetListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TargetListParams): HttpResponseFor<TargetListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            connectionPolicySid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TargetListResponse> =
            list(connectionPolicySid, TargetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}`, but is otherwise the same as
         * [TargetService.delete].
         */
        @MustBeClosed
        fun delete(sid: String, params: TargetDeleteParams): HttpResponse =
            delete(sid, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sid: String,
            params: TargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sid(sid).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: TargetDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
