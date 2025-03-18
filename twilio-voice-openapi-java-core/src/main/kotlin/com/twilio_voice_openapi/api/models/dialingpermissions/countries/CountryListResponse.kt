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
import com.twilio_voice_openapi.api.core.NoAutoDetect
import com.twilio_voice_openapi.api.core.checkKnown
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class CountryListResponse
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<List<Content>> = JsonMissing.of(),
    @JsonProperty("meta") @ExcludeMissing private val meta: JsonField<Meta> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun content(): Optional<List<Content>> = Optional.ofNullable(content.getNullable("content"))

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = Optional.ofNullable(meta.getNullable("meta"))

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<List<Content>> = content

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CountryListResponse = apply {
        if (validated) {
            return@apply
        }

        content().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CountryListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CountryListResponse]. */
    class Builder internal constructor() {

        private var content: JsonField<MutableList<Content>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(countryListResponse: CountryListResponse) = apply {
            content = countryListResponse.content.map { it.toMutableList() }
            meta = countryListResponse.meta
            additionalProperties = countryListResponse.additionalProperties.toMutableMap()
        }

        fun content(content: List<Content>) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed `List<Content>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<List<Content>>) = apply {
            this.content = content.map { it.toMutableList() }
        }

        /**
         * Adds a single [Content] to [Builder.content].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContent(content: Content) = apply {
            this.content =
                (this.content ?: JsonField.of(mutableListOf())).also {
                    checkKnown("content", it).add(content)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [CountryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CountryListResponse =
            CountryListResponse(
                (content ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Content
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The name of the continent in which the country is located.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun continent(): Optional<String> = Optional.ofNullable(continent.getNullable("continent"))

        /**
         * The E.164 assigned
         * [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryCodes(): Optional<List<String>> =
            Optional.ofNullable(countryCodes.getNullable("country_codes"))

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include
         * number ranges allocated by the country and include premium numbers, special services,
         * shared cost, and others
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
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
         * These prefixes are collected from anti-fraud databases and verified by analyzing calls on
         * our network. These prefixes are not available for download and are updated frequently
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun highRiskTollfraudNumbersEnabled(): Optional<Boolean> =
            Optional.ofNullable(
                highRiskTollfraudNumbersEnabled.getNullable("high_risk_tollfraud_numbers_enabled")
            )

        /**
         * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun isoCode(): Optional<String> = Optional.ofNullable(isoCode.getNullable("iso_code"))

        /** A list of URLs related to this resource. */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonValue = links

        /**
         * Whether dialing to low-risk numbers is enabled.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lowRiskNumbersEnabled(): Optional<Boolean> =
            Optional.ofNullable(lowRiskNumbersEnabled.getNullable("low_risk_numbers_enabled"))

        /**
         * The name of the country.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The absolute URL of this resource.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

        /**
         * Returns the raw JSON value of [continent].
         *
         * Unlike [continent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("continent") @ExcludeMissing fun _continent(): JsonField<String> = continent

        /**
         * Returns the raw JSON value of [countryCodes].
         *
         * Unlike [countryCodes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("country_codes")
        @ExcludeMissing
        fun _countryCodes(): JsonField<List<String>> = countryCodes

        /**
         * Returns the raw JSON value of [highRiskSpecialNumbersEnabled].
         *
         * Unlike [highRiskSpecialNumbersEnabled], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("high_risk_special_numbers_enabled")
        @ExcludeMissing
        fun _highRiskSpecialNumbersEnabled(): JsonField<Boolean> = highRiskSpecialNumbersEnabled

        /**
         * Returns the raw JSON value of [highRiskTollfraudNumbersEnabled].
         *
         * Unlike [highRiskTollfraudNumbersEnabled], this method doesn't throw if the JSON field has
         * an unexpected type.
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
         * Unlike [lowRiskNumbersEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Content = apply {
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

            /** Returns a mutable builder for constructing an instance of [Content]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Content]. */
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
            internal fun from(content: Content) = apply {
                continent = content.continent
                countryCodes = content.countryCodes.map { it.toMutableList() }
                highRiskSpecialNumbersEnabled = content.highRiskSpecialNumbersEnabled
                highRiskTollfraudNumbersEnabled = content.highRiskTollfraudNumbersEnabled
                isoCode = content.isoCode
                links = content.links
                lowRiskNumbersEnabled = content.lowRiskNumbersEnabled
                name = content.name
                url = content.url
                additionalProperties = content.additionalProperties.toMutableMap()
            }

            /** The name of the continent in which the country is located. */
            fun continent(continent: String?) = continent(JsonField.ofNullable(continent))

            /** Alias for calling [Builder.continent] with `continent.orElse(null)`. */
            fun continent(continent: Optional<String>) = continent(continent.getOrNull())

            /**
             * Sets [Builder.continent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.continent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Whether dialing to high-risk special services numbers is enabled. These prefixes
             * include number ranges allocated by the country and include premium numbers, special
             * services, shared cost, and others
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
             * numbers is enabled. These prefixes include narrow number ranges that have a high-risk
             * of international revenue sharing fraud (IRSF) attacks, also known as
             * [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html).
             * These prefixes are collected from anti-fraud databases and verified by analyzing
             * calls on our network. These prefixes are not available for download and are updated
             * frequently
             */
            fun highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled: Boolean?) =
                highRiskTollfraudNumbersEnabled(
                    JsonField.ofNullable(highRiskTollfraudNumbersEnabled)
                )

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
            fun highRiskTollfraudNumbersEnabled(
                highRiskTollfraudNumbersEnabled: Optional<Boolean>
            ) = highRiskTollfraudNumbersEnabled(highRiskTollfraudNumbersEnabled.getOrNull())

            /**
             * Sets [Builder.highRiskTollfraudNumbersEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highRiskTollfraudNumbersEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun highRiskTollfraudNumbersEnabled(
                highRiskTollfraudNumbersEnabled: JsonField<Boolean>
            ) = apply { this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled }

            /** The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). */
            fun isoCode(isoCode: String?) = isoCode(JsonField.ofNullable(isoCode))

            /** Alias for calling [Builder.isoCode] with `isoCode.orElse(null)`. */
            fun isoCode(isoCode: Optional<String>) = isoCode(isoCode.getOrNull())

            /**
             * Sets [Builder.isoCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isoCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.lowRiskNumbersEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Content].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Content =
                Content(
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

            return /* spotless:off */ other is Content && continent == other.continent && countryCodes == other.countryCodes && highRiskSpecialNumbersEnabled == other.highRiskSpecialNumbersEnabled && highRiskTollfraudNumbersEnabled == other.highRiskTollfraudNumbersEnabled && isoCode == other.isoCode && links == other.links && lowRiskNumbersEnabled == other.lowRiskNumbersEnabled && name == other.name && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(continent, countryCodes, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, isoCode, links, lowRiskNumbersEnabled, name, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Content{continent=$continent, countryCodes=$countryCodes, highRiskSpecialNumbersEnabled=$highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled=$highRiskTollfraudNumbersEnabled, isoCode=$isoCode, links=$links, lowRiskNumbersEnabled=$lowRiskNumbersEnabled, name=$name, url=$url, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Meta
    @JsonCreator
    private constructor(
        @JsonProperty("first_page_url")
        @ExcludeMissing
        private val firstPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_page_url")
        @ExcludeMissing
        private val nextPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page") @ExcludeMissing private val page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_size")
        @ExcludeMissing
        private val pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("previous_page_url")
        @ExcludeMissing
        private val previousPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun firstPageUrl(): Optional<String> =
            Optional.ofNullable(firstPageUrl.getNullable("first_page_url"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun key(): Optional<String> = Optional.ofNullable(key.getNullable("key"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nextPageUrl(): Optional<String> =
            Optional.ofNullable(nextPageUrl.getNullable("next_page_url"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun page(): Optional<Long> = Optional.ofNullable(page.getNullable("page"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize.getNullable("page_size"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun previousPageUrl(): Optional<String> =
            Optional.ofNullable(previousPageUrl.getNullable("previous_page_url"))

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

        /**
         * Returns the raw JSON value of [firstPageUrl].
         *
         * Unlike [firstPageUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_page_url")
        @ExcludeMissing
        fun _firstPageUrl(): JsonField<String> = firstPageUrl

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [nextPageUrl].
         *
         * Unlike [nextPageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_page_url")
        @ExcludeMissing
        fun _nextPageUrl(): JsonField<String> = nextPageUrl

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [previousPageUrl].
         *
         * Unlike [previousPageUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_page_url")
        @ExcludeMissing
        fun _previousPageUrl(): JsonField<String> = previousPageUrl

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            firstPageUrl()
            key()
            nextPageUrl()
            page()
            pageSize()
            previousPageUrl()
            url()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var firstPageUrl: JsonField<String> = JsonMissing.of()
            private var key: JsonField<String> = JsonMissing.of()
            private var nextPageUrl: JsonField<String> = JsonMissing.of()
            private var page: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var previousPageUrl: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                firstPageUrl = meta.firstPageUrl
                key = meta.key
                nextPageUrl = meta.nextPageUrl
                page = meta.page
                pageSize = meta.pageSize
                previousPageUrl = meta.previousPageUrl
                url = meta.url
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun firstPageUrl(firstPageUrl: String) = firstPageUrl(JsonField.of(firstPageUrl))

            /**
             * Sets [Builder.firstPageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstPageUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstPageUrl(firstPageUrl: JsonField<String>) = apply {
                this.firstPageUrl = firstPageUrl
            }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun nextPageUrl(nextPageUrl: String?) = nextPageUrl(JsonField.ofNullable(nextPageUrl))

            /** Alias for calling [Builder.nextPageUrl] with `nextPageUrl.orElse(null)`. */
            fun nextPageUrl(nextPageUrl: Optional<String>) = nextPageUrl(nextPageUrl.getOrNull())

            /**
             * Sets [Builder.nextPageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextPageUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextPageUrl(nextPageUrl: JsonField<String>) = apply {
                this.nextPageUrl = nextPageUrl
            }

            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun previousPageUrl(previousPageUrl: String?) =
                previousPageUrl(JsonField.ofNullable(previousPageUrl))

            /** Alias for calling [Builder.previousPageUrl] with `previousPageUrl.orElse(null)`. */
            fun previousPageUrl(previousPageUrl: Optional<String>) =
                previousPageUrl(previousPageUrl.getOrNull())

            /**
             * Sets [Builder.previousPageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousPageUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousPageUrl(previousPageUrl: JsonField<String>) = apply {
                this.previousPageUrl = previousPageUrl
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    firstPageUrl,
                    key,
                    nextPageUrl,
                    page,
                    pageSize,
                    previousPageUrl,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Meta && firstPageUrl == other.firstPageUrl && key == other.key && nextPageUrl == other.nextPageUrl && page == other.page && pageSize == other.pageSize && previousPageUrl == other.previousPageUrl && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(firstPageUrl, key, nextPageUrl, page, pageSize, previousPageUrl, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{firstPageUrl=$firstPageUrl, key=$key, nextPageUrl=$nextPageUrl, page=$page, pageSize=$pageSize, previousPageUrl=$previousPageUrl, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CountryListResponse && content == other.content && meta == other.meta && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, meta, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CountryListResponse{content=$content, meta=$meta, additionalProperties=$additionalProperties}"
}
