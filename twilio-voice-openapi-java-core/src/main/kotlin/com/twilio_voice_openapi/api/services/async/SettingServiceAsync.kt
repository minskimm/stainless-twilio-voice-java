// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.DialingPermissions
import com.twilio_voice_openapi.api.models.SettingRetrieveParams
import com.twilio_voice_openapi.api.models.SettingUpdateParams
import java.util.concurrent.CompletableFuture

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing permissions inheritance for the sub-account */
    fun retrieve(): CompletableFuture<DialingPermissions> = retrieve(SettingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissions>

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none()
    ): CompletableFuture<DialingPermissions> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<DialingPermissions> =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /** Update voice dialing permissions inheritance for the sub-account */
    fun update(): CompletableFuture<DialingPermissions> = update(SettingUpdateParams.none())

    /** @see [update] */
    fun update(
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissions>

    /** @see [update] */
    fun update(
        params: SettingUpdateParams = SettingUpdateParams.none()
    ): CompletableFuture<DialingPermissions> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<DialingPermissions> =
        update(SettingUpdateParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/Settings`, but is otherwise the same as
         * [SettingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            retrieve(SettingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissions>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            retrieve(SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/Settings`, but is otherwise the same as
         * [SettingServiceAsync.update].
         */
        @MustBeClosed
        fun update(): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            update(SettingUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissions>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DialingPermissions>> =
            update(SettingUpdateParams.none(), requestOptions)
    }
}
