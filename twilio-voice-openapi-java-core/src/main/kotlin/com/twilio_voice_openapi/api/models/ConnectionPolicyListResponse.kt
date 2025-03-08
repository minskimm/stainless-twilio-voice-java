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
class ConnectionPolicyListResponse
@JsonCreator
private constructor(
    @JsonProperty("connection_policies")
    @ExcludeMissing
    private val connectionPolicies: JsonField<List<ConnectionPolicy>> = JsonMissing.of(),
    @JsonProperty("meta") @ExcludeMissing private val meta: JsonField<Meta> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun connectionPolicies(): Optional<List<ConnectionPolicy>> =
        Optional.ofNullable(connectionPolicies.getNullable("connection_policies"))

    fun meta(): Optional<Meta> = Optional.ofNullable(meta.getNullable("meta"))

    @JsonProperty("connection_policies")
    @ExcludeMissing
    fun _connectionPolicies(): JsonField<List<ConnectionPolicy>> = connectionPolicies

    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConnectionPolicyListResponse = apply {
        if (validated) {
            return@apply
        }

        connectionPolicies().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConnectionPolicyListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionPolicyListResponse]. */
    class Builder internal constructor() {

        private var connectionPolicies: JsonField<MutableList<ConnectionPolicy>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionPolicyListResponse: ConnectionPolicyListResponse) = apply {
            connectionPolicies =
                connectionPolicyListResponse.connectionPolicies.map { it.toMutableList() }
            meta = connectionPolicyListResponse.meta
            additionalProperties = connectionPolicyListResponse.additionalProperties.toMutableMap()
        }

        fun connectionPolicies(connectionPolicies: List<ConnectionPolicy>) =
            connectionPolicies(JsonField.of(connectionPolicies))

        fun connectionPolicies(connectionPolicies: JsonField<List<ConnectionPolicy>>) = apply {
            this.connectionPolicies = connectionPolicies.map { it.toMutableList() }
        }

        fun addConnectionPolicy(connectionPolicy: ConnectionPolicy) = apply {
            connectionPolicies =
                (connectionPolicies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("connectionPolicies", it).add(connectionPolicy)
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

        fun build(): ConnectionPolicyListResponse =
            ConnectionPolicyListResponse(
                (connectionPolicies ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
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

        return /* spotless:off */ other is ConnectionPolicyListResponse && connectionPolicies == other.connectionPolicies && meta == other.meta && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionPolicies, meta, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionPolicyListResponse{connectionPolicies=$connectionPolicies, meta=$meta, additionalProperties=$additionalProperties}"
}
