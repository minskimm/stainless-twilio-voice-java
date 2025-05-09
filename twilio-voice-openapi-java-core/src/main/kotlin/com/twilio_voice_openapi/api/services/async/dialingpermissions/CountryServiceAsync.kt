// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.dialingpermissions

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveResponse
import java.util.concurrent.CompletableFuture

interface CountryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing country permissions identified by the given ISO country code */
    fun retrieve(isoCode: String): CompletableFuture<CountryRetrieveResponse> =
        retrieve(isoCode, CountryRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        isoCode: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryRetrieveResponse> =
        retrieve(params.toBuilder().isoCode(isoCode).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        isoCode: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
    ): CompletableFuture<CountryRetrieveResponse> = retrieve(isoCode, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: CountryRetrieveParams): CompletableFuture<CountryRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        isoCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryRetrieveResponse> =
        retrieve(isoCode, CountryRetrieveParams.none(), requestOptions)

    /** Retrieve all voice dialing country permissions for this account */
    fun list(): CompletableFuture<CountryListResponse> = list(CountryListParams.none())

    /** @see [list] */
    fun list(
        params: CountryListParams = CountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryListResponse>

    /** @see [list] */
    fun list(
        params: CountryListParams = CountryListParams.none()
    ): CompletableFuture<CountryListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CountryListResponse> =
        list(CountryListParams.none(), requestOptions)

    /**
     * Fetch the high-risk special services prefixes from the country resource corresponding to the
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(isoCode, CountryFetchHighRiskSpecialPrefixesParams.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        params: CountryFetchHighRiskSpecialPrefixesParams =
            CountryFetchHighRiskSpecialPrefixesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(params.toBuilder().isoCode(isoCode).build(), requestOptions)

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        params: CountryFetchHighRiskSpecialPrefixesParams =
            CountryFetchHighRiskSpecialPrefixesParams.none(),
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(isoCode, params, RequestOptions.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse>

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryFetchHighRiskSpecialPrefixesResponse> =
        fetchHighRiskSpecialPrefixes(
            isoCode,
            CountryFetchHighRiskSpecialPrefixesParams.none(),
            requestOptions,
        )

    /**
     * A view of [CountryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries/{IsoCode}`, but is
         * otherwise the same as [CountryServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(isoCode: String): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(isoCode, CountryRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(params.toBuilder().isoCode(isoCode).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(isoCode, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CountryRetrieveParams
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryRetrieveResponse>> =
            retrieve(isoCode, CountryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries`, but is otherwise
         * the same as [CountryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CountryListResponse>> =
            list(CountryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none()
        ): CompletableFuture<HttpResponseFor<CountryListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CountryListResponse>> =
            list(CountryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes`, but is otherwise the
         * same as [CountryServiceAsync.fetchHighRiskSpecialPrefixes].
         */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> =
            fetchHighRiskSpecialPrefixes(isoCode, CountryFetchHighRiskSpecialPrefixesParams.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String,
            params: CountryFetchHighRiskSpecialPrefixesParams =
                CountryFetchHighRiskSpecialPrefixesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> =
            fetchHighRiskSpecialPrefixes(
                params.toBuilder().isoCode(isoCode).build(),
                requestOptions,
            )

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String,
            params: CountryFetchHighRiskSpecialPrefixesParams =
                CountryFetchHighRiskSpecialPrefixesParams.none(),
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> =
            fetchHighRiskSpecialPrefixes(isoCode, params, RequestOptions.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>>

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> =
            fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>> =
            fetchHighRiskSpecialPrefixes(
                isoCode,
                CountryFetchHighRiskSpecialPrefixesParams.none(),
                requestOptions,
            )
    }
}
