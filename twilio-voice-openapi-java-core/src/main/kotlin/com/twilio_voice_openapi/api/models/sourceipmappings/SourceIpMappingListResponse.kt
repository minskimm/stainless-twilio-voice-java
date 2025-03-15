// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.sourceipmappings

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
class SourceIpMappingListResponse
@JsonCreator
private constructor(
    @JsonProperty("meta") @ExcludeMissing private val meta: JsonField<Meta> = JsonMissing.of(),
    @JsonProperty("source_ip_mappings")
    @ExcludeMissing
    private val sourceIpMappings: JsonField<List<SourceIpMapping>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = Optional.ofNullable(meta.getNullable("meta"))

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceIpMappings(): Optional<List<SourceIpMapping>> =
        Optional.ofNullable(sourceIpMappings.getNullable("source_ip_mappings"))

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [sourceIpMappings].
     *
     * Unlike [sourceIpMappings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_ip_mappings")
    @ExcludeMissing
    fun _sourceIpMappings(): JsonField<List<SourceIpMapping>> = sourceIpMappings

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SourceIpMappingListResponse = apply {
        if (validated) {
            return@apply
        }

        meta().ifPresent { it.validate() }
        sourceIpMappings().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceIpMappingListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceIpMappingListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<Meta> = JsonMissing.of()
        private var sourceIpMappings: JsonField<MutableList<SourceIpMapping>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sourceIpMappingListResponse: SourceIpMappingListResponse) = apply {
            meta = sourceIpMappingListResponse.meta
            sourceIpMappings =
                sourceIpMappingListResponse.sourceIpMappings.map { it.toMutableList() }
            additionalProperties = sourceIpMappingListResponse.additionalProperties.toMutableMap()
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun sourceIpMappings(sourceIpMappings: List<SourceIpMapping>) =
            sourceIpMappings(JsonField.of(sourceIpMappings))

        /**
         * Sets [Builder.sourceIpMappings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceIpMappings] with a well-typed
         * `List<SourceIpMapping>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sourceIpMappings(sourceIpMappings: JsonField<List<SourceIpMapping>>) = apply {
            this.sourceIpMappings = sourceIpMappings.map { it.toMutableList() }
        }

        /**
         * Adds a single [SourceIpMapping] to [sourceIpMappings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourceIpMapping(sourceIpMapping: SourceIpMapping) = apply {
            sourceIpMappings =
                (sourceIpMappings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourceIpMappings", it).add(sourceIpMapping)
                }
        }

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

        fun build(): SourceIpMappingListResponse =
            SourceIpMappingListResponse(
                meta,
                (sourceIpMappings ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
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

        return /* spotless:off */ other is SourceIpMappingListResponse && meta == other.meta && sourceIpMappings == other.sourceIpMappings && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(meta, sourceIpMappings, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SourceIpMappingListResponse{meta=$meta, sourceIpMappings=$sourceIpMappings, additionalProperties=$additionalProperties}"
}
