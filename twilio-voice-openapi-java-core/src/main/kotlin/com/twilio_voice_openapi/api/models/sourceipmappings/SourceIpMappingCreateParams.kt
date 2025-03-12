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
import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.checkRequired
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import java.util.Objects

class SourceIpMappingCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The Twilio-provided string that uniquely identifies the IP Record resource to map from. */
    fun ipRecordSid(): String = body.ipRecordSid()

    /** The SID of the SIP Domain that the IP Record should be mapped to. */
    fun sipDomainSid(): String = body.sipDomainSid()

    /** The Twilio-provided string that uniquely identifies the IP Record resource to map from. */
    fun _ipRecordSid(): JsonField<String> = body._ipRecordSid()

    /** The SID of the SIP Domain that the IP Record should be mapped to. */
    fun _sipDomainSid(): JsonField<String> = body._sipDomainSid()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("IpRecordSid")
        @ExcludeMissing
        private val ipRecordSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("SipDomainSid")
        @ExcludeMissing
        private val sipDomainSid: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        fun ipRecordSid(): String = ipRecordSid.getRequired("IpRecordSid")

        /** The SID of the SIP Domain that the IP Record should be mapped to. */
        fun sipDomainSid(): String = sipDomainSid.getRequired("SipDomainSid")

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        @JsonProperty("IpRecordSid")
        @ExcludeMissing
        fun _ipRecordSid(): JsonField<String> = ipRecordSid

        /** The SID of the SIP Domain that the IP Record should be mapped to. */
        @JsonProperty("SipDomainSid")
        @ExcludeMissing
        fun _sipDomainSid(): JsonField<String> = sipDomainSid

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ipRecordSid()
            sipDomainSid()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .ipRecordSid()
             * .sipDomainSid()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var ipRecordSid: JsonField<String>? = null
            private var sipDomainSid: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                ipRecordSid = body.ipRecordSid
                sipDomainSid = body.sipDomainSid
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The Twilio-provided string that uniquely identifies the IP Record resource to map
             * from.
             */
            fun ipRecordSid(ipRecordSid: String) = ipRecordSid(JsonField.of(ipRecordSid))

            /**
             * The Twilio-provided string that uniquely identifies the IP Record resource to map
             * from.
             */
            fun ipRecordSid(ipRecordSid: JsonField<String>) = apply {
                this.ipRecordSid = ipRecordSid
            }

            /** The SID of the SIP Domain that the IP Record should be mapped to. */
            fun sipDomainSid(sipDomainSid: String) = sipDomainSid(JsonField.of(sipDomainSid))

            /** The SID of the SIP Domain that the IP Record should be mapped to. */
            fun sipDomainSid(sipDomainSid: JsonField<String>) = apply {
                this.sipDomainSid = sipDomainSid
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

            fun build(): Body =
                Body(
                    checkRequired("ipRecordSid", ipRecordSid),
                    checkRequired("sipDomainSid", sipDomainSid),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && ipRecordSid == other.ipRecordSid && sipDomainSid == other.sipDomainSid && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ipRecordSid, sipDomainSid, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ipRecordSid=$ipRecordSid, sipDomainSid=$sipDomainSid, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceIpMappingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .ipRecordSid()
         * .sipDomainSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceIpMappingCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sourceIpMappingCreateParams: SourceIpMappingCreateParams) = apply {
            body = sourceIpMappingCreateParams.body.toBuilder()
            additionalHeaders = sourceIpMappingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sourceIpMappingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        fun ipRecordSid(ipRecordSid: String) = apply { body.ipRecordSid(ipRecordSid) }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        fun ipRecordSid(ipRecordSid: JsonField<String>) = apply { body.ipRecordSid(ipRecordSid) }

        /** The SID of the SIP Domain that the IP Record should be mapped to. */
        fun sipDomainSid(sipDomainSid: String) = apply { body.sipDomainSid(sipDomainSid) }

        /** The SID of the SIP Domain that the IP Record should be mapped to. */
        fun sipDomainSid(sipDomainSid: JsonField<String>) = apply {
            body.sipDomainSid(sipDomainSid)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): SourceIpMappingCreateParams =
            SourceIpMappingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SourceIpMappingCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SourceIpMappingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
