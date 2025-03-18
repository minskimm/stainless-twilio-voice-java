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
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class SourceIpMapping
@JsonCreator
private constructor(
    @JsonProperty("date_created")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date_updated")
    @ExcludeMissing
    private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ip_record_sid")
    @ExcludeMissing
    private val ipRecordSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sid") @ExcludeMissing private val sid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sip_domain_sid")
    @ExcludeMissing
    private val sipDomainSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The date and time in GMT that the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateCreated.getNullable("date_created"))

    /**
     * The date and time in GMT that the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateUpdated.getNullable("date_updated"))

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ipRecordSid(): Optional<String> =
        Optional.ofNullable(ipRecordSid.getNullable("ip_record_sid"))

    /**
     * The unique string that we created to identify the IP Record resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sid(): Optional<String> = Optional.ofNullable(sid.getNullable("sid"))

    /**
     * The SID of the SIP Domain that the IP Record is mapped to.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sipDomainSid(): Optional<String> =
        Optional.ofNullable(sipDomainSid.getNullable("sip_domain_sid"))

    /**
     * The absolute URL of the resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [ipRecordSid].
     *
     * Unlike [ipRecordSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip_record_sid")
    @ExcludeMissing
    fun _ipRecordSid(): JsonField<String> = ipRecordSid

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [sipDomainSid].
     *
     * Unlike [sipDomainSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sip_domain_sid")
    @ExcludeMissing
    fun _sipDomainSid(): JsonField<String> = sipDomainSid

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

    fun validate(): SourceIpMapping = apply {
        if (validated) {
            return@apply
        }

        dateCreated()
        dateUpdated()
        ipRecordSid()
        sid()
        sipDomainSid()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SourceIpMapping]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceIpMapping]. */
    class Builder internal constructor() {

        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ipRecordSid: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var sipDomainSid: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sourceIpMapping: SourceIpMapping) = apply {
            dateCreated = sourceIpMapping.dateCreated
            dateUpdated = sourceIpMapping.dateUpdated
            ipRecordSid = sourceIpMapping.ipRecordSid
            sid = sourceIpMapping.sid
            sipDomainSid = sourceIpMapping.sipDomainSid
            url = sourceIpMapping.url
            additionalProperties = sourceIpMapping.additionalProperties.toMutableMap()
        }

        /**
         * The date and time in GMT that the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: OffsetDateTime?) =
            dateCreated(JsonField.ofNullable(dateCreated))

        /** Alias for calling [Builder.dateCreated] with `dateCreated.orElse(null)`. */
        fun dateCreated(dateCreated: Optional<OffsetDateTime>) =
            dateCreated(dateCreated.getOrNull())

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /**
         * The date and time in GMT that the resource was last updated specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateUpdated(dateUpdated: OffsetDateTime?) =
            dateUpdated(JsonField.ofNullable(dateUpdated))

        /** Alias for calling [Builder.dateUpdated] with `dateUpdated.orElse(null)`. */
        fun dateUpdated(dateUpdated: Optional<OffsetDateTime>) =
            dateUpdated(dateUpdated.getOrNull())

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        fun ipRecordSid(ipRecordSid: String?) = ipRecordSid(JsonField.ofNullable(ipRecordSid))

        /** Alias for calling [Builder.ipRecordSid] with `ipRecordSid.orElse(null)`. */
        fun ipRecordSid(ipRecordSid: Optional<String>) = ipRecordSid(ipRecordSid.getOrNull())

        /**
         * Sets [Builder.ipRecordSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipRecordSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipRecordSid(ipRecordSid: JsonField<String>) = apply { this.ipRecordSid = ipRecordSid }

        /** The unique string that we created to identify the IP Record resource. */
        fun sid(sid: String?) = sid(JsonField.ofNullable(sid))

        /** Alias for calling [Builder.sid] with `sid.orElse(null)`. */
        fun sid(sid: Optional<String>) = sid(sid.getOrNull())

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** The SID of the SIP Domain that the IP Record is mapped to. */
        fun sipDomainSid(sipDomainSid: String?) = sipDomainSid(JsonField.ofNullable(sipDomainSid))

        /** Alias for calling [Builder.sipDomainSid] with `sipDomainSid.orElse(null)`. */
        fun sipDomainSid(sipDomainSid: Optional<String>) = sipDomainSid(sipDomainSid.getOrNull())

        /**
         * Sets [Builder.sipDomainSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipDomainSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipDomainSid(sipDomainSid: JsonField<String>) = apply {
            this.sipDomainSid = sipDomainSid
        }

        /** The absolute URL of the resource. */
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
         * Returns an immutable instance of [SourceIpMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SourceIpMapping =
            SourceIpMapping(
                dateCreated,
                dateUpdated,
                ipRecordSid,
                sid,
                sipDomainSid,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SourceIpMapping && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && ipRecordSid == other.ipRecordSid && sid == other.sid && sipDomainSid == other.sipDomainSid && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dateCreated, dateUpdated, ipRecordSid, sid, sipDomainSid, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SourceIpMapping{dateCreated=$dateCreated, dateUpdated=$dateUpdated, ipRecordSid=$ipRecordSid, sid=$sid, sipDomainSid=$sipDomainSid, url=$url, additionalProperties=$additionalProperties}"
}
