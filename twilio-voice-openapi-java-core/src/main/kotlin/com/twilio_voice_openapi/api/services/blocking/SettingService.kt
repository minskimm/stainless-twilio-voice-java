// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.DialingPermissions
import com.twilio_voice_openapi.api.models.SettingRetrieveParams
import com.twilio_voice_openapi.api.models.SettingUpdateParams

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing permissions inheritance for the sub-account */
    @JvmOverloads
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialingPermissions

    /** Retrieve voice dialing permissions inheritance for the sub-account */
    fun retrieve(requestOptions: RequestOptions): DialingPermissions =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /** Update voice dialing permissions inheritance for the sub-account */
    @JvmOverloads
    fun update(
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialingPermissions

    /** Update voice dialing permissions inheritance for the sub-account */
    fun update(requestOptions: RequestOptions): DialingPermissions =
        update(SettingUpdateParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/Settings`, but is otherwise the same as
         * [SettingService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialingPermissions>

        /**
         * Returns a raw HTTP response for `get /v1/Settings`, but is otherwise the same as
         * [SettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<DialingPermissions> =
            retrieve(SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/Settings`, but is otherwise the same as
         * [SettingService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialingPermissions>

        /**
         * Returns a raw HTTP response for `post /v1/Settings`, but is otherwise the same as
         * [SettingService.update].
         */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<DialingPermissions> =
            update(SettingUpdateParams.none(), requestOptions)
    }
}
