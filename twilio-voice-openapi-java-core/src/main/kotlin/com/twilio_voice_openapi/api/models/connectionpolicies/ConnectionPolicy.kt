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
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionPolicy
private constructor(
    private val accountSid: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val friendlyName: JsonField<String>,
    private val links: JsonValue,
    private val sid: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_updated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("friendly_name")
        @ExcludeMissing
        friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonValue = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(accountSid, dateCreated, dateUpdated, friendlyName, links, sid, url, mutableMapOf())

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
     * Connection Policy resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

    /**
     * The date and time in GMT when the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateCreated(): Optional<OffsetDateTime> = dateCreated.getOptional("date_created")

    /**
     * The date and time in GMT when the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<OffsetDateTime> = dateUpdated.getOptional("date_updated")

    /**
     * The string that you assigned to describe the resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = friendlyName.getOptional("friendly_name")

    /** The URLs of related resources. */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonValue = links

    /**
     * The unique string that we created to identify the Connection Policy resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

    /**
     * The absolute URL of the resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [accountSid].
     *
     * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

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
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

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

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * Sets [Builder.accountSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /**
         * The date and time in GMT when the resource was created specified in
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
         * The date and time in GMT when the resource was last updated specified in
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

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: String?) = friendlyName(JsonField.ofNullable(friendlyName))

        /** Alias for calling [Builder.friendlyName] with `friendlyName.orElse(null)`. */
        fun friendlyName(friendlyName: Optional<String>) = friendlyName(friendlyName.getOrNull())

        /**
         * Sets [Builder.friendlyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        /** The URLs of related resources. */
        fun links(links: JsonValue) = apply { this.links = links }

        /** The unique string that we created to identify the Connection Policy resource. */
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
         * Returns an immutable instance of [ConnectionPolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionPolicy =
            ConnectionPolicy(
                accountSid,
                dateCreated,
                dateUpdated,
                friendlyName,
                links,
                sid,
                url,
                additionalProperties.toMutableMap(),
            )
    }

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
        (if (accountSid.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (friendlyName.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

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
