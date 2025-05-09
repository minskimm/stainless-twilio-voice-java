// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies.targets

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

class TargetListResponse
private constructor(
    private val meta: JsonField<Meta>,
    private val targets: JsonField<List<ConnectionPolicyTarget>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("targets")
        @ExcludeMissing
        targets: JsonField<List<ConnectionPolicyTarget>> = JsonMissing.of(),
    ) : this(meta, targets, mutableMapOf())

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targets(): Optional<List<ConnectionPolicyTarget>> = targets.getOptional("targets")

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [targets].
     *
     * Unlike [targets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targets")
    @ExcludeMissing
    fun _targets(): JsonField<List<ConnectionPolicyTarget>> = targets

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

        /** Returns a mutable builder for constructing an instance of [TargetListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TargetListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<Meta> = JsonMissing.of()
        private var targets: JsonField<MutableList<ConnectionPolicyTarget>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(targetListResponse: TargetListResponse) = apply {
            meta = targetListResponse.meta
            targets = targetListResponse.targets.map { it.toMutableList() }
            additionalProperties = targetListResponse.additionalProperties.toMutableMap()
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun targets(targets: List<ConnectionPolicyTarget>) = targets(JsonField.of(targets))

        /**
         * Sets [Builder.targets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targets] with a well-typed
         * `List<ConnectionPolicyTarget>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun targets(targets: JsonField<List<ConnectionPolicyTarget>>) = apply {
            this.targets = targets.map { it.toMutableList() }
        }

        /**
         * Adds a single [ConnectionPolicyTarget] to [targets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTarget(target: ConnectionPolicyTarget) = apply {
            targets =
                (targets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("targets", it).add(target)
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

        /**
         * Returns an immutable instance of [TargetListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TargetListResponse =
            TargetListResponse(
                meta,
                (targets ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TargetListResponse = apply {
        if (validated) {
            return@apply
        }

        meta().ifPresent { it.validate() }
        targets().ifPresent { it.forEach { it.validate() } }
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
        (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (targets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Meta
    private constructor(
        private val firstPageUrl: JsonField<String>,
        private val key: JsonField<String>,
        private val nextPageUrl: JsonField<String>,
        private val page: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val previousPageUrl: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_page_url")
            @ExcludeMissing
            firstPageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("next_page_url")
            @ExcludeMissing
            nextPageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous_page_url")
            @ExcludeMissing
            previousPageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            firstPageUrl,
            key,
            nextPageUrl,
            page,
            pageSize,
            previousPageUrl,
            url,
            mutableMapOf(),
        )

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun firstPageUrl(): Optional<String> = firstPageUrl.getOptional("first_page_url")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun key(): Optional<String> = key.getOptional("key")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nextPageUrl(): Optional<String> = nextPageUrl.getOptional("next_page_url")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun page(): Optional<Long> = page.getOptional("page")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun previousPageUrl(): Optional<String> = previousPageUrl.getOptional("previous_page_url")

        /**
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TwilioVoiceOpenAPIInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (firstPageUrl.asKnown().isPresent) 1 else 0) +
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (nextPageUrl.asKnown().isPresent) 1 else 0) +
                (if (page.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (previousPageUrl.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is TargetListResponse && meta == other.meta && targets == other.targets && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(meta, targets, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TargetListResponse{meta=$meta, targets=$targets, additionalProperties=$additionalProperties}"
}
