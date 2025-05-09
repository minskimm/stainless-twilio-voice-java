// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.dialingpermissions

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListResponse
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryRetrieveResponse

interface CountryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve voice dialing country permissions identified by the given ISO country code */
    fun retrieve(isoCode: String): CountryRetrieveResponse =
        retrieve(isoCode, CountryRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        isoCode: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryRetrieveResponse =
        retrieve(params.toBuilder().isoCode(isoCode).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        isoCode: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
    ): CountryRetrieveResponse = retrieve(isoCode, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: CountryRetrieveParams): CountryRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(isoCode: String, requestOptions: RequestOptions): CountryRetrieveResponse =
        retrieve(isoCode, CountryRetrieveParams.none(), requestOptions)

    /** Retrieve all voice dialing country permissions for this account */
    fun list(): CountryListResponse = list(CountryListParams.none())

    /** @see [list] */
    fun list(
        params: CountryListParams = CountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryListResponse

    /** @see [list] */
    fun list(params: CountryListParams = CountryListParams.none()): CountryListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CountryListResponse =
        list(CountryListParams.none(), requestOptions)

    /**
     * Fetch the high-risk special services prefixes from the country resource corresponding to the
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    fun fetchHighRiskSpecialPrefixes(isoCode: String): CountryFetchHighRiskSpecialPrefixesResponse =
        fetchHighRiskSpecialPrefixes(isoCode, CountryFetchHighRiskSpecialPrefixesParams.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        params: CountryFetchHighRiskSpecialPrefixesParams =
            CountryFetchHighRiskSpecialPrefixesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryFetchHighRiskSpecialPrefixesResponse =
        fetchHighRiskSpecialPrefixes(params.toBuilder().isoCode(isoCode).build(), requestOptions)

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        params: CountryFetchHighRiskSpecialPrefixesParams =
            CountryFetchHighRiskSpecialPrefixesParams.none(),
    ): CountryFetchHighRiskSpecialPrefixesResponse =
        fetchHighRiskSpecialPrefixes(isoCode, params, RequestOptions.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryFetchHighRiskSpecialPrefixesResponse

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        params: CountryFetchHighRiskSpecialPrefixesParams
    ): CountryFetchHighRiskSpecialPrefixesResponse =
        fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

    /** @see [fetchHighRiskSpecialPrefixes] */
    fun fetchHighRiskSpecialPrefixes(
        isoCode: String,
        requestOptions: RequestOptions,
    ): CountryFetchHighRiskSpecialPrefixesResponse =
        fetchHighRiskSpecialPrefixes(
            isoCode,
            CountryFetchHighRiskSpecialPrefixesParams.none(),
            requestOptions,
        )

    /** A view of [CountryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries/{IsoCode}`, but is
         * otherwise the same as [CountryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(isoCode: String): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(isoCode, CountryRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(params.toBuilder().isoCode(isoCode).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
        ): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(isoCode, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CountryRetrieveParams): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            isoCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(isoCode, CountryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/DialingPermissions/Countries`, but is otherwise
         * the same as [CountryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CountryListResponse> = list(CountryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none()
        ): HttpResponseFor<CountryListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CountryListResponse> =
            list(CountryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/DialingPermissions/Countries/{IsoCode}/HighRiskSpecialPrefixes`, but is otherwise the
         * same as [CountryService.fetchHighRiskSpecialPrefixes].
         */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> =
            fetchHighRiskSpecialPrefixes(isoCode, CountryFetchHighRiskSpecialPrefixesParams.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String,
            params: CountryFetchHighRiskSpecialPrefixesParams =
                CountryFetchHighRiskSpecialPrefixesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> =
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
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> =
            fetchHighRiskSpecialPrefixes(isoCode, params, RequestOptions.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse>

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            params: CountryFetchHighRiskSpecialPrefixesParams
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> =
            fetchHighRiskSpecialPrefixes(params, RequestOptions.none())

        /** @see [fetchHighRiskSpecialPrefixes] */
        @MustBeClosed
        fun fetchHighRiskSpecialPrefixes(
            isoCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryFetchHighRiskSpecialPrefixesResponse> =
            fetchHighRiskSpecialPrefixes(
                isoCode,
                CountryFetchHighRiskSpecialPrefixesParams.none(),
                requestOptions,
            )
    }
}
