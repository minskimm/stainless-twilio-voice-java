// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.twilio_voice_openapi.api.core.ExcludeMissing
import com.twilio_voice_openapi.api.core.JsonField
import com.twilio_voice_openapi.api.core.JsonMissing
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.checkKnown
import com.twilio_voice_openapi.api.core.toImmutable
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CountryRetrieveResponse
private constructor(
    private val continent: JsonField<String>,
    private val countryCodes: JsonField<List<String>>,
    private val highRiskSpecialNumbersEnabled: JsonField<Boolean>,
    private val highRiskTollfraudNumbersEnabled: JsonField<Boolean>,
    private val isoCode: JsonField<String>,
    private val links: JsonValue,
    private val lowRiskNumbersEnabled: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("continent") @ExcludeMissing continent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_codes")
        @ExcludeMissing
        countryCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("high_risk_special_numbers_enabled")
        @ExcludeMissing
        highRiskSpecialNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("high_risk_tollfraud_numbers_enabled")
        @ExcludeMissing
        highRiskTollfraudNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("iso_code") @ExcludeMissing isoCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonValue = JsonMissing.of(),
        @JsonProperty("low_risk_numbers_enabled")
        @ExcludeMissing
        lowRiskNumbersEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        continent,
        countryCodes,
        highRiskSpecialNumbersEnabled,
        highRiskTollfraudNumbersEnabled,
        isoCode,
        links,
        lowRiskNumbersEnabled,
        name,
        url,
        mutableMapOf(),
    )

    /**
     * The name of the continent in which the country is located.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun continent(): Optional<String> = continent.getOptional("continent")

    /**
     * The E.164 assigned
     * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCodes(): Optional<List<String>> = countryCodes.getOptional("country_codes")

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include
     * number ranges allocated by the country and include premium numbers, special services, shared
     * cost, and others
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun highRiskSpecialNumbersEnabled(): Optional<Boolean> =
        highRiskSpecialNumbersEnabled.getOptional("high_risk_special_numbers_enabled")

    /**
     * Whether dialing to high-risk
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html)
     * numbers is enabled. These prefixes include narrow number ranges that have a high-risk of
     * international revenue sharing fraud (IRSF) attacks, also known as
     * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
     * These prefixes are collected from anti-fraud databases and verified by analyzing calls on our
     * network. These prefixes are not available for download and are updated frequently
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun highRiskTollfraudNumbersEnabled(): Optional<Boolean> =
        highRiskTollfraudNumbersEnabled.getOptional("high_risk_tollfraud_numbers_enabled")

    /**
     * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun isoCode(): Optional<String> = isoCode.getOptional("iso_code")

    /** A list of URLs related to this resource. */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonValue = links

    /**
     * Whether dialing to low-risk numbers is enabled.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lowRiskNumbersEnabled(): Optional<Boolean> =
        lowRiskNumbersEnabled.getOptional("low_risk_numbers_enabled")

    /**
     * The name of the country.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The absolute URL of this resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [continent].
     *
     * Unlike [continent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("continent") @ExcludeMissing fun _continent(): JsonField<String> = continent

    /**
     * Returns the raw JSON value of [countryCodes].
     *
     * Unlike [countryCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_codes")
    @ExcludeMissing
    fun _countryCodes(): JsonField<List<String>> = countryCodes

    /**
     * Returns the raw JSON value of [highRiskSpecialNumbersEnabled].
     *
     * Unlike [highRiskSpecialNumbersEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("high_risk_special_numbers_enabled")
    @ExcludeMissing
    fun _highRiskSpecialNumbersEnabled(): JsonField<Boolean> = highRiskSpecialNumbersEnabled

    /**
     * Returns the raw JSON value of [highRiskTollfraudNumbersEnabled].
     *
     * Unlike [highRiskTollfraudNumbersEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("high_risk_tollfraud_numbers_enabled")
    @ExcludeMissing
    fun _highRiskTollfraudNumbersEnabled(): JsonField<Boolean> = highRiskTollfraudNumbersEnabled

    /**
     * Returns the raw JSON value of [isoCode].
     *
     * Unlike [isoCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iso_code") @ExcludeMissing fun _isoCode(): JsonField<String> = isoCode

    /**
     * Returns the raw JSON value of [lowRiskNumbersEnabled].
     *
     * Unlike [lowRiskNumbersEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("low_risk_numbers_enabled")
    @ExcludeMissing
    fun _lowRiskNumbersEnabled(): JsonField<Boolean> = lowRiskNumbersEnabled

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CountryRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CountryRetrieveResponse]. */
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
        internal fun from(countryRetrieveResponse: CountryRetrieveResponse) = apply {
            continent = countryRetrieveResponse.continent
            countryCodes = countryRetrieveResponse.countryCodes.map { it.toMutableList() }
            highRiskSpecialNumbersEnabled = countryRetrieveResponse.highRiskSpecialNumbersEnabled
            highRiskTollfraudNumbersEnabled =
                countryRetrieveResponse.highRiskTollfraudNumbersEnabled
            isoCode = countryRetrieveResponse.isoCode
            links = countryRetrieveResponse.links
            lowRiskNumbersEnabled = countryRetrieveResponse.lowRiskNumbersEnabled
            name = countryRetrieveResponse.name
            url = countryRetrieveResponse.url
            additionalProperties = countryRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The name of the continent in which the country is located. */
        fun continent(continent: String?) = continent(JsonField.ofNullable(continent))

        /** Alias for calling [Builder.continent] with `continent.orElse(null)`. */
        fun continent(continent: Optional<String>) = continent(continent.getOrNull())

        /**
         * Sets [Builder.continent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.continent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun continent(continent: JsonField<String>) = apply { this.continent = continent }

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        fun countryCodes(countryCodes: List<String>?) =
            countryCodes(JsonField.ofNullable(countryCodes))

        /** Alias for calling [Builder.countryCodes] with `countryCodes.orElse(null)`. */
        fun countryCodes(countryCodes: Optional<List<String>>) =
            countryCodes(countryCodes.getOrNull())

        /**
         * Sets [Builder.countryCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryCodes(countryCodes: JsonField<List<String>>) = apply {
            this.countryCodes = countryCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [countryCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.highRiskSpecialNumbersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highRiskSpecialNumbersEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.highRiskTollfraudNumbersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highRiskTollfraudNumbersEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: JsonField<Boolean>) =
            apply {
                this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled
            }

        /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
        fun isoCode(isoCode: String?) = isoCode(JsonField.ofNullable(isoCode))

        /** Alias for calling [Builder.isoCode] with `isoCode.orElse(null)`. */
        fun isoCode(isoCode: Optional<String>) = isoCode(isoCode.getOrNull())

        /**
         * Sets [Builder.isoCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isoCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isoCode(isoCode: JsonField<String>) = apply { this.isoCode = isoCode }

        /** A list of URLs related to this resource. */
        fun links(links: JsonValue) = apply { this.links = links }

        /** Whether dialing to low-risk numbers is enabled. */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: Boolean?) =
            lowRiskNumbersEnabled(JsonField.ofNullable(lowRiskNumbersEnabled))

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

        /**
         * Sets [Builder.lowRiskNumbersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowRiskNumbersEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lowRiskNumbersEnabled(lowRiskNumbersEnabled: JsonField<Boolean>) = apply {
            this.lowRiskNumbersEnabled = lowRiskNumbersEnabled
        }

        /** The name of the country. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The absolute URL of this resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [CountryRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CountryRetrieveResponse =
            CountryRetrieveResponse(
                continent,
                (countryCodes ?: JsonMissing.of()).map { it.toImmutable() },
                highRiskSpecialNumbersEnabled,
                highRiskTollfraudNumbersEnabled,
                isoCode,
                links,
                lowRiskNumbersEnabled,
                name,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CountryRetrieveResponse = apply {
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TwilioVoiceOpenAPIInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (continent.asKnown().isPresent) 1 else 0) +
            (countryCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (highRiskSpecialNumbersEnabled.asKnown().isPresent) 1 else 0) +
            (if (highRiskTollfraudNumbersEnabled.asKnown().isPresent) 1 else 0) +
            (if (isoCode.asKnown().isPresent) 1 else 0) +
            (if (lowRiskNumbersEnabled.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CountryRetrieveResponse && continent == other.continent && countryCodes == other.countryCodes && highRiskSpecialNumbersEnabled == other.highRiskSpecialNumbersEnabled && highRiskTollfraudNumbersEnabled == other.highRiskTollfraudNumbersEnabled && isoCode == other.isoCode && links == other.links && lowRiskNumbersEnabled == other.lowRiskNumbersEnabled && name == other.name && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(continent, countryCodes, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, isoCode, links, lowRiskNumbersEnabled, name, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CountryRetrieveResponse{continent=$continent, countryCodes=$countryCodes, highRiskSpecialNumbersEnabled=$highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled=$highRiskTollfraudNumbersEnabled, isoCode=$isoCode, links=$links, lowRiskNumbersEnabled=$lowRiskNumbersEnabled, name=$name, url=$url, additionalProperties=$additionalProperties}"
}
