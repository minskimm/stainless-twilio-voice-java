// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.async.dialingPermissions

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListResponse
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveResponse
import java.util.concurrent.CompletableFuture

interface CountryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing country permissions identified by the given ISO country code */
    @JvmOverloads
    fun retrieve(
        params: DialingPermissionCountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCountryRetrieveResponse>

    /** Retrieve all voice dialing country permissions for this account */
    @JvmOverloads
    fun list(
        params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCountryListResponse>

    /** Retrieve all voice dialing country permissions for this account */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DialingPermissionCountryListResponse> =
        list(DialingPermissionCountryListParams.none(), requestOptions)

    /**
     * Fetch the high-risk special services prefixes from the country resource corresponding to the
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    @JvmOverloads
    fun fetchHighRiskSpecialPrefixes(
        params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>

    /**
     * A view of [CountryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries/{IsoCode}`, but is
         * otherwise the same as [CountryServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DialingPermissionCountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries`, but is otherwise
         * the same as [CountryServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries`, but is otherwise
         * the same as [CountryServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>> =
            list(DialingPermissionCountryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes`, but is otherwise the
         * same as [CountryServiceAsync.fetchHighRiskSpecialPrefixes].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>
        >
    }
}
