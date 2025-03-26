// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve all voice dialing country permissions for this account */
class CountryListParams
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CountryListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CountryListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CountryListParams]. */
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
        internal fun from(countryListParams: CountryListParams) = apply {
            continent = countryListParams.continent
            countryCode = countryListParams.countryCode
            highRiskSpecialNumbersEnabled = countryListParams.highRiskSpecialNumbersEnabled
            highRiskTollfraudNumbersEnabled = countryListParams.highRiskTollfraudNumbersEnabled
            isoCode = countryListParams.isoCode
            lowRiskNumbersEnabled = countryListParams.lowRiskNumbersEnabled
            page = countryListParams.page
            pageSize = countryListParams.pageSize
            pageToken = countryListParams.pageToken
            additionalHeaders = countryListParams.additionalHeaders.toBuilder()
            additionalQueryParams = countryListParams.additionalQueryParams.toBuilder()
        }

        /** Filter to retrieve the country permissions by specifying the continent */
        fun continent(continent: String?) = apply { this.continent = continent }

        /** Alias for calling [Builder.continent] with `continent.orElse(null)`. */
        fun continent(continent: Optional<String>) = continent(continent.getOrNull())

        /**
         * Filter the results by specified
         * [country codes](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

        /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
        fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

        /**
         * Filter to retrieve the country permissions with dialing to high-risk special service
         * numbers enabled. Can be: `true` or `false`
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean?) = apply {
            this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled
        }

        /**
         * Alias for [Builder.highRiskSpecialNumbersEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled as Boolean?)

        /**
         * Alias for calling [Builder.highRiskSpecialNumbersEnabled] with
         * `highRiskSpecialNumbersEnabled.orElse(null)`.
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Optional<Boolean>) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled.getOrNull())

        /**
         * Filter to retrieve the country permissions with dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers enabled. Can be: `true` or `false`.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean?) = apply {
            this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled
        }

        /**
         * Alias for [Builder.highRiskTollfraudNumbersEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean) =
            highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled as Boolean?)

        /**
         * Alias for calling [Builder.highRiskTollfraudNumbersEnabled] with
         * `highRiskTollfraudNumbersEnabled.orElse(null)`.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Optional<Boolean>) =
            highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled.getOrNull())

        /**
         * Filter to retrieve the country permissions by specifying the
         * [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
         */
        fun isoCode(isoCode: String?) = apply { this.isoCode = isoCode }

        /** Alias for calling [Builder.isoCode] with `isoCode.orElse(null)`. */
        fun isoCode(isoCode: Optional<String>) = isoCode(isoCode.getOrNull())

        /**
         * Filter to retrieve the country permissions with dialing to low-risk numbers enabled. Can
         * be: `true` or `false`.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean?) = apply {
            this.lowRiskNumbersEnabled = lowRiskNumbersEnabled
        }

        /**
         * Alias for [Builder.lowRiskNumbersEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled as Boolean?)

        /**
         * Alias for calling [Builder.lowRiskNumbersEnabled] with
         * `lowRiskNumbersEnabled.orElse(null)`.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Optional<Boolean>) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled.getOrNull())

        /** The page index. This value is simply for client state. */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /**
         * How many resources to return in each list page. The default is 50, and the maximum
         * is 1000.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** The page token. This is provided by the API. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

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

        /**
         * Returns an immutable instance of [CountryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CountryListParams =
            CountryListParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                continent?.let { put("Continent", it) }
                countryCode?.let { put("CountryCode", it) }
                highRiskSpecialNumbersEnabled?.let {
                    put("HighRiskSpecialNumbersEnabled", it.toString())
                }
                highRiskTollfraudNumbersEnabled?.let {
                    put("HighRiskTollfraudNumbersEnabled", it.toString())
                }
                isoCode?.let { put("IsoCode", it) }
                lowRiskNumbersEnabled?.let { put("LowRiskNumbersEnabled", it.toString()) }
                page?.let { put("Page", it.toString()) }
                pageSize?.let { put("PageSize", it.toString()) }
                pageToken?.let { put("PageToken", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CountryListParams && continent == other.continent && countryCode == other.countryCode && highRiskSpecialNumbersEnabled == other.highRiskSpecialNumbersEnabled && highRiskTollfraudNumbersEnabled == other.highRiskTollfraudNumbersEnabled && isoCode == other.isoCode && lowRiskNumbersEnabled == other.lowRiskNumbersEnabled && page == other.page && pageSize == other.pageSize && pageToken == other.pageToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(continent, countryCode, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, isoCode, lowRiskNumbersEnabled, page, pageSize, pageToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CountryListParams{continent=$continent, countryCode=$countryCode, highRiskSpecialNumbersEnabled=$highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled=$highRiskTollfraudNumbersEnabled, isoCode=$isoCode, lowRiskNumbersEnabled=$lowRiskNumbersEnabled, page=$page, pageSize=$pageSize, pageToken=$pageToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
