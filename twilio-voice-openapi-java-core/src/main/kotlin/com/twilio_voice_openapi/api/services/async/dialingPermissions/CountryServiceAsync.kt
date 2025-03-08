// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(
        params: DialingPermissionCountryRetrieveParams
    ): CompletableFuture<DialingPermissionCountryRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DialingPermissionCountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCountryRetrieveResponse>

    /** Retrieve all voice dialing country permissions for this account */
    fun list(): CompletableFuture<DialingPermissionCountryListResponse> =
        list(DialingPermissionCountryListParams.none())

    /** @see [list] */
    fun list(
        params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialingPermissionCountryListResponse>

    /** @see [list] */
    fun list(
        params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none()
    ): CompletableFuture<DialingPermissionCountryListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DialingPermissionCountryListResponse> =
        list(DialingPermissionCountryListParams.none(), requestOptions)

    /**
     * Fetch the high-risk special services prefixes from the country resource corresponding to the
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    fun fetchHighRiskSpecialPrefixes(
        params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
    ): CompletableFuture<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
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
        @MustBeClosed
        fun retrieve(
            params: DialingPermissionCountryRetrieveParams
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DialingPermissionCountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries`, but is otherwise
         * the same as [CountryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>> =
            list(DialingPermissionCountryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DialingPermissionCountryListParams = DialingPermissionCountryListParams.none()
        ): CompletableFuture<HttpResponseFor<DialingPermissionCountryListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
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
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
        ): CompletableFuture<
            HttpResponseFor<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>
        > = fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: DialingPermissionCountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse>
        >
    }
}
