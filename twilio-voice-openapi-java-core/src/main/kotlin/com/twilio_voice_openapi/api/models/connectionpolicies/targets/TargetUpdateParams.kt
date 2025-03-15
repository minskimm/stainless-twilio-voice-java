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
import com.twilio_voice_openapi.api.core.NoAutoDetect
import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.checkRequired
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Objects
import java.util.Optional

class TargetUpdateParams
private constructor(
    private val connectionPolicySid: String,
    private val sid: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun connectionPolicySid(): String = connectionPolicySid

    fun sid(): String = sid

    /**
     * Whether the Target is enabled.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up
     * to 255 characters long.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = body.friendlyName()

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive. The
     * lowest number represents the most important target.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = body.priority()

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips`
     * is NOT supported.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun target(): Optional<String> = body.target()

    /**
     * The value that determines the relative share of the load the Target should receive compared
     * to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive.
     * Targets with higher values receive more load than those with lower ones with the same
     * priority.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = body.weight()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _friendlyName(): JsonField<String> = body._friendlyName()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<Long> = body._priority()

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _target(): JsonField<String> = body._target()

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _weight(): JsonField<Long> = body._weight()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> connectionPolicySid
            1 -> sid
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("Enabled")
        @ExcludeMissing
        private val enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("FriendlyName")
        @ExcludeMissing
        private val friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("Priority")
        @ExcludeMissing
        private val priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("Target")
        @ExcludeMissing
        private val target: JsonField<String> = JsonMissing.of(),
        @JsonProperty("Weight")
        @ExcludeMissing
        private val weight: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether the Target is enabled.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("Enabled"))

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun friendlyName(): Optional<String> =
            Optional.ofNullable(friendlyName.getNullable("FriendlyName"))

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive. The
         * lowest number represents the most important target.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Optional<Long> = Optional.ofNullable(priority.getNullable("Priority"))

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun target(): Optional<String> = Optional.ofNullable(target.getNullable("Target"))

        /**
         * The value that determines the relative share of the load the Target should receive
         * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
         * inclusive. Targets with higher values receive more load than those with lower ones with
         * the same priority.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun weight(): Optional<Long> = Optional.ofNullable(weight.getNullable("Weight"))

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [friendlyName].
         *
         * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("FriendlyName")
        @ExcludeMissing
        fun _friendlyName(): JsonField<String> = friendlyName

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Target") @ExcludeMissing fun _target(): JsonField<String> = target

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            enabled()
            friendlyName()
            priority()
            target()
            weight()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var friendlyName: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Long> = JsonMissing.of()
            private var target: JsonField<String> = JsonMissing.of()
            private var weight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                enabled = body.enabled
                friendlyName = body.friendlyName
                priority = body.priority
                target = body.target
                weight = body.weight
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Whether the Target is enabled. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * A descriptive string that you create to describe the resource. It is not unique and
             * can be up to 255 characters long.
             */
            fun friendlyName(friendlyName: String) = friendlyName(JsonField.of(friendlyName))

            /**
             * Sets [Builder.friendlyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.friendlyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun friendlyName(friendlyName: JsonField<String>) = apply {
                this.friendlyName = friendlyName
            }

            /**
             * The relative importance of the target. Can be an integer from 0 to 65535, inclusive.
             * The lowest number represents the most important target.
             */
            fun priority(priority: Long) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

            /**
             * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
             * `sips` is NOT supported.
             */
            fun target(target: String) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<String>) = apply { this.target = target }

            /**
             * The value that determines the relative share of the load the Target should receive
             * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
             * inclusive. Targets with higher values receive more load than those with lower ones
             * with the same priority.
             */
            fun weight(weight: Long) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            fun build(): Body =
                Body(
                    enabled,
                    friendlyName,
                    priority,
                    target,
                    weight,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && enabled == other.enabled && friendlyName == other.friendlyName && priority == other.priority && target == other.target && weight == other.weight && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(enabled, friendlyName, priority, target, weight, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{enabled=$enabled, friendlyName=$friendlyName, priority=$priority, target=$target, weight=$weight, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TargetUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .connectionPolicySid()
         * .sid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TargetUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var connectionPolicySid: String? = null
        private var sid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(targetUpdateParams: TargetUpdateParams) = apply {
            connectionPolicySid = targetUpdateParams.connectionPolicySid
            sid = targetUpdateParams.sid
            body = targetUpdateParams.body.toBuilder()
            additionalHeaders = targetUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = targetUpdateParams.additionalQueryParams.toBuilder()
        }

        fun connectionPolicySid(connectionPolicySid: String) = apply {
            this.connectionPolicySid = connectionPolicySid
        }

        fun sid(sid: String) = apply { this.sid = sid }

        /** Whether the Target is enabled. */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
         */
        fun friendlyName(friendlyName: String) = apply { body.friendlyName(friendlyName) }

        /**
         * Sets [Builder.friendlyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            body.friendlyName(friendlyName)
        }

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive. The
         * lowest number represents the most important target.
         */
        fun priority(priority: Long) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { body.priority(priority) }

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema.
         * `sips` is NOT supported.
         */
        fun target(target: String) = apply { body.target(target) }

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<String>) = apply { body.target(target) }

        /**
         * The value that determines the relative share of the load the Target should receive
         * compared to other Targets with the same priority. Can be an integer from 1 to 65535,
         * inclusive. Targets with higher values receive more load than those with lower ones with
         * the same priority.
         */
        fun weight(weight: Long) = apply { body.weight(weight) }

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { body.weight(weight) }

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

        fun build(): TargetUpdateParams =
            TargetUpdateParams(
                checkRequired("connectionPolicySid", connectionPolicySid),
                checkRequired("sid", sid),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TargetUpdateParams && connectionPolicySid == other.connectionPolicySid && sid == other.sid && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionPolicySid, sid, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TargetUpdateParams{connectionPolicySid=$connectionPolicySid, sid=$sid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
