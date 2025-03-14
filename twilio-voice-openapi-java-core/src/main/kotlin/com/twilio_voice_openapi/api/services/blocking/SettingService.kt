// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.settings.SettingRetrieveParams
import com.twilio_voice_openapi.api.models.settings.SettingUpdateParams
import com.twilio_voice_openapi.api.models.settings.VoiceDialingPermissions

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing permissions inheritance for the sub-account */
    fun retrieve(): VoiceDialingPermissions = retrieve(SettingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDialingPermissions

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none()
    ): VoiceDialingPermissions = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): VoiceDialingPermissions =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /** Update voice dialing permissions inheritance for the sub-account */
    fun update(): VoiceDialingPermissions = update(SettingUpdateParams.none())

    /** @see [update] */
    fun update(
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDialingPermissions

    /** @see [update] */
    fun update(params: SettingUpdateParams = SettingUpdateParams.none()): VoiceDialingPermissions =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): VoiceDialingPermissions =
        update(SettingUpdateParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/Settings`, but is otherwise the same as
         * [SettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<VoiceDialingPermissions> =
            retrieve(SettingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDialingPermissions>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none()
        ): HttpResponseFor<VoiceDialingPermissions> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<VoiceDialingPermissions> =
            retrieve(SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/Settings`, but is otherwise the same as
         * [SettingService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<VoiceDialingPermissions> = update(SettingUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDialingPermissions>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none()
        ): HttpResponseFor<VoiceDialingPermissions> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<VoiceDialingPermissions> =
            update(SettingUpdateParams.none(), requestOptions)
    }
}
