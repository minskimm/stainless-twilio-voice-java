// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.twilio_voice_openapi.api.core.Enum
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
class ByocTrunk
@JsonCreator
private constructor(
    @JsonProperty("account_sid")
    @ExcludeMissing
    private val accountSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cnam_lookup_enabled")
    @ExcludeMissing
    private val cnamLookupEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("connection_policy_sid")
    @ExcludeMissing
    private val connectionPolicySid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date_created")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date_updated")
    @ExcludeMissing
    private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("friendly_name")
    @ExcludeMissing
    private val friendlyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("from_domain_sid")
    @ExcludeMissing
    private val fromDomainSid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sid") @ExcludeMissing private val sid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status_callback_method")
    @ExcludeMissing
    private val statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
    @JsonProperty("status_callback_url")
    @ExcludeMissing
    private val statusCallbackUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("voice_fallback_method")
    @ExcludeMissing
    private val voiceFallbackMethod: JsonField<VoiceFallbackMethod> = JsonMissing.of(),
    @JsonProperty("voice_fallback_url")
    @ExcludeMissing
    private val voiceFallbackUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("voice_method")
    @ExcludeMissing
    private val voiceMethod: JsonField<VoiceMethod> = JsonMissing.of(),
    @JsonProperty("voice_url")
    @ExcludeMissing
    private val voiceUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the BYOC
     * Trunk resource.
     */
    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid.getNullable("account_sid"))

    /**
     * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound calls
     * to the BYOC Trunk from the United States and Canada automatically perform a CNAM Lookup and
     * display Caller ID data on your phone. See
     * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
     */
    fun cnamLookupEnabled(): Optional<Boolean> =
        Optional.ofNullable(cnamLookupEnabled.getNullable("cnam_lookup_enabled"))

    /**
     * The SID of the Connection Policy that Twilio will use when routing traffic to your
     * communications infrastructure.
     */
    fun connectionPolicySid(): Optional<String> =
        Optional.ofNullable(connectionPolicySid.getNullable("connection_policy_sid"))

    /**
     * The date and time in GMT that the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    fun dateCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateCreated.getNullable("date_created"))

    /**
     * The date and time in GMT that the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    fun dateUpdated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateUpdated.getNullable("date_updated"))

    /** The string that you assigned to describe the resource. */
    fun friendlyName(): Optional<String> =
        Optional.ofNullable(friendlyName.getNullable("friendly_name"))

    /**
     * The SID of the SIP Domain that should be used in the `From` header of originating calls sent
     * to your SIP infrastructure. If your SIP infrastructure allows users to "call back" an
     * incoming call, configure this with a
     * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing. If
     * not configured, the from domain will default to "sip.twilio.com".
     */
    fun fromDomainSid(): Optional<String> =
        Optional.ofNullable(fromDomainSid.getNullable("from_domain_sid"))

    /** The unique string that that we created to identify the BYOC Trunk resource. */
    fun sid(): Optional<String> = Optional.ofNullable(sid.getNullable("sid"))

    /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
        Optional.ofNullable(statusCallbackMethod.getNullable("status_callback_method"))

    /** The URL that we call to pass status parameters (such as call ended) to your application. */
    fun statusCallbackUrl(): Optional<String> =
        Optional.ofNullable(statusCallbackUrl.getNullable("status_callback_url"))

    /** The absolute URL of the resource. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
    fun voiceFallbackMethod(): Optional<VoiceFallbackMethod> =
        Optional.ofNullable(voiceFallbackMethod.getNullable("voice_fallback_method"))

    /**
     * The URL that we call when an error occurs while retrieving or executing the TwiML requested
     * from `voice_url`.
     */
    fun voiceFallbackUrl(): Optional<String> =
        Optional.ofNullable(voiceFallbackUrl.getNullable("voice_fallback_url"))

    /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
    fun voiceMethod(): Optional<VoiceMethod> =
        Optional.ofNullable(voiceMethod.getNullable("voice_method"))

    /** The URL we call using the `voice_method` when the BYOC Trunk receives a call. */
    fun voiceUrl(): Optional<String> = Optional.ofNullable(voiceUrl.getNullable("voice_url"))

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the BYOC
     * Trunk resource.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound calls
     * to the BYOC Trunk from the United States and Canada automatically perform a CNAM Lookup and
     * display Caller ID data on your phone. See
     * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
     */
    @JsonProperty("cnam_lookup_enabled")
    @ExcludeMissing
    fun _cnamLookupEnabled(): JsonField<Boolean> = cnamLookupEnabled

    /**
     * The SID of the Connection Policy that Twilio will use when routing traffic to your
     * communications infrastructure.
     */
    @JsonProperty("connection_policy_sid")
    @ExcludeMissing
    fun _connectionPolicySid(): JsonField<String> = connectionPolicySid

    /**
     * The date and time in GMT that the resource was created specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * The date and time in GMT that the resource was last updated specified in
     * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /** The string that you assigned to describe the resource. */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * The SID of the SIP Domain that should be used in the `From` header of originating calls sent
     * to your SIP infrastructure. If your SIP infrastructure allows users to "call back" an
     * incoming call, configure this with a
     * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing. If
     * not configured, the from domain will default to "sip.twilio.com".
     */
    @JsonProperty("from_domain_sid")
    @ExcludeMissing
    fun _fromDomainSid(): JsonField<String> = fromDomainSid

    /** The unique string that that we created to identify the BYOC Trunk resource. */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
    @JsonProperty("status_callback_method")
    @ExcludeMissing
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

    /** The URL that we call to pass status parameters (such as call ended) to your application. */
    @JsonProperty("status_callback_url")
    @ExcludeMissing
    fun _statusCallbackUrl(): JsonField<String> = statusCallbackUrl

    /** The absolute URL of the resource. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
    @JsonProperty("voice_fallback_method")
    @ExcludeMissing
    fun _voiceFallbackMethod(): JsonField<VoiceFallbackMethod> = voiceFallbackMethod

    /**
     * The URL that we call when an error occurs while retrieving or executing the TwiML requested
     * from `voice_url`.
     */
    @JsonProperty("voice_fallback_url")
    @ExcludeMissing
    fun _voiceFallbackUrl(): JsonField<String> = voiceFallbackUrl

    /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
    @JsonProperty("voice_method")
    @ExcludeMissing
    fun _voiceMethod(): JsonField<VoiceMethod> = voiceMethod

    /** The URL we call using the `voice_method` when the BYOC Trunk receives a call. */
    @JsonProperty("voice_url") @ExcludeMissing fun _voiceUrl(): JsonField<String> = voiceUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ByocTrunk = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        cnamLookupEnabled()
        connectionPolicySid()
        dateCreated()
        dateUpdated()
        friendlyName()
        fromDomainSid()
        sid()
        statusCallbackMethod()
        statusCallbackUrl()
        url()
        voiceFallbackMethod()
        voiceFallbackUrl()
        voiceMethod()
        voiceUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ByocTrunk]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ByocTrunk]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var cnamLookupEnabled: JsonField<Boolean> = JsonMissing.of()
        private var connectionPolicySid: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var fromDomainSid: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
        private var statusCallbackUrl: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var voiceFallbackMethod: JsonField<VoiceFallbackMethod> = JsonMissing.of()
        private var voiceFallbackUrl: JsonField<String> = JsonMissing.of()
        private var voiceMethod: JsonField<VoiceMethod> = JsonMissing.of()
        private var voiceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(byocTrunk: ByocTrunk) = apply {
            accountSid = byocTrunk.accountSid
            cnamLookupEnabled = byocTrunk.cnamLookupEnabled
            connectionPolicySid = byocTrunk.connectionPolicySid
            dateCreated = byocTrunk.dateCreated
            dateUpdated = byocTrunk.dateUpdated
            friendlyName = byocTrunk.friendlyName
            fromDomainSid = byocTrunk.fromDomainSid
            sid = byocTrunk.sid
            statusCallbackMethod = byocTrunk.statusCallbackMethod
            statusCallbackUrl = byocTrunk.statusCallbackUrl
            url = byocTrunk.url
            voiceFallbackMethod = byocTrunk.voiceFallbackMethod
            voiceFallbackUrl = byocTrunk.voiceFallbackUrl
            voiceMethod = byocTrunk.voiceMethod
            voiceUrl = byocTrunk.voiceUrl
            additionalProperties = byocTrunk.additionalProperties.toMutableMap()
        }

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * BYOC Trunk resource.
         */
        fun accountSid(accountSid: String?) = accountSid(JsonField.ofNullable(accountSid))

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * BYOC Trunk resource.
         */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the
         * BYOC Trunk resource.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: Boolean?) =
            cnamLookupEnabled(JsonField.ofNullable(cnamLookupEnabled))

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: Boolean) =
            cnamLookupEnabled(cnamLookupEnabled as Boolean?)

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: Optional<Boolean>) =
            cnamLookupEnabled(cnamLookupEnabled.getOrNull())

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(cnamLookupEnabled: JsonField<Boolean>) = apply {
            this.cnamLookupEnabled = cnamLookupEnabled
        }

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        fun connectionPolicySid(connectionPolicySid: String?) =
            connectionPolicySid(JsonField.ofNullable(connectionPolicySid))

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        fun connectionPolicySid(connectionPolicySid: Optional<String>) =
            connectionPolicySid(connectionPolicySid.getOrNull())

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        fun connectionPolicySid(connectionPolicySid: JsonField<String>) = apply {
            this.connectionPolicySid = connectionPolicySid
        }

        /**
         * The date and time in GMT that the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: OffsetDateTime?) =
            dateCreated(JsonField.ofNullable(dateCreated))

        /**
         * The date and time in GMT that the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateCreated(dateCreated: Optional<OffsetDateTime>) =
            dateCreated(dateCreated.getOrNull())

        /**
         * The date and time in GMT that the resource was created specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
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

        /**
         * The date and time in GMT that the resource was last updated specified in
         * [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        fun dateUpdated(dateUpdated: Optional<OffsetDateTime>) =
            dateUpdated(dateUpdated.getOrNull())

        /**
         * The date and time in GMT that the resource was last updated specified in
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

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(fromDomainSid: String?) =
            fromDomainSid(JsonField.ofNullable(fromDomainSid))

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(fromDomainSid: Optional<String>) =
            fromDomainSid(fromDomainSid.getOrNull())

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(fromDomainSid: JsonField<String>) = apply {
            this.fromDomainSid = fromDomainSid
        }

        /** The unique string that that we created to identify the BYOC Trunk resource. */
        fun sid(sid: String?) = sid(JsonField.ofNullable(sid))

        /** The unique string that that we created to identify the BYOC Trunk resource. */
        fun sid(sid: Optional<String>) = sid(sid.getOrNull())

        /** The unique string that that we created to identify the BYOC Trunk resource. */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod?) =
            statusCallbackMethod(JsonField.ofNullable(statusCallbackMethod))

        /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
        fun statusCallbackMethod(statusCallbackMethod: Optional<StatusCallbackMethod>) =
            statusCallbackMethod(statusCallbackMethod.getOrNull())

        /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            this.statusCallbackMethod = statusCallbackMethod
        }

        /**
         * The URL that we call to pass status parameters (such as call ended) to your application.
         */
        fun statusCallbackUrl(statusCallbackUrl: String?) =
            statusCallbackUrl(JsonField.ofNullable(statusCallbackUrl))

        /**
         * The URL that we call to pass status parameters (such as call ended) to your application.
         */
        fun statusCallbackUrl(statusCallbackUrl: Optional<String>) =
            statusCallbackUrl(statusCallbackUrl.getOrNull())

        /**
         * The URL that we call to pass status parameters (such as call ended) to your application.
         */
        fun statusCallbackUrl(statusCallbackUrl: JsonField<String>) = apply {
            this.statusCallbackUrl = statusCallbackUrl
        }

        /** The absolute URL of the resource. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** The absolute URL of the resource. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** The absolute URL of the resource. */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: VoiceFallbackMethod?) =
            voiceFallbackMethod(JsonField.ofNullable(voiceFallbackMethod))

        /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: Optional<VoiceFallbackMethod>) =
            voiceFallbackMethod(voiceFallbackMethod.getOrNull())

        /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: JsonField<VoiceFallbackMethod>) = apply {
            this.voiceFallbackMethod = voiceFallbackMethod
        }

        /**
         * The URL that we call when an error occurs while retrieving or executing the TwiML
         * requested from `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: String?) =
            voiceFallbackUrl(JsonField.ofNullable(voiceFallbackUrl))

        /**
         * The URL that we call when an error occurs while retrieving or executing the TwiML
         * requested from `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: Optional<String>) =
            voiceFallbackUrl(voiceFallbackUrl.getOrNull())

        /**
         * The URL that we call when an error occurs while retrieving or executing the TwiML
         * requested from `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
            this.voiceFallbackUrl = voiceFallbackUrl
        }

        /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(voiceMethod: VoiceMethod?) = voiceMethod(JsonField.ofNullable(voiceMethod))

        /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(voiceMethod: Optional<VoiceMethod>) = voiceMethod(voiceMethod.getOrNull())

        /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
            this.voiceMethod = voiceMethod
        }

        /** The URL we call using the `voice_method` when the BYOC Trunk receives a call. */
        fun voiceUrl(voiceUrl: String?) = voiceUrl(JsonField.ofNullable(voiceUrl))

        /** The URL we call using the `voice_method` when the BYOC Trunk receives a call. */
        fun voiceUrl(voiceUrl: Optional<String>) = voiceUrl(voiceUrl.getOrNull())

        /** The URL we call using the `voice_method` when the BYOC Trunk receives a call. */
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

        fun build(): ByocTrunk =
            ByocTrunk(
                accountSid,
                cnamLookupEnabled,
                connectionPolicySid,
                dateCreated,
                dateUpdated,
                friendlyName,
                fromDomainSid,
                sid,
                statusCallbackMethod,
                statusCallbackUrl,
                url,
                voiceFallbackMethod,
                voiceFallbackUrl,
                voiceMethod,
                voiceUrl,
                additionalProperties.toImmutable(),
            )
    }

    /** The HTTP method we use to call `status_callback_url`. Either `GET` or `POST`. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusCallbackMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method we use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VoiceFallbackMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method we use to call `voice_url`. Can be: `GET` or `POST`. */
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

        return /* spotless:off */ other is ByocTrunk && accountSid == other.accountSid && cnamLookupEnabled == other.cnamLookupEnabled && connectionPolicySid == other.connectionPolicySid && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && friendlyName == other.friendlyName && fromDomainSid == other.fromDomainSid && sid == other.sid && statusCallbackMethod == other.statusCallbackMethod && statusCallbackUrl == other.statusCallbackUrl && url == other.url && voiceFallbackMethod == other.voiceFallbackMethod && voiceFallbackUrl == other.voiceFallbackUrl && voiceMethod == other.voiceMethod && voiceUrl == other.voiceUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountSid, cnamLookupEnabled, connectionPolicySid, dateCreated, dateUpdated, friendlyName, fromDomainSid, sid, statusCallbackMethod, statusCallbackUrl, url, voiceFallbackMethod, voiceFallbackUrl, voiceMethod, voiceUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ByocTrunk{accountSid=$accountSid, cnamLookupEnabled=$cnamLookupEnabled, connectionPolicySid=$connectionPolicySid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, friendlyName=$friendlyName, fromDomainSid=$fromDomainSid, sid=$sid, statusCallbackMethod=$statusCallbackMethod, statusCallbackUrl=$statusCallbackUrl, url=$url, voiceFallbackMethod=$voiceFallbackMethod, voiceFallbackUrl=$voiceFallbackUrl, voiceMethod=$voiceMethod, voiceUrl=$voiceUrl, additionalProperties=$additionalProperties}"
}
