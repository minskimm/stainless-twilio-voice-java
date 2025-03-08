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
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class DialingPermissions
@JsonCreator
private constructor(
    @JsonProperty("dialing_permissions_inheritance")
    @ExcludeMissing
    private val dialingPermissionsInheritance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
     * otherwise `false`.
     */
    fun dialingPermissionsInheritance(): Optional<Boolean> =
        Optional.ofNullable(
            dialingPermissionsInheritance.getNullable("dialing_permissions_inheritance")
        )

    /** The absolute URL of this resource. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
     * otherwise `false`.
     */
    @JsonProperty("dialing_permissions_inheritance")
    @ExcludeMissing
    fun _dialingPermissionsInheritance(): JsonField<Boolean> = dialingPermissionsInheritance

    /** The absolute URL of this resource. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DialingPermissions = apply {
        if (validated) {
            return@apply
        }

        dialingPermissionsInheritance()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [DialingPermissions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialingPermissions]. */
    class Builder internal constructor() {

        private var dialingPermissionsInheritance: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dialingPermissions: DialingPermissions) = apply {
            dialingPermissionsInheritance = dialingPermissions.dialingPermissionsInheritance
            url = dialingPermissions.url
            additionalProperties = dialingPermissions.additionalProperties.toMutableMap()
        }

        /**
         * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
         * otherwise `false`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Boolean?) =
            dialingPermissionsInheritance(JsonField.ofNullable(dialingPermissionsInheritance))

        /**
         * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
         * otherwise `false`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Boolean) =
            dialingPermissionsInheritance(dialingPermissionsInheritance as Boolean?)

        /**
         * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
         * otherwise `false`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Optional<Boolean>) =
            dialingPermissionsInheritance(dialingPermissionsInheritance.getOrNull())

        /**
         * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
         * otherwise `false`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: JsonField<Boolean>) =
            apply {
                this.dialingPermissionsInheritance = dialingPermissionsInheritance
            }

        /** The absolute URL of this resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The absolute URL of this resource. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** The absolute URL of this resource. */
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

        fun build(): DialingPermissions =
            DialingPermissions(
                dialingPermissionsInheritance,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DialingPermissions && dialingPermissionsInheritance == other.dialingPermissionsInheritance && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dialingPermissionsInheritance, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialingPermissions{dialingPermissionsInheritance=$dialingPermissionsInheritance, url=$url, additionalProperties=$additionalProperties}"
}
