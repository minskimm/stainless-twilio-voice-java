// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesResponse
import com.twilio_voice_openapi.api.services.blocking.dialingpermissions.CountryService

interface DialingPermissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun countries(): CountryService

    /**
     * Create a bulk update request to change voice dialing country permissions of one or more
     * countries identified by the corresponding
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    fun createBulkCountryUpdates(
        params: DialingPermissionCreateBulkCountryUpdatesParams
    ): DialingPermissionCreateBulkCountryUpdatesResponse =
        createBulkCountryUpdates(params, RequestOptions.none())

    /** @see [createBulkCountryUpdates] */
    fun createBulkCountryUpdates(
        params: DialingPermissionCreateBulkCountryUpdatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialingPermissionCreateBulkCountryUpdatesResponse

    /**
     * A view of [DialingPermissionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun countries(): CountryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/DialingPermissions/BulkCountryUpdates`, but is
         * otherwise the same as [DialingPermissionService.createBulkCountryUpdates].
         */
        @MustBeClosed
        fun createBulkCountryUpdates(
            params: DialingPermissionCreateBulkCountryUpdatesParams
        ): HttpResponseFor<DialingPermissionCreateBulkCountryUpdatesResponse> =
            createBulkCountryUpdates(params, RequestOptions.none())

        /** @see [createBulkCountryUpdates] */
        @MustBeClosed
        fun createBulkCountryUpdates(
            params: DialingPermissionCreateBulkCountryUpdatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialingPermissionCreateBulkCountryUpdatesResponse>
    }
}
