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
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class ConnectionPolicyTarget
@JsonCreator
private constructor(
    @JsonProperty("account_sid")
    @ExcludeMissing
    private val accountSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_policy_sid")
    @ExcludeMissing
    private val connectionPolicySid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date_created")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date_updated")
    @ExcludeMissing
    private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("friendly_name")
    @ExcludeMissing
    private val friendlyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("sid") @ExcludeMissing private val sid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("target")
    @ExcludeMissing
    private val target: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("weight") @ExcludeMissing private val weight: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Target
     * resource.
     */
    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid.getNullable("account_sid"))

    /** The SID of the Connection Policy that owns the Target. */
    fun connectionPolicySid(): Optional<String> =
        Optional.ofNullable(connectionPolicySid.getNullable("connection_policy_sid"))

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

    /** Whether the target is enabled. The default is `true`. */
    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    /** The string that you assigned to describe the resource. */
    fun friendlyName(): Optional<String> =
        Optional.ofNullable(friendlyName.getNullable("friendly_name"))

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the
     * default is 10. The lowest number represents the most important target.
     */
    fun priority(): Optional<Long> = Optional.ofNullable(priority.getNullable("priority"))

    /** The unique string that we created to identify the Target resource. */
    fun sid(): Optional<String> = Optional.ofNullable(sid.getNullable("sid"))

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips`
     * is NOT supported.
     */
    fun target(): Optional<String> = Optional.ofNullable(target.getNullable("target"))

    /** The absolute URL of the resource. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * The value that determines the relative share of the load the Target should receive compared
     * to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and
     * the default is 10. Targets with higher values receive more load than those with lower ones
     * with the same priority.
     */
    fun weight(): Optional<Long> = Optional.ofNullable(weight.getNullable("weight"))

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Target
     * resource.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /** The SID of the Connection Policy that owns the Target. */
    @JsonProperty("connection_policy_sid")
    @ExcludeMissing
    fun _connectionPolicySid(): JsonField<String> = connectionPolicySid

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

    /** Whether the target is enabled. The default is `true`. */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /** The string that you assigned to describe the resource. */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the
     * default is 10. The lowest number represents the most important target.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

    /** The unique string that we created to identify the Target resource. */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips`
     * is NOT supported.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

    /** The absolute URL of the resource. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * The value that determines the relative share of the load the Target should receive compared
     * to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and
     * the default is 10. Targets with higher values receive more load than those with lower ones
     * with the same priority.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Target resource.
         */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * Target resource.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /** The SID of the Connection Policy that owns the Target. */
        fun connectionPolicySid(connectionPolicySid: String?) =
            connectionPolicySid(JsonField.ofNullable(connectionPolicySid))

        /** The SID of the Connection Policy that owns the Target. */
        fun connectionPolicySid(connectionPolicySid: Optional<String>) =
            connectionPolicySid(connectionPolicySid.getOrNull())

        /** The SID of the Connection Policy that owns the Target. */
        fun connectionPolicySid(connectionPolicySid: JsonField<String>) = apply {
            this.connectionPolicySid = connectionPolicySid
        }

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

        /** Whether the target is enabled. The default is `true`. */
        fun enabled(enabled: Boolean?) = enabled(JsonField.ofNullable(enabled))

        /** Whether the target is enabled. The default is `true`. */
        fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

        /** Whether the target is enabled. The default is `true`. */
        fun enabled(enabled: Optional<Boolean>) = enabled(enabled.getOrNull())

        /** Whether the target is enabled. The default is `true`. */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: String?) = friendlyName(JsonField.ofNullable(friendlyName))

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: Optional<String>) = friendlyName(friendlyName.getOrNull())

        /** The string that you assigned to describe the resource. */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and
         * the default is 10. The lowest number represents the most important target.
         */
        fun priority(priority: Long) = priority(JsonField.of(priority))

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and
         * the default is 10. The lowest number represents the most important target.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /** The unique string that we created to identify the Target resource. */
        fun sid(sid: String?) = sid(JsonField.ofNullable(sid))

        /** The unique string that we created to identify the Target resource. */
        fun sid(sid: Optional<String>) = sid(sid.getOrNull())

        /** The unique string that we created to identify the Target resource. */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         */
        fun target(target: String?) = target(JsonField.ofNullable(target))

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         */
        fun target(target: Optional<String>) = target(target.getOrNull())

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         */
        fun target(target: JsonField<String>) = apply { this.target = target }

        /** The absolute URL of the resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The absolute URL of the resource. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** The absolute URL of the resource. */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * The value that determines the relative share of the load the Target should receive
         * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
         * inclusive, and the default is 10. Targets with higher values receive more load than those
         * with lower ones with the same priority.
         */
        fun weight(weight: Long) = weight(JsonField.of(weight))

        /**
         * The value that determines the relative share of the load the Target should receive
         * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
         * inclusive, and the default is 10. Targets with higher values receive more load than those
         * with lower ones with the same priority.
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
                additionalProperties.toImmutable(),
            )
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
