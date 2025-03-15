// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions

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
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class DialingPermissionCreateBulkCountryUpdatesResponse
@JsonCreator
private constructor(
    @JsonProperty("update_count")
    @ExcludeMissing
    private val updateCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("update_request")
    @ExcludeMissing
    private val updateRequest: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The number of countries updated
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updateCount(): Optional<Long> = Optional.ofNullable(updateCount.getNullable("update_count"))

    /**
     * A bulk update request to change voice dialing country permissions stored as a URL-encoded,
     * JSON array of update objects. For example : `[ { "iso_code": "GB",
     * "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true",
     * "high_risk_tollfraud_numbers_enabled": "false" } ]`
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updateRequest(): Optional<String> =
        Optional.ofNullable(updateRequest.getNullable("update_request"))

    /**
     * Returns the raw JSON value of [updateCount].
     *
     * Unlike [updateCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("update_count") @ExcludeMissing fun _updateCount(): JsonField<Long> = updateCount

    /**
     * Returns the raw JSON value of [updateRequest].
     *
     * Unlike [updateRequest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("update_request")
    @ExcludeMissing
    fun _updateRequest(): JsonField<String> = updateRequest

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DialingPermissionCreateBulkCountryUpdatesResponse = apply {
        if (validated) {
            return@apply
        }

        updateCount()
        updateRequest()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DialingPermissionCreateBulkCountryUpdatesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialingPermissionCreateBulkCountryUpdatesResponse]. */
    class Builder internal constructor() {

        private var updateCount: JsonField<Long> = JsonMissing.of()
        private var updateRequest: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dialingPermissionCreateBulkCountryUpdatesResponse:
                DialingPermissionCreateBulkCountryUpdatesResponse
        ) = apply {
            updateCount = dialingPermissionCreateBulkCountryUpdatesResponse.updateCount
            updateRequest = dialingPermissionCreateBulkCountryUpdatesResponse.updateRequest
            additionalProperties =
                dialingPermissionCreateBulkCountryUpdatesResponse.additionalProperties
                    .toMutableMap()
        }

        /** The number of countries updated */
        fun updateCount(updateCount: Long) = updateCount(JsonField.of(updateCount))

        /**
         * Sets [Builder.updateCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updateCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updateCount(updateCount: JsonField<Long>) = apply { this.updateCount = updateCount }

        /**
         * A bulk update request to change voice dialing country permissions stored as a
         * URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB",
         * "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true",
         * "high_risk_tollfraud_numbers_enabled": "false" } ]`
         */
        fun updateRequest(updateRequest: String?) =
            updateRequest(JsonField.ofNullable(updateRequest))

        /** Alias for calling [Builder.updateRequest] with `updateRequest.orElse(null)`. */
        fun updateRequest(updateRequest: Optional<String>) =
            updateRequest(updateRequest.getOrNull())

        /**
         * Sets [Builder.updateRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updateRequest] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updateRequest(updateRequest: JsonField<String>) = apply {
            this.updateRequest = updateRequest
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

        fun build(): DialingPermissionCreateBulkCountryUpdatesResponse =
            DialingPermissionCreateBulkCountryUpdatesResponse(
                updateCount,
                updateRequest,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DialingPermissionCreateBulkCountryUpdatesResponse && updateCount == other.updateCount && updateRequest == other.updateRequest && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(updateCount, updateRequest, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialingPermissionCreateBulkCountryUpdatesResponse{updateCount=$updateCount, updateRequest=$updateRequest, additionalProperties=$additionalProperties}"
}
