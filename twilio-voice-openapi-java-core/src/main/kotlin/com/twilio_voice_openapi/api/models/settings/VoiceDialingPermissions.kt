// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.settings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.twilio_voice_openapi.api.core.ExcludeMissing
import com.twilio_voice_openapi.api.core.JsonField
import com.twilio_voice_openapi.api.core.JsonMissing
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VoiceDialingPermissions
private constructor(
    private val dialingPermissionsInheritance: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dialing_permissions_inheritance")
        @ExcludeMissing
        dialingPermissionsInheritance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(dialingPermissionsInheritance, url, mutableMapOf())

    /**
     * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
     * otherwise `false`.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dialingPermissionsInheritance(): Optional<Boolean> =
        dialingPermissionsInheritance.getOptional("dialing_permissions_inheritance")

    /**
     * The absolute URL of this resource.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [dialingPermissionsInheritance].
     *
     * Unlike [dialingPermissionsInheritance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dialing_permissions_inheritance")
    @ExcludeMissing
    fun _dialingPermissionsInheritance(): JsonField<Boolean> = dialingPermissionsInheritance

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

        /** Returns a mutable builder for constructing an instance of [VoiceDialingPermissions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceDialingPermissions]. */
    class Builder internal constructor() {

        private var dialingPermissionsInheritance: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceDialingPermissions: VoiceDialingPermissions) = apply {
            dialingPermissionsInheritance = voiceDialingPermissions.dialingPermissionsInheritance
            url = voiceDialingPermissions.url
            additionalProperties = voiceDialingPermissions.additionalProperties.toMutableMap()
        }

        /**
         * `true` if the sub-account will inherit voice dialing permissions from the Master Project;
         * otherwise `false`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Boolean?) =
            dialingPermissionsInheritance(JsonField.ofNullable(dialingPermissionsInheritance))

        /**
         * Alias for [Builder.dialingPermissionsInheritance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Boolean) =
            dialingPermissionsInheritance(dialingPermissionsInheritance as Boolean?)

        /**
         * Alias for calling [Builder.dialingPermissionsInheritance] with
         * `dialingPermissionsInheritance.orElse(null)`.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: Optional<Boolean>) =
            dialingPermissionsInheritance(dialingPermissionsInheritance.getOrNull())

        /**
         * Sets [Builder.dialingPermissionsInheritance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dialingPermissionsInheritance] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun dialingPermissionsInheritance(dialingPermissionsInheritance: JsonField<Boolean>) =
            apply {
                this.dialingPermissionsInheritance = dialingPermissionsInheritance
            }

        /** The absolute URL of this resource. */
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
         * Returns an immutable instance of [VoiceDialingPermissions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceDialingPermissions =
            VoiceDialingPermissions(
                dialingPermissionsInheritance,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoiceDialingPermissions = apply {
        if (validated) {
            return@apply
        }

        dialingPermissionsInheritance()
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
        (if (dialingPermissionsInheritance.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VoiceDialingPermissions && dialingPermissionsInheritance == other.dialingPermissionsInheritance && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dialingPermissionsInheritance, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceDialingPermissions{dialingPermissionsInheritance=$dialingPermissionsInheritance, url=$url, additionalProperties=$additionalProperties}"
}
