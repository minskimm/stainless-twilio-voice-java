// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.settings.DialingPermissions
import com.twilio_voice_openapi.api.models.settings.SettingRetrieveParams
import com.twilio_voice_openapi.api.models.settings.SettingUpdateParams

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing permissions inheritance for the sub-account */
    fun retrieve(): DialingPermissions = retrieve(SettingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialingPermissions

    /** @see [retrieve] */
    fun retrieve(params: SettingRetrieveParams = SettingRetrieveParams.none()): DialingPermissions =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): DialingPermissions =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /** Update voice dialing permissions inheritance for the sub-account */
    fun update(): DialingPermissions = update(SettingUpdateParams.none())

    /** @see [update] */
    fun update(
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialingPermissions

    /** @see [update] */
    fun update(params: SettingUpdateParams = SettingUpdateParams.none()): DialingPermissions =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): DialingPermissions =
        update(SettingUpdateParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/Settings`, but is otherwise the same as
         * [SettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<DialingPermissions> = retrieve(SettingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialingPermissions>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none()
        ): HttpResponseFor<DialingPermissions> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<DialingPermissions> =
            retrieve(SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/Settings`, but is otherwise the same as
         * [SettingService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<DialingPermissions> = update(SettingUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialingPermissions>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none()
        ): HttpResponseFor<DialingPermissions> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<DialingPermissions> =
            update(SettingUpdateParams.none(), requestOptions)
    }
}
