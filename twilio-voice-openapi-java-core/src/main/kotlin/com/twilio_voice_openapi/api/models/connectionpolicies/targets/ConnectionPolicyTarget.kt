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
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionPolicyTarget
private constructor(
    private val accountSid: JsonField<String>,
    private val connectionPolicySid: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val enabled: JsonField<Boolean>,
    private val friendlyName: JsonField<String>,
    private val priority: JsonField<Long>,
    private val sid: JsonField<String>,
    private val target: JsonField<String>,
    private val url: JsonField<String>,
    private val weight: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_policy_sid")
        @ExcludeMissing
        connectionPolicySid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_updated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("friendly_name")
        @ExcludeMissing
        friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
    ) : this(
        accountSid,
        connectionPolicySid,
        dateCreated,
        dateUpdated,
        enabled,
        friendlyName,
        priority,
        sid,
        target,
        url,
        weight,
        mutableMapOf(),
    )

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Target
     * resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid.getNullable("account_sid"))

    /**
     * The SID of the Connection Policy that owns the Target.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun connectionPolicySid(): Optional<String> =
        Optional.ofNullable(connectionPolicySid.getNullable("connection_policy_sid"))

    /**
     * The date and time in GMT when the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateCreated.getNullable("date_created"))

    /**
     * The date and time in GMT when the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateUpdated.getNullable("date_updated"))

    /**
     * Whether the target is enabled. The default is `true`.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    /**
     * The string that you assigned to describe the resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> =
        Optional.ofNullable(friendlyName.getNullable("friendly_name"))

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the
     * default is 10. The lowest number represents the most important target.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = Optional.ofNullable(priority.getNullable("priority"))

    /**
     * The unique string that we created to identify the Target resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sid(): Optional<String> = Optional.ofNullable(sid.getNullable("sid"))

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips`
     * is NOT supported.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun target(): Optional<String> = Optional.ofNullable(target.getNullable("target"))

    /**
     * The absolute URL of the resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * The value that determines the relative share of the load the Target should receive compared
     * to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and
     * the default is 10. Targets with higher values receive more load than those with lower ones
     * with the same priority.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = Optional.ofNullable(weight.getNullable("weight"))

    /**
     * Returns the raw JSON value of [accountSid].
     *
     * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * Returns the raw JSON value of [connectionPolicySid].
     *
     * Unlike [connectionPolicySid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connection_policy_sid")
    @ExcludeMissing
    fun _connectionPolicySid(): JsonField<String> = connectionPolicySid

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
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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

        /** Returns a mutable builder for constructing an instance of [ConnectionPolicyTarget]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionPolicyTarget]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var connectionPolicySid: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Long> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var target: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var weight: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionPolicyTarget: ConnectionPolicyTarget) = apply {
            accountSid = connectionPolicyTarget.accountSid
            connectionPolicySid = connectionPolicyTarget.connectionPolicySid
            dateCreated = connectionPolicyTarget.dateCreated
            dateUpdated = connectionPolicyTarget.dateUpdated
            enabled = connectionPolicyTarget.enabled
            friendlyName = connectionPolicyTarget.friendlyName
            priority = connectionPolicyTarget.priority
            sid = connectionPolicyTarget.sid
            target = connectionPolicyTarget.target
            url = connectionPolicyTarget.url
            weight = connectionPolicyTarget.weight
            additionalProperties = connectionPolicyTarget.additionalProperties.toMutableMap()
        }

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Target resource.
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

        /** The SID of the Connection Policy that owns the Target. */
        fun connectionPolicySid(connectionPolicySid: String?) =
            connectionPolicySid(JsonField.ofNullable(connectionPolicySid))

        /**
         * Alias for calling [Builder.connectionPolicySid] with `connectionPolicySid.orElse(null)`.
         */
        fun connectionPolicySid(connectionPolicySid: Optional<String>) =
            connectionPolicySid(connectionPolicySid.getOrNull())

        /**
         * Sets [Builder.connectionPolicySid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionPolicySid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionPolicySid(connectionPolicySid: JsonField<String>) = apply {
            this.connectionPolicySid = connectionPolicySid
        }

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

        /** Whether the target is enabled. The default is `true`. */
        fun enabled(enabled: Boolean?) = enabled(JsonField.ofNullable(enabled))

        /**
         * Alias for [Builder.enabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

        /** Alias for calling [Builder.enabled] with `enabled.orElse(null)`. */
        fun enabled(enabled: Optional<Boolean>) = enabled(enabled.getOrNull())

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

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

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and
         * the default is 10. The lowest number represents the most important target.
         */
        fun priority(priority: Long) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /** The unique string that we created to identify the Target resource. */
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

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         */
        fun target(target: String?) = target(JsonField.ofNullable(target))

        /** Alias for calling [Builder.target] with `target.orElse(null)`. */
        fun target(target: Optional<String>) = target(target.getOrNull())

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<String>) = apply { this.target = target }

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

        /**
         * The value that determines the relative share of the load the Target should receive
         * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
         * inclusive, and the default is 10. Targets with higher values receive more load than those
         * with lower ones with the same priority.
         */
        fun weight(weight: Long) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
         * Returns an immutable instance of [ConnectionPolicyTarget].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionPolicyTarget =
            ConnectionPolicyTarget(
                accountSid,
                connectionPolicySid,
                dateCreated,
                dateUpdated,
                enabled,
                friendlyName,
                priority,
                sid,
                target,
                url,
                weight,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionPolicyTarget = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        connectionPolicySid()
        dateCreated()
        dateUpdated()
        enabled()
        friendlyName()
        priority()
        sid()
        target()
        url()
        weight()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionPolicyTarget && accountSid == other.accountSid && connectionPolicySid == other.connectionPolicySid && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && enabled == other.enabled && friendlyName == other.friendlyName && priority == other.priority && sid == other.sid && target == other.target && url == other.url && weight == other.weight && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountSid, connectionPolicySid, dateCreated, dateUpdated, enabled, friendlyName, priority, sid, target, url, weight, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionPolicyTarget{accountSid=$accountSid, connectionPolicySid=$connectionPolicySid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, enabled=$enabled, friendlyName=$friendlyName, priority=$priority, sid=$sid, target=$target, url=$url, weight=$weight, additionalProperties=$additionalProperties}"
}
