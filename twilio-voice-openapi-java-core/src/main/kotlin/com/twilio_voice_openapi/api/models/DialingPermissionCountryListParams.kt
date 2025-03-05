// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.twilio_voice_openapi.api.core.NoAutoDetect
import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/** Retrieve all voice dialing country permissions for this account */
class DialingPermissionCountryListParams
private constructor(
    private val continent: String?,
    private val countryCode: String?,
    private val highRiskSpecialNumbersEnabled: Boolean?,
    private val highRiskTollfraudNumbersEnabled: Boolean?,
    private val isoCode: String?,
    private val lowRiskNumbersEnabled: Boolean?,
    private val page: Long?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter to retrieve the country permissions by specifying the continent */
    fun continent(): Optional<String> = Optional.ofNullable(continent)

    /**
     * Filter the results by specified
     * [country codes](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

    /**
     * Filter to retrieve the country permissions with dialing to high-risk special service numbers
     * enabled. Can be: `true` or `false`
     */
    fun highRiskSpecialNumbersEnabled(): Optional<Boolean> =
        Optional.ofNullable(highRiskSpecialNumbersEnabled)

    /**
     * Filter to retrieve the country permissions with dialing to high-risk
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
     * numbers enabled. Can be: `true` or `false`.
     */
    fun highRiskTollfraudNumbersEnabled(): Optional<Boolean> =
        Optional.ofNullable(highRiskTollfraudNumbersEnabled)

    /**
     * Filter to retrieve the country permissions by specifying the
     * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     */
    fun isoCode(): Optional<String> = Optional.ofNullable(isoCode)

    /**
     * Filter to retrieve the country permissions with dialing to low-risk numbers enabled. Can be:
     * `true` or `false`.
     */
    fun lowRiskNumbersEnabled(): Optional<Boolean> = Optional.ofNullable(lowRiskNumbersEnabled)

    /** The page index. This value is simply for client state. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /**
     * How many resources to return in each list page. The default is 50, and the maximum is 1000.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** The page token. This is provided by the API. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.continent?.let { queryParams.put("Continent", listOf(it.toString())) }
        this.countryCode?.let { queryParams.put("CountryCode", listOf(it.toString())) }
        this.highRiskSpecialNumbersEnabled?.let {
            queryParams.put("HighRiskSpecialNumbersEnabled", listOf(it.toString()))
        }
        this.highRiskTollfraudNumbersEnabled?.let {
            queryParams.put("HighRiskTollfraudNumbersEnabled", listOf(it.toString()))
        }
        this.isoCode?.let { queryParams.put("IsoCode", listOf(it.toString())) }
        this.lowRiskNumbersEnabled?.let {
            queryParams.put("LowRiskNumbersEnabled", listOf(it.toString()))
        }
        this.page?.let { queryParams.put("Page", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("PageSize", listOf(it.toString())) }
        this.pageToken?.let { queryParams.put("PageToken", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DialingPermissionCountryListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [DialingPermissionCountryListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialingPermissionCountryListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var continent: String? = null
        private var countryCode: String? = null
        private var highRiskSpecialNumbersEnabled: Boolean? = null
        private var highRiskTollfraudNumbersEnabled: Boolean? = null
        private var isoCode: String? = null
        private var lowRiskNumbersEnabled: Boolean? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dialingPermissionCountryListParams: DialingPermissionCountryListParams) =
            apply {
                continent = dialingPermissionCountryListParams.continent
                countryCode = dialingPermissionCountryListParams.countryCode
                highRiskSpecialNumbersEnabled =
                    dialingPermissionCountryListParams.highRiskSpecialNumbersEnabled
                highRiskTollfraudNumbersEnabled =
                    dialingPermissionCountryListParams.highRiskTollfraudNumbersEnabled
                isoCode = dialingPermissionCountryListParams.isoCode
                lowRiskNumbersEnabled = dialingPermissionCountryListParams.lowRiskNumbersEnabled
                page = dialingPermissionCountryListParams.page
                pageSize = dialingPermissionCountryListParams.pageSize
                pageToken = dialingPermissionCountryListParams.pageToken
                additionalHeaders = dialingPermissionCountryListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dialingPermissionCountryListParams.additionalQueryParams.toBuilder()
            }

        /** Filter to retrieve the country permissions by specifying the continent */
        fun continent(continent: String?) = apply { this.continent = continent }

        /** Filter to retrieve the country permissions by specifying the continent */
        fun continent(continent: Optional<String>) = continent(continent.orElse(null))

        /**
         * Filter the results by specified
         * [country codes](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

        /**
         * Filter the results by specified
         * [country codes](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.orElse(null))

        /**
         * Filter to retrieve the country permissions with dialing to high-risk special service
         * numbers enabled. Can be: `true` or `false`
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean?) = apply {
            this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled
        }

        /**
         * Filter to retrieve the country permissions with dialing to high-risk special service
         * numbers enabled. Can be: `true` or `false`
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled as Boolean?)

        /**
         * Filter to retrieve the country permissions with dialing to high-risk special service
         * numbers enabled. Can be: `true` or `false`
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Optional<Boolean>) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled.orElse(null) as Boolean?)

        /**
         * Filter to retrieve the country permissions with dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers enabled. Can be: `true` or `false`.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean?) = apply {
            this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled
        }

        /**
         * Filter to retrieve the country permissions with dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers enabled. Can be: `true` or `false`.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean) =
            highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled as Boolean?)

        /**
         * Filter to retrieve the country permissions with dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers enabled. Can be: `true` or `false`.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Optional<Boolean>) =
            highRiskTollfraudNumbersEnabled(
                highRiskTollfraudNumbersEnabled.orElse(null) as Boolean?
            )

        /**
         * Filter to retrieve the country permissions by specifying the
         * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
         */
        fun isoCode(isoCode: String?) = apply { this.isoCode = isoCode }

        /**
         * Filter to retrieve the country permissions by specifying the
         * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
         */
        fun isoCode(isoCode: Optional<String>) = isoCode(isoCode.orElse(null))

        /**
         * Filter to retrieve the country permissions with dialing to low-risk numbers enabled. Can
         * be: `true` or `false`.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean?) = apply {
            this.lowRiskNumbersEnabled = lowRiskNumbersEnabled
        }

        /**
         * Filter to retrieve the country permissions with dialing to low-risk numbers enabled. Can
         * be: `true` or `false`.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled as Boolean?)

        /**
         * Filter to retrieve the country permissions with dialing to low-risk numbers enabled. Can
         * be: `true` or `false`.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Optional<Boolean>) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled.orElse(null) as Boolean?)

        /** The page index. This value is simply for client state. */
        fun page(page: Long?) = apply { this.page = page }

        /** The page index. This value is simply for client state. */
        fun page(page: Long) = page(page as Long?)

        /** The page index. This value is simply for client state. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun page(page: Optional<Long>) = page(page.orElse(null) as Long?)

        /**
         * How many resources to return in each list page. The default is 50, and the maximum
         * is 1000.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * How many resources to return in each list page. The default is 50, and the maximum
         * is 1000.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /**
         * How many resources to return in each list page. The default is 50, and the maximum
         * is 1000.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

        /** The page token. This is provided by the API. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** The page token. This is provided by the API. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.orElse(null))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): DialingPermissionCountryListParams =
            DialingPermissionCountryListParams(
                continent,
                countryCode,
                highRiskSpecialNumbersEnabled,
                highRiskTollfraudNumbersEnabled,
                isoCode,
                lowRiskNumbersEnabled,
                page,
                pageSize,
                pageToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DialingPermissionCountryListParams && continent == other.continent && countryCode == other.countryCode && highRiskSpecialNumbersEnabled == other.highRiskSpecialNumbersEnabled && highRiskTollfraudNumbersEnabled == other.highRiskTollfraudNumbersEnabled && isoCode == other.isoCode && lowRiskNumbersEnabled == other.lowRiskNumbersEnabled && page == other.page && pageSize == other.pageSize && pageToken == other.pageToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(continent, countryCode, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, isoCode, lowRiskNumbersEnabled, page, pageSize, pageToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DialingPermissionCountryListParams{continent=$continent, countryCode=$countryCode, highRiskSpecialNumbersEnabled=$highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled=$highRiskTollfraudNumbersEnabled, isoCode=$isoCode, lowRiskNumbersEnabled=$lowRiskNumbersEnabled, page=$page, pageSize=$pageSize, pageToken=$pageToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
