// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.DialingPermissionCreateBulkCountryUpdatesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCreateBulkCountryUpdatesResponse
import com.twilio_voice_openapi.api.services.async.dialingPermissions.CountryServiceAsync
import java.util.concurrent.CompletableFuture

interface DialingPermissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun countries(): CountryServiceAsync

    /**
     * Create a bulk update request to change voice dialing country permissions of one or more
     * countries identified by the corresponding
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    @JvmOverloads
    fun createBulkCountryUpdates(
        params: DialingPermissionCreateBulkCountryUpdatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCreateBulkCountryUpdatesResponse>

    /**
     * A view of [DialingPermissionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun countries(): CountryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/DialingPermissions/BulkCountryUpdates`, but is
         * otherwise the same as [DialingPermissionServiceAsync.createBulkCountryUpdates].
         */
        @JvmOverloads
        @MustBeClosed
        fun createBulkCountryUpdates(
            params: DialingPermissionCreateBulkCountryUpdatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissionCreateBulkCountryUpdatesResponse>>
    }
}
