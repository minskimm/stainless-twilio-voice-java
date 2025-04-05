// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.twilio_voice_openapi.api.core.Enum
import com.twilio_voice_openapi.api.core.ExcludeMissing
import com.twilio_voice_openapi.api.core.JsonField
import com.twilio_voice_openapi.api.core.JsonMissing
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.checkRequired
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ByocTrunkUpdateParams
private constructor(
    private val sid: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sid(): String = sid

    /**
     * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound calls
     * to the BYOC Trunk from the United States and Canada automatically perform a CNAM Lookup and
     * display Caller ID data on your phone. See
     * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cnamLookupEnabled(): Optional<Boolean> = body.cnamLookupEnabled()

    /**
     * The SID of the Connection Policy that Twilio will use when routing traffic to your
     * communications infrastructure.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun connectionPolicySid(): Optional<String> = body.connectionPolicySid()

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up
     * to 255 characters long.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = body.friendlyName()

    /**
     * The SID of the SIP Domain that should be used in the `From` header of originating calls sent
     * to your SIP infrastructure. If your SIP infrastructure allows users to "call back" an
     * incoming call, configure this with a
     * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing. If
     * not configured, the from domain will default to "sip.twilio.com".
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fromDomainSid(): Optional<String> = body.fromDomainSid()

    /**
     * The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * The URL that we should call to pass status parameters (such as call ended) to your
     * application.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statusCallbackUrl(): Optional<String> = body.statusCallbackUrl()

    /**
     * The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun voiceFallbackMethod(): Optional<VoiceFallbackMethod> = body.voiceFallbackMethod()

    /**
     * The URL that we should call when an error occurs while retrieving or executing the TwiML
     * requested by `voice_url`.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun voiceFallbackUrl(): Optional<String> = body.voiceFallbackUrl()

    /**
     * The HTTP method we should use to call `voice_url`
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun voiceMethod(): Optional<VoiceMethod> = body.voiceMethod()

    /**
     * The URL we should call when the BYOC Trunk receives a call.
     *
     * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun voiceUrl(): Optional<String> = body.voiceUrl()

    /**
     * Returns the raw JSON value of [cnamLookupEnabled].
     *
     * Unlike [cnamLookupEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cnamLookupEnabled(): JsonField<Boolean> = body._cnamLookupEnabled()

    /**
     * Returns the raw JSON value of [connectionPolicySid].
     *
     * Unlike [connectionPolicySid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _connectionPolicySid(): JsonField<String> = body._connectionPolicySid()

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _friendlyName(): JsonField<String> = body._friendlyName()

    /**
     * Returns the raw JSON value of [fromDomainSid].
     *
     * Unlike [fromDomainSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fromDomainSid(): JsonField<String> = body._fromDomainSid()

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * Returns the raw JSON value of [statusCallbackUrl].
     *
     * Unlike [statusCallbackUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackUrl(): JsonField<String> = body._statusCallbackUrl()

    /**
     * Returns the raw JSON value of [voiceFallbackMethod].
     *
     * Unlike [voiceFallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _voiceFallbackMethod(): JsonField<VoiceFallbackMethod> = body._voiceFallbackMethod()

    /**
     * Returns the raw JSON value of [voiceFallbackUrl].
     *
     * Unlike [voiceFallbackUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _voiceFallbackUrl(): JsonField<String> = body._voiceFallbackUrl()

    /**
     * Returns the raw JSON value of [voiceMethod].
     *
     * Unlike [voiceMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceMethod(): JsonField<VoiceMethod> = body._voiceMethod()

    /**
     * Returns the raw JSON value of [voiceUrl].
     *
     * Unlike [voiceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceUrl(): JsonField<String> = body._voiceUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ByocTrunkUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .sid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ByocTrunkUpdateParams]. */
    class Builder internal constructor() {

        private var sid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(byocTrunkUpdateParams: ByocTrunkUpdateParams) = apply {
            sid = byocTrunkUpdateParams.sid
            body = byocTrunkUpdateParams.body.toBuilder()
            additionalHeaders = byocTrunkUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = byocTrunkUpdateParams.additionalQueryParams.toBuilder()
        }

        fun sid(sid: String) = apply { this.sid = sid }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cnamLookupEnabled]
         * - [connectionPolicySid]
         * - [friendlyName]
         * - [fromDomainSid]
         * - [statusCallbackMethod]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: Boolean) = apply {
            body.cnamLookupEnabled(cnamLookupEnabled)
        }

        /**
         * Sets [Builder.cnamLookupEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cnamLookupEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: JsonField<Boolean>) = apply {
            body.cnamLookupEnabled(cnamLookupEnabled)
        }

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        fun connectionPolicySid(connectionPolicySid: String) = apply {
            body.connectionPolicySid(connectionPolicySid)
        }

        /**
         * Sets [Builder.connectionPolicySid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionPolicySid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionPolicySid(connectionPolicySid: JsonField<String>) = apply {
            body.connectionPolicySid(connectionPolicySid)
        }

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
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(fromDomainSid: String) = apply { body.fromDomainSid(fromDomainSid) }

        /**
         * Sets [Builder.fromDomainSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromDomainSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromDomainSid(fromDomainSid: JsonField<String>) = apply {
            body.fromDomainSid(fromDomainSid)
        }

        /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * The URL that we should call to pass status parameters (such as call ended) to your
         * application.
         */
        fun statusCallbackUrl(statusCallbackUrl: String) = apply {
            body.statusCallbackUrl(statusCallbackUrl)
        }

        /**
         * Sets [Builder.statusCallbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallbackUrl(statusCallbackUrl: JsonField<String>) = apply {
            body.statusCallbackUrl(statusCallbackUrl)
        }

        /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: VoiceFallbackMethod) = apply {
            body.voiceFallbackMethod(voiceFallbackMethod)
        }

        /**
         * Sets [Builder.voiceFallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceFallbackMethod] with a well-typed
         * [VoiceFallbackMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun voiceFallbackMethod(voiceFallbackMethod: JsonField<VoiceFallbackMethod>) = apply {
            body.voiceFallbackMethod(voiceFallbackMethod)
        }

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * requested by `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: String) = apply {
            body.voiceFallbackUrl(voiceFallbackUrl)
        }

        /**
         * Sets [Builder.voiceFallbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceFallbackUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
            body.voiceFallbackUrl(voiceFallbackUrl)
        }

        /** The HTTP method we should use to call `voice_url` */
        fun voiceMethod(voiceMethod: VoiceMethod) = apply { body.voiceMethod(voiceMethod) }

        /**
         * Sets [Builder.voiceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceMethod] with a well-typed [VoiceMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
            body.voiceMethod(voiceMethod)
        }

        /** The URL we should call when the BYOC Trunk receives a call. */
        fun voiceUrl(voiceUrl: String) = apply { body.voiceUrl(voiceUrl) }

        /**
         * Sets [Builder.voiceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceUrl(voiceUrl: JsonField<String>) = apply { body.voiceUrl(voiceUrl) }

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

        /**
         * Returns an immutable instance of [ByocTrunkUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ByocTrunkUpdateParams =
            ByocTrunkUpdateParams(
                checkRequired("sid", sid),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sid
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val cnamLookupEnabled: JsonField<Boolean>,
        private val connectionPolicySid: JsonField<String>,
        private val friendlyName: JsonField<String>,
        private val fromDomainSid: JsonField<String>,
        private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
        private val statusCallbackUrl: JsonField<String>,
        private val voiceFallbackMethod: JsonField<VoiceFallbackMethod>,
        private val voiceFallbackUrl: JsonField<String>,
        private val voiceMethod: JsonField<VoiceMethod>,
        private val voiceUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("CnamLookupEnabled")
            @ExcludeMissing
            cnamLookupEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ConnectionPolicySid")
            @ExcludeMissing
            connectionPolicySid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("FriendlyName")
            @ExcludeMissing
            friendlyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("FromDomainSid")
            @ExcludeMissing
            fromDomainSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("StatusCallbackUrl")
            @ExcludeMissing
            statusCallbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("VoiceFallbackMethod")
            @ExcludeMissing
            voiceFallbackMethod: JsonField<VoiceFallbackMethod> = JsonMissing.of(),
            @JsonProperty("VoiceFallbackUrl")
            @ExcludeMissing
            voiceFallbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("VoiceMethod")
            @ExcludeMissing
            voiceMethod: JsonField<VoiceMethod> = JsonMissing.of(),
            @JsonProperty("VoiceUrl") @ExcludeMissing voiceUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            cnamLookupEnabled,
            connectionPolicySid,
            friendlyName,
            fromDomainSid,
            statusCallbackMethod,
            statusCallbackUrl,
            voiceFallbackMethod,
            voiceFallbackUrl,
            voiceMethod,
            voiceUrl,
            mutableMapOf(),
        )

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cnamLookupEnabled(): Optional<Boolean> =
            cnamLookupEnabled.getOptional("CnamLookupEnabled")

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun connectionPolicySid(): Optional<String> =
            connectionPolicySid.getOptional("ConnectionPolicySid")

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun friendlyName(): Optional<String> = friendlyName.getOptional("FriendlyName")

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromDomainSid(): Optional<String> = fromDomainSid.getOptional("FromDomainSid")

        /**
         * The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            statusCallbackMethod.getOptional("StatusCallbackMethod")

        /**
         * The URL that we should call to pass status parameters (such as call ended) to your
         * application.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun statusCallbackUrl(): Optional<String> =
            statusCallbackUrl.getOptional("StatusCallbackUrl")

        /**
         * The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun voiceFallbackMethod(): Optional<VoiceFallbackMethod> =
            voiceFallbackMethod.getOptional("VoiceFallbackMethod")

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * requested by `voice_url`.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun voiceFallbackUrl(): Optional<String> = voiceFallbackUrl.getOptional("VoiceFallbackUrl")

        /**
         * The HTTP method we should use to call `voice_url`
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun voiceMethod(): Optional<VoiceMethod> = voiceMethod.getOptional("VoiceMethod")

        /**
         * The URL we should call when the BYOC Trunk receives a call.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun voiceUrl(): Optional<String> = voiceUrl.getOptional("VoiceUrl")

        /**
         * Returns the raw JSON value of [cnamLookupEnabled].
         *
         * Unlike [cnamLookupEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("CnamLookupEnabled")
        @ExcludeMissing
        fun _cnamLookupEnabled(): JsonField<Boolean> = cnamLookupEnabled

        /**
         * Returns the raw JSON value of [connectionPolicySid].
         *
         * Unlike [connectionPolicySid], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ConnectionPolicySid")
        @ExcludeMissing
        fun _connectionPolicySid(): JsonField<String> = connectionPolicySid

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
         * Returns the raw JSON value of [fromDomainSid].
         *
         * Unlike [fromDomainSid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("FromDomainSid")
        @ExcludeMissing
        fun _fromDomainSid(): JsonField<String> = fromDomainSid

        /**
         * Returns the raw JSON value of [statusCallbackMethod].
         *
         * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * Returns the raw JSON value of [statusCallbackUrl].
         *
         * Unlike [statusCallbackUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("StatusCallbackUrl")
        @ExcludeMissing
        fun _statusCallbackUrl(): JsonField<String> = statusCallbackUrl

        /**
         * Returns the raw JSON value of [voiceFallbackMethod].
         *
         * Unlike [voiceFallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("VoiceFallbackMethod")
        @ExcludeMissing
        fun _voiceFallbackMethod(): JsonField<VoiceFallbackMethod> = voiceFallbackMethod

        /**
         * Returns the raw JSON value of [voiceFallbackUrl].
         *
         * Unlike [voiceFallbackUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("VoiceFallbackUrl")
        @ExcludeMissing
        fun _voiceFallbackUrl(): JsonField<String> = voiceFallbackUrl

        /**
         * Returns the raw JSON value of [voiceMethod].
         *
         * Unlike [voiceMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("VoiceMethod")
        @ExcludeMissing
        fun _voiceMethod(): JsonField<VoiceMethod> = voiceMethod

        /**
         * Returns the raw JSON value of [voiceUrl].
         *
         * Unlike [voiceUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("VoiceUrl") @ExcludeMissing fun _voiceUrl(): JsonField<String> = voiceUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cnamLookupEnabled: JsonField<Boolean> = JsonMissing.of()
            private var connectionPolicySid: JsonField<String> = JsonMissing.of()
            private var friendlyName: JsonField<String> = JsonMissing.of()
            private var fromDomainSid: JsonField<String> = JsonMissing.of()
            private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
            private var statusCallbackUrl: JsonField<String> = JsonMissing.of()
            private var voiceFallbackMethod: JsonField<VoiceFallbackMethod> = JsonMissing.of()
            private var voiceFallbackUrl: JsonField<String> = JsonMissing.of()
            private var voiceMethod: JsonField<VoiceMethod> = JsonMissing.of()
            private var voiceUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cnamLookupEnabled = body.cnamLookupEnabled
                connectionPolicySid = body.connectionPolicySid
                friendlyName = body.friendlyName
                fromDomainSid = body.fromDomainSid
                statusCallbackMethod = body.statusCallbackMethod
                statusCallbackUrl = body.statusCallbackUrl
                voiceFallbackMethod = body.voiceFallbackMethod
                voiceFallbackUrl = body.voiceFallbackUrl
                voiceMethod = body.voiceMethod
                voiceUrl = body.voiceUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all
             * inbound calls to the BYOC Trunk from the United States and Canada automatically
             * perform a CNAM Lookup and display Caller ID data on your phone. See
             * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
             */
            fun cnamLookupEnabled(cnamLookupEnabled: Boolean) =
                cnamLookupEnabled(JsonField.of(cnamLookupEnabled))

            /**
             * Sets [Builder.cnamLookupEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamLookupEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cnamLookupEnabled(cnamLookupEnabled: JsonField<Boolean>) = apply {
                this.cnamLookupEnabled = cnamLookupEnabled
            }

            /**
             * The SID of the Connection Policy that Twilio will use when routing traffic to your
             * communications infrastructure.
             */
            fun connectionPolicySid(connectionPolicySid: String) =
                connectionPolicySid(JsonField.of(connectionPolicySid))

            /**
             * Sets [Builder.connectionPolicySid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionPolicySid] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun connectionPolicySid(connectionPolicySid: JsonField<String>) = apply {
                this.connectionPolicySid = connectionPolicySid
            }

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
             * The SID of the SIP Domain that should be used in the `From` header of originating
             * calls sent to your SIP infrastructure. If your SIP infrastructure allows users to
             * "call back" an incoming call, configure this with a
             * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper
             * routing. If not configured, the from domain will default to "sip.twilio.com".
             */
            fun fromDomainSid(fromDomainSid: String) = fromDomainSid(JsonField.of(fromDomainSid))

            /**
             * Sets [Builder.fromDomainSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromDomainSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromDomainSid(fromDomainSid: JsonField<String>) = apply {
                this.fromDomainSid = fromDomainSid
            }

            /**
             * The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`.
             */
            fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                statusCallbackMethod(JsonField.of(statusCallbackMethod))

            /**
             * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackMethod] with a well-typed
             * [StatusCallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                apply {
                    this.statusCallbackMethod = statusCallbackMethod
                }

            /**
             * The URL that we should call to pass status parameters (such as call ended) to your
             * application.
             */
            fun statusCallbackUrl(statusCallbackUrl: String) =
                statusCallbackUrl(JsonField.of(statusCallbackUrl))

            /**
             * Sets [Builder.statusCallbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCallbackUrl(statusCallbackUrl: JsonField<String>) = apply {
                this.statusCallbackUrl = statusCallbackUrl
            }

            /**
             * The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`.
             */
            fun voiceFallbackMethod(voiceFallbackMethod: VoiceFallbackMethod) =
                voiceFallbackMethod(JsonField.of(voiceFallbackMethod))

            /**
             * Sets [Builder.voiceFallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceFallbackMethod] with a well-typed
             * [VoiceFallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun voiceFallbackMethod(voiceFallbackMethod: JsonField<VoiceFallbackMethod>) = apply {
                this.voiceFallbackMethod = voiceFallbackMethod
            }

            /**
             * The URL that we should call when an error occurs while retrieving or executing the
             * TwiML requested by `voice_url`.
             */
            fun voiceFallbackUrl(voiceFallbackUrl: String) =
                voiceFallbackUrl(JsonField.of(voiceFallbackUrl))

            /**
             * Sets [Builder.voiceFallbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceFallbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
                this.voiceFallbackUrl = voiceFallbackUrl
            }

            /** The HTTP method we should use to call `voice_url` */
            fun voiceMethod(voiceMethod: VoiceMethod) = voiceMethod(JsonField.of(voiceMethod))

            /**
             * Sets [Builder.voiceMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceMethod] with a well-typed [VoiceMethod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
                this.voiceMethod = voiceMethod
            }

            /** The URL we should call when the BYOC Trunk receives a call. */
            fun voiceUrl(voiceUrl: String) = voiceUrl(JsonField.of(voiceUrl))

            /**
             * Sets [Builder.voiceUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceUrl(voiceUrl: JsonField<String>) = apply { this.voiceUrl = voiceUrl }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    cnamLookupEnabled,
                    connectionPolicySid,
                    friendlyName,
                    fromDomainSid,
                    statusCallbackMethod,
                    statusCallbackUrl,
                    voiceFallbackMethod,
                    voiceFallbackUrl,
                    voiceMethod,
                    voiceUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cnamLookupEnabled()
            connectionPolicySid()
            friendlyName()
            fromDomainSid()
            statusCallbackMethod().ifPresent { it.validate() }
            statusCallbackUrl()
            voiceFallbackMethod().ifPresent { it.validate() }
            voiceFallbackUrl()
            voiceMethod().ifPresent { it.validate() }
            voiceUrl()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cnamLookupEnabled.asKnown().isPresent) 1 else 0) +
                (if (connectionPolicySid.asKnown().isPresent) 1 else 0) +
                (if (friendlyName.asKnown().isPresent) 1 else 0) +
                (if (fromDomainSid.asKnown().isPresent) 1 else 0) +
                (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (statusCallbackUrl.asKnown().isPresent) 1 else 0) +
                (voiceFallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voiceFallbackUrl.asKnown().isPresent) 1 else 0) +
                (voiceMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voiceUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && cnamLookupEnabled == other.cnamLookupEnabled && connectionPolicySid == other.connectionPolicySid && friendlyName == other.friendlyName && fromDomainSid == other.fromDomainSid && statusCallbackMethod == other.statusCallbackMethod && statusCallbackUrl == other.statusCallbackUrl && voiceFallbackMethod == other.voiceFallbackMethod && voiceFallbackUrl == other.voiceFallbackUrl && voiceMethod == other.voiceMethod && voiceUrl == other.voiceUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cnamLookupEnabled, connectionPolicySid, friendlyName, fromDomainSid, statusCallbackMethod, statusCallbackUrl, voiceFallbackMethod, voiceFallbackUrl, voiceMethod, voiceUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cnamLookupEnabled=$cnamLookupEnabled, connectionPolicySid=$connectionPolicySid, friendlyName=$friendlyName, fromDomainSid=$fromDomainSid, statusCallbackMethod=$statusCallbackMethod, statusCallbackUrl=$statusCallbackUrl, voiceFallbackMethod=$voiceFallbackMethod, voiceFallbackUrl=$voiceFallbackUrl, voiceMethod=$voiceMethod, voiceUrl=$voiceUrl, additionalProperties=$additionalProperties}"
    }

    /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GET -> Value.GET
                POST -> Value.POST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TwilioVoiceOpenAPIInvalidDataException(
                        "Unknown StatusCallbackMethod: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                TwilioVoiceOpenAPIInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): StatusCallbackMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusCallbackMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
    class VoiceFallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = VoiceFallbackMethod(JsonField.of(value))
        }

        /** An enum containing [VoiceFallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [VoiceFallbackMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VoiceFallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [VoiceFallbackMethod] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GET -> Value.GET
                POST -> Value.POST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TwilioVoiceOpenAPIInvalidDataException(
                        "Unknown VoiceFallbackMethod: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                TwilioVoiceOpenAPIInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): VoiceFallbackMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VoiceFallbackMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method we should use to call `voice_url` */
    class VoiceMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = VoiceMethod(JsonField.of(value))
        }

        /** An enum containing [VoiceMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [VoiceMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VoiceMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [VoiceMethod] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GET -> Value.GET
                POST -> Value.POST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TwilioVoiceOpenAPIInvalidDataException("Unknown VoiceMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TwilioVoiceOpenAPIInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                TwilioVoiceOpenAPIInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): VoiceMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VoiceMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ByocTrunkUpdateParams && sid == other.sid && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(sid, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ByocTrunkUpdateParams{sid=$sid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
