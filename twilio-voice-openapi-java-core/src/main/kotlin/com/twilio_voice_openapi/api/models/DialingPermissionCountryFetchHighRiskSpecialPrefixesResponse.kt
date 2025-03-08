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
class DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<List<Content>> = JsonMissing.of(),
    @JsonProperty("meta") @ExcludeMissing private val meta: JsonField<Meta> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun content(): Optional<List<Content>> = Optional.ofNullable(content.getNullable("content"))

    fun meta(): Optional<Meta> = Optional.ofNullable(meta.getNullable("meta"))

    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<List<Content>> = content

    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse = apply {
        if (validated) {
            return@apply
        }

        content().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse]. */
    class Builder internal constructor() {

        private var content: JsonField<MutableList<Content>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse:
                DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse
        ) = apply {
            content =
                dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.content.map {
                    it.toMutableList()
                }
            meta = dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.meta
            additionalProperties =
                dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.additionalProperties
                    .toMutableMap()
        }

        fun content(content: List<Content>) = content(JsonField.of(content))

        fun content(content: JsonField<List<Content>>) = apply {
            this.content = content.map { it.toMutableList() }
        }

        fun addContent(content: Content) = apply {
            this.content =
                (this.content ?: JsonField.of(mutableListOf())).also {
                    checkKnown("content", it).add(content)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

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

        fun build(): DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse =
            DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse(
                (content ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Content
    @JsonCreator
    private constructor(
        @JsonProperty("prefix")
        @ExcludeMissing
        private val prefix: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A prefix is a contiguous number range for a block of E.164 numbers that includes the
         * E.164 assigned country code. For example, a North American Numbering Plan prefix like
         * `+1510720` written like `+1(510) 720` matches all numbers inclusive from `+1(510)
         * 720-0000` to `+1(510) 720-9999`.
         */
        fun prefix(): Optional<String> = Optional.ofNullable(prefix.getNullable("prefix"))

        /**
         * A prefix is a contiguous number range for a block of E.164 numbers that includes the
         * E.164 assigned country code. For example, a North American Numbering Plan prefix like
         * `+1510720` written like `+1(510) 720` matches all numbers inclusive from `+1(510)
         * 720-0000` to `+1(510) 720-9999`.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Content = apply {
            if (validated) {
                return@apply
            }

            prefix()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Content]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Content]. */
        class Builder internal constructor() {

            private var prefix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(content: Content) = apply {
                prefix = content.prefix
                additionalProperties = content.additionalProperties.toMutableMap()
            }

            /**
             * A prefix is a contiguous number range for a block of E.164 numbers that includes the
             * E.164 assigned country code. For example, a North American Numbering Plan prefix like
             * `+1510720` written like `+1(510) 720` matches all numbers inclusive from `+1(510)
             * 720-0000` to `+1(510) 720-9999`.
             */
            fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

            /**
             * A prefix is a contiguous number range for a block of E.164 numbers that includes the
             * E.164 assigned country code. For example, a North American Numbering Plan prefix like
             * `+1510720` written like `+1(510) 720` matches all numbers inclusive from `+1(510)
             * 720-0000` to `+1(510) 720-9999`.
             */
            fun prefix(prefix: Optional<String>) = prefix(prefix.getOrNull())

            /**
             * A prefix is a contiguous number range for a block of E.164 numbers that includes the
             * E.164 assigned country code. For example, a North American Numbering Plan prefix like
             * `+1510720` written like `+1(510) 720` matches all numbers inclusive from `+1(510)
             * 720-0000` to `+1(510) 720-9999`.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

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

            fun build(): Content = Content(prefix, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Content && prefix == other.prefix && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(prefix, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Content{prefix=$prefix, additionalProperties=$additionalProperties}"
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

        fun firstPageUrl(): Optional<String> =
            Optional.ofNullable(firstPageUrl.getNullable("first_page_url"))

        fun key(): Optional<String> = Optional.ofNullable(key.getNullable("key"))

        fun nextPageUrl(): Optional<String> =
            Optional.ofNullable(nextPageUrl.getNullable("next_page_url"))

        fun page(): Optional<Long> = Optional.ofNullable(page.getNullable("page"))

        fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize.getNullable("page_size"))

        fun previousPageUrl(): Optional<String> =
            Optional.ofNullable(previousPageUrl.getNullable("previous_page_url"))

        fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

        @JsonProperty("first_page_url")
        @ExcludeMissing
        fun _firstPageUrl(): JsonField<String> = firstPageUrl

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonProperty("next_page_url")
        @ExcludeMissing
        fun _nextPageUrl(): JsonField<String> = nextPageUrl

        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        @JsonProperty("previous_page_url")
        @ExcludeMissing
        fun _previousPageUrl(): JsonField<String> = previousPageUrl

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

            fun firstPageUrl(firstPageUrl: JsonField<String>) = apply {
                this.firstPageUrl = firstPageUrl
            }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

            fun nextPageUrl(nextPageUrl: String?) = nextPageUrl(JsonField.ofNullable(nextPageUrl))

            fun nextPageUrl(nextPageUrl: Optional<String>) = nextPageUrl(nextPageUrl.getOrNull())

            fun nextPageUrl(nextPageUrl: JsonField<String>) = apply {
                this.nextPageUrl = nextPageUrl
            }

            fun page(page: Long) = page(JsonField.of(page))

            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun previousPageUrl(previousPageUrl: String?) =
                previousPageUrl(JsonField.ofNullable(previousPageUrl))

            fun previousPageUrl(previousPageUrl: Optional<String>) =
                previousPageUrl(previousPageUrl.getOrNull())

            fun previousPageUrl(previousPageUrl: JsonField<String>) = apply {
                this.previousPageUrl = previousPageUrl
            }

            fun url(url: String) = url(JsonField.of(url))

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

        return /* spotless:off */ other is DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse && content == other.content && meta == other.meta && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, meta, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse{content=$content, meta=$meta, additionalProperties=$additionalProperties}"
}
