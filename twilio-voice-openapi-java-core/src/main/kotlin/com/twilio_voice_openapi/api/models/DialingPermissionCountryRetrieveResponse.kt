// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.twilio_voice_openapi.api.core.ExcludeMissing
import com.twilio_voice_openapi.api.core.JsonField
import com.twilio_voice_openapi.api.core.JsonMissing
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.NoAutoDetect
import com.twilio_voice_openapi.api.core.checkKnown
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class DialingPermissionCountryRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("continent")
    @ExcludeMissing
    private val continent: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country_codes")
    @ExcludeMissing
    private val countryCodes: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("high_risk_special_numbers_enabled")
    @ExcludeMissing
    private val highRiskSpecialNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("high_risk_tollfraud_numbers_enabled")
    @ExcludeMissing
    private val highRiskTollfraudNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("iso_code")
    @ExcludeMissing
    private val isoCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("links") @ExcludeMissing private val links: JsonValue = JsonMissing.of(),
    @JsonProperty("low_risk_numbers_enabled")
    @ExcludeMissing
    private val lowRiskNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The name of the continent in which the country is located. */
    fun continent(): Optional<String> = Optional.ofNullable(continent.getNullable("continent"))

    /**
     * The E.164 assigned
     * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    fun countryCodes(): Optional<List<String>> =
        Optional.ofNullable(countryCodes.getNullable("country_codes"))

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include
     * number ranges allocated by the country and include premium numbers, special services, shared
     * cost, and others
     */
    fun highRiskSpecialNumbersEnabled(): Optional<Boolean> =
        Optional.ofNullable(
            highRiskSpecialNumbersEnabled.getNullable("high_risk_special_numbers_enabled")
        )

    /**
     * Whether dialing to high-risk
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
     * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
     * international revenue sharing fraud (IRSF) attacks, also known as
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
     * These prefixes are collected from anti-fraud databases and verified by analyzing calls on our
     * network. These prefixes are not available for download and are updated frequently
     */
    fun highRiskTollfraudNumbersEnabled(): Optional<Boolean> =
        Optional.ofNullable(
            highRiskTollfraudNumbersEnabled.getNullable("high_risk_tollfraud_numbers_enabled")
        )

    /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
    fun isoCode(): Optional<String> = Optional.ofNullable(isoCode.getNullable("iso_code"))

    /** A list of URLs related to this resource. */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonValue = links

    /** Whether dialing to low-risk numbers is enabled. */
    fun lowRiskNumbersEnabled(): Optional<Boolean> =
        Optional.ofNullable(lowRiskNumbersEnabled.getNullable("low_risk_numbers_enabled"))

    /** The name of the country. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The absolute URL of this resource. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** The name of the continent in which the country is located. */
    @JsonProperty("continent") @ExcludeMissing fun _continent(): JsonField<String> = continent

    /**
     * The E.164 assigned
     * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    @JsonProperty("country_codes")
    @ExcludeMissing
    fun _countryCodes(): JsonField<List<String>> = countryCodes

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include
     * number ranges allocated by the country and include premium numbers, special services, shared
     * cost, and others
     */
    @JsonProperty("high_risk_special_numbers_enabled")
    @ExcludeMissing
    fun _highRiskSpecialNumbersEnabled(): JsonField<Boolean> = highRiskSpecialNumbersEnabled

    /**
     * Whether dialing to high-risk
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
     * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
     * international revenue sharing fraud (IRSF) attacks, also known as
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
     * These prefixes are collected from anti-fraud databases and verified by analyzing calls on our
     * network. These prefixes are not available for download and are updated frequently
     */
    @JsonProperty("high_risk_tollfraud_numbers_enabled")
    @ExcludeMissing
    fun _highRiskTollfraudNumbersEnabled(): JsonField<Boolean> = highRiskTollfraudNumbersEnabled

    /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
    @JsonProperty("iso_code") @ExcludeMissing fun _isoCode(): JsonField<String> = isoCode

    /** Whether dialing to low-risk numbers is enabled. */
    @JsonProperty("low_risk_numbers_enabled")
    @ExcludeMissing
    fun _lowRiskNumbersEnabled(): JsonField<Boolean> = lowRiskNumbersEnabled

    /** The name of the country. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The absolute URL of this resource. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DialingPermissionCountryRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        continent()
        countryCodes()
        highRiskSpecialNumbersEnabled()
        highRiskTollfraudNumbersEnabled()
        isoCode()
        lowRiskNumbersEnabled()
        name()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DialingPermissionCountryRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialingPermissionCountryRetrieveResponse]. */
    class Builder internal constructor() {

        private var continent: JsonField<String> = JsonMissing.of()
        private var countryCodes: JsonField<MutableList<String>>? = null
        private var highRiskSpecialNumbersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var highRiskTollfraudNumbersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var isoCode: JsonField<String> = JsonMissing.of()
        private var links: JsonValue = JsonMissing.of()
        private var lowRiskNumbersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dialingPermissionCountryRetrieveResponse: DialingPermissionCountryRetrieveResponse
        ) = apply {
            continent = dialingPermissionCountryRetrieveResponse.continent
            countryCodes =
                dialingPermissionCountryRetrieveResponse.countryCodes.map { it.toMutableList() }
            highRiskSpecialNumbersEnabled =
                dialingPermissionCountryRetrieveResponse.highRiskSpecialNumbersEnabled
            highRiskTollfraudNumbersEnabled =
                dialingPermissionCountryRetrieveResponse.highRiskTollfraudNumbersEnabled
            isoCode = dialingPermissionCountryRetrieveResponse.isoCode
            links = dialingPermissionCountryRetrieveResponse.links
            lowRiskNumbersEnabled = dialingPermissionCountryRetrieveResponse.lowRiskNumbersEnabled
            name = dialingPermissionCountryRetrieveResponse.name
            url = dialingPermissionCountryRetrieveResponse.url
            additionalProperties =
                dialingPermissionCountryRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The name of the continent in which the country is located. */
        fun continent(continent: String?) = continent(JsonField.ofNullable(continent))

        /** The name of the continent in which the country is located. */
        fun continent(continent: Optional<String>) = continent(continent.getOrNull())

        /** The name of the continent in which the country is located. */
        fun continent(continent: JsonField<String>) = apply { this.continent = continent }

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCodes(countryCodes: List<String>?) =
            countryCodes(JsonField.ofNullable(countryCodes))

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCodes(countryCodes: Optional<List<String>>) =
            countryCodes(countryCodes.getOrNull())

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCodes(countryCodes: JsonField<List<String>>) = apply {
            this.countryCodes = countryCodes.map { it.toMutableList() }
        }

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun addCountryCode(countryCode: String) = apply {
            countryCodes =
                (countryCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("countryCodes", it).add(countryCode)
                }
        }

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include
         * number ranges allocated by the country and include premium numbers, special services,
         * shared cost, and others
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean?) =
            highRiskSpecialNumbersEnabled(JsonField.ofNullable(highRiskSpecialNumbersEnabled))

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include
         * number ranges allocated by the country and include premium numbers, special services,
         * shared cost, and others
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Boolean) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled as Boolean?)

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include
         * number ranges allocated by the country and include premium numbers, special services,
         * shared cost, and others
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: Optional<Boolean>) =
            highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled.getOrNull())

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include
         * number ranges allocated by the country and include premium numbers, special services,
         * shared cost, and others
         */
        fun highRiskSpecialNumbersEnabled(highRiskSpecialNumbersEnabled: JsonField<Boolean>) =
            apply {
                this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled
            }

        /**
         * Whether dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
         * international revenue sharing fraud (IRSF) attacks, also known as
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
         * These prefixes are collected from anti-fraud databases and verified by analyzing calls on
         * our network. These prefixes are not available for download and are updated frequently
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean?) =
            highRiskTollfraudNumbersEnabled(JsonField.ofNullable(highRiskTollfraudNumbersEnabled))

        /**
         * Whether dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
         * international revenue sharing fraud (IRSF) attacks, also known as
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
         * These prefixes are collected from anti-fraud databases and verified by analyzing calls on
         * our network. These prefixes are not available for download and are updated frequently
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean) =
            highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled as Boolean?)

        /**
         * Whether dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
         * international revenue sharing fraud (IRSF) attacks, also known as
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
         * These prefixes are collected from anti-fraud databases and verified by analyzing calls on
         * our network. These prefixes are not available for download and are updated frequently
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Optional<Boolean>) =
            highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled.getOrNull())

        /**
         * Whether dialing to high-risk
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
         * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
         * international revenue sharing fraud (IRSF) attacks, also known as
         * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
         * These prefixes are collected from anti-fraud databases and verified by analyzing calls on
         * our network. These prefixes are not available for download and are updated frequently
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: JsonField<Boolean>) =
            apply {
                this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled
            }

        /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
        fun isoCode(isoCode: String?) = isoCode(JsonField.ofNullable(isoCode))

        /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
        fun isoCode(isoCode: Optional<String>) = isoCode(isoCode.getOrNull())

        /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
        fun isoCode(isoCode: JsonField<String>) = apply { this.isoCode = isoCode }

        /** A list of URLs related to this resource. */
        fun links(links: JsonValue) = apply { this.links = links }

        /** Whether dialing to low-risk numbers is enabled. */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean?) =
            lowRiskNumbersEnabled(JsonField.ofNullable(lowRiskNumbersEnabled))

        /** Whether dialing to low-risk numbers is enabled. */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled as Boolean?)

        /** Whether dialing to low-risk numbers is enabled. */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Optional<Boolean>) =
            lowRiskNumbersEnabled(lowRiskNumbersEnabled.getOrNull())

        /** Whether dialing to low-risk numbers is enabled. */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: JsonField<Boolean>) = apply {
            this.lowRiskNumbersEnabled = lowRiskNumbersEnabled
        }

        /** The name of the country. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** The name of the country. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** The name of the country. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The absolute URL of this resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The absolute URL of this resource. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** The absolute URL of this resource. */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): DialingPermissionCountryRetrieveResponse =
            DialingPermissionCountryRetrieveResponse(
                continent,
                (countryCodes ?: JsonMissing.of()).map { it.toImmutable() },
                highRiskSpecialNumbersEnabled,
                highRiskTollfraudNumbersEnabled,
                isoCode,
                links,
                lowRiskNumbersEnabled,
                name,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DialingPermissionCountryRetrieveResponse && continent == other.continent && countryCodes == other.countryCodes && highRiskSpecialNumbersEnabled == other.highRiskSpecialNumbersEnabled && highRiskTollfraudNumbersEnabled == other.highRiskTollfraudNumbersEnabled && isoCode == other.isoCode && links == other.links && lowRiskNumbersEnabled == other.lowRiskNumbersEnabled && name == other.name && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(continent, countryCodes, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, isoCode, links, lowRiskNumbersEnabled, name, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialingPermissionCountryRetrieveResponse{continent=$continent, countryCodes=$countryCodes, highRiskSpecialNumbersEnabled=$highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled=$highRiskTollfraudNumbersEnabled, isoCode=$isoCode, links=$links, lowRiskNumbersEnabled=$lowRiskNumbersEnabled, name=$name, url=$url, additionalProperties=$additionalProperties}"
}
