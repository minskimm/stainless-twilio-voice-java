// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class ConnectionPolicy
@JsonCreator
private constructor(
    @JsonProperty("account_sid")
    @ExcludeMissing
    private val accountSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date_created")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date_updated")
    @ExcludeMissing
    private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("friendly_name")
    @ExcludeMissing
    private val friendlyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("links") @ExcludeMissing private val links: JsonValue = JsonMissing.of(),
    @JsonProperty("sid") @ExcludeMissing private val sid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
     * Connection Policy resource.
     */
    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid.getNullable("account_sid"))

    /**
     * The date and time in GMT when the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    fun dateCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateCreated.getNullable("date_created"))

    /**
     * The date and time in GMT when the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    fun dateUpdated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateUpdated.getNullable("date_updated"))

    /** The string that you assigned to describe the resource. */
    fun friendlyName(): Optional<String> =
        Optional.ofNullable(friendlyName.getNullable("friendly_name"))

    /** The URLs of related resources. */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonValue = links

    /** The unique string that we created to identify the Connection Policy resource. */
    fun sid(): Optional<String> = Optional.ofNullable(sid.getNullable("sid"))

    /** The absolute URL of the resource. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
     * Connection Policy resource.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * The date and time in GMT when the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * The date and time in GMT when the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /** The string that you assigned to describe the resource. */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /** The unique string that we created to identify the Connection Policy resource. */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /** The absolute URL of the resource. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConnectionPolicy = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        dateCreated()
        dateUpdated()
        friendlyName()
        sid()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ConnectionPolicy]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionPolicy]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var links: JsonValue = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionPolicy: ConnectionPolicy) = apply {
            accountSid = connectionPolicy.accountSid
            dateCreated = connectionPolicy.dateCreated
            dateUpdated = connectionPolicy.dateUpdated
            friendlyName = connectionPolicy.friendlyName
            links = connectionPolicy.links
            sid = connectionPolicy.sid
            url = connectionPolicy.url
            additionalProperties = connectionPolicy.additionalProperties.toMutableMap()
        }

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Connection Policy resource.
         */
        fun accountSid(accountSid: String?) = accountSid(JsonField.ofNullable(accountSid))

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Connection Policy resource.
         */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Connection Policy resource.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /**
         * The date and time in GMT when the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: OffsetDateTime?) =
            dateCreated(JsonField.ofNullable(dateCreated))

        /**
         * The date and time in GMT when the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: Optional<OffsetDateTime>) =
            dateCreated(dateCreated.getOrNull())

        /**
         * The date and time in GMT when the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /**
         * The date and time in GMT when the resource was last updated specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateUpdated(dateUpdated: OffsetDateTime?) =
            dateUpdated(JsonField.ofNullable(dateUpdated))

        /**
         * The date and time in GMT when the resource was last updated specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateUpdated(dateUpdated: Optional<OffsetDateTime>) =
            dateUpdated(dateUpdated.getOrNull())

        /**
         * The date and time in GMT when the resource was last updated specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: String?) = friendlyName(JsonField.ofNullable(friendlyName))

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: Optional<String>) = friendlyName(friendlyName.getOrNull())

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        /** The URLs of related resources. */
        fun links(links: JsonValue) = apply { this.links = links }

        /** The unique string that we created to identify the Connection Policy resource. */
        fun sid(sid: String?) = sid(JsonField.ofNullable(sid))

        /** The unique string that we created to identify the Connection Policy resource. */
        fun sid(sid: Optional<String>) = sid(sid.getOrNull())

        /** The unique string that we created to identify the Connection Policy resource. */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** The absolute URL of the resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The absolute URL of the resource. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** The absolute URL of the resource. */
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

        fun build(): ConnectionPolicy =
            ConnectionPolicy(
                accountSid,
                dateCreated,
                dateUpdated,
                friendlyName,
                links,
                sid,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionPolicy && accountSid == other.accountSid && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && friendlyName == other.friendlyName && links == other.links && sid == other.sid && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountSid, dateCreated, dateUpdated, friendlyName, links, sid, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionPolicy{accountSid=$accountSid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, friendlyName=$friendlyName, links=$links, sid=$sid, url=$url, additionalProperties=$additionalProperties}"
}
