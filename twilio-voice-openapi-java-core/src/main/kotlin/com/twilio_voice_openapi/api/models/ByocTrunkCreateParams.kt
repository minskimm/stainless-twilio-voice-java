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
import com.twilio_voice_openapi.api.core.Params
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams
import com.twilio_voice_openapi.api.core.immutableEmptyMap
import com.twilio_voice_openapi.api.core.toImmutable
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIInvalidDataException
import java.util.Objects
import java.util.Optional

class ByocTrunkCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound calls
     * to the BYOC Trunk from the United States and Canada automatically perform a CNAM Lookup and
     * display Caller ID data on your phone. See
     * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
     */
    fun cnamLookupEnabled(): Optional<Boolean> = body.cnamLookupEnabled()

    /**
     * The SID of the Connection Policy that Twilio will use when routing traffic to your
     * communications infrastructure.
     */
    fun connectionPolicySid(): Optional<String> = body.connectionPolicySid()

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up
     * to 255 characters long.
     */
    fun friendlyName(): Optional<String> = body.friendlyName()

    /**
     * The SID of the SIP Domain that should be used in the `From` header of originating calls sent
     * to your SIP infrastructure. If your SIP infrastructure allows users to "call back" an
     * incoming call, configure this with a
     * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing. If
     * not configured, the from domain will default to "sip.twilio.com".
     */
    fun fromDomainSid(): Optional<String> = body.fromDomainSid()

    /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * The URL that we should call to pass status parameters (such as call ended) to your
     * application.
     */
    fun statusCallbackUrl(): Optional<String> = body.statusCallbackUrl()

    /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
    fun voiceFallbackMethod(): Optional<VoiceFallbackMethod> = body.voiceFallbackMethod()

    /**
     * The URL that we should call when an error occurs while retrieving or executing the TwiML from
     * `voice_url`.
     */
    fun voiceFallbackUrl(): Optional<String> = body.voiceFallbackUrl()

    /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
    fun voiceMethod(): Optional<VoiceMethod> = body.voiceMethod()

    /** The URL we should call when the BYOC Trunk receives a call. */
    fun voiceUrl(): Optional<String> = body.voiceUrl()

    /**
     * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound calls
     * to the BYOC Trunk from the United States and Canada automatically perform a CNAM Lookup and
     * display Caller ID data on your phone. See
     * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
     */
    fun _cnamLookupEnabled(): JsonField<Boolean> = body._cnamLookupEnabled()

    /**
     * The SID of the Connection Policy that Twilio will use when routing traffic to your
     * communications infrastructure.
     */
    fun _connectionPolicySid(): JsonField<String> = body._connectionPolicySid()

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up
     * to 255 characters long.
     */
    fun _friendlyName(): JsonField<String> = body._friendlyName()

    /**
     * The SID of the SIP Domain that should be used in the `From` header of originating calls sent
     * to your SIP infrastructure. If your SIP infrastructure allows users to "call back" an
     * incoming call, configure this with a
     * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing. If
     * not configured, the from domain will default to "sip.twilio.com".
     */
    fun _fromDomainSid(): JsonField<String> = body._fromDomainSid()

    /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * The URL that we should call to pass status parameters (such as call ended) to your
     * application.
     */
    fun _statusCallbackUrl(): JsonField<String> = body._statusCallbackUrl()

    /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
    fun _voiceFallbackMethod(): JsonField<VoiceFallbackMethod> = body._voiceFallbackMethod()

    /**
     * The URL that we should call when an error occurs while retrieving or executing the TwiML from
     * `voice_url`.
     */
    fun _voiceFallbackUrl(): JsonField<String> = body._voiceFallbackUrl()

    /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
    fun _voiceMethod(): JsonField<VoiceMethod> = body._voiceMethod()

    /** The URL we should call when the BYOC Trunk receives a call. */
    fun _voiceUrl(): JsonField<String> = body._voiceUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("CnamLookupEnabled")
        @ExcludeMissing
        private val cnamLookupEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ConnectionPolicySid")
        @ExcludeMissing
        private val connectionPolicySid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("FriendlyName")
        @ExcludeMissing
        private val friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("FromDomainSid")
        @ExcludeMissing
        private val fromDomainSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        private val statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
        @JsonProperty("StatusCallbackUrl")
        @ExcludeMissing
        private val statusCallbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("VoiceFallbackMethod")
        @ExcludeMissing
        private val voiceFallbackMethod: JsonField<VoiceFallbackMethod> = JsonMissing.of(),
        @JsonProperty("VoiceFallbackUrl")
        @ExcludeMissing
        private val voiceFallbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("VoiceMethod")
        @ExcludeMissing
        private val voiceMethod: JsonField<VoiceMethod> = JsonMissing.of(),
        @JsonProperty("VoiceUrl")
        @ExcludeMissing
        private val voiceUrl: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        fun cnamLookupEnabled(): Optional<Boolean> =
            Optional.ofNullable(cnamLookupEnabled.getNullable("CnamLookupEnabled"))

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        fun connectionPolicySid(): Optional<String> =
            Optional.ofNullable(connectionPolicySid.getNullable("ConnectionPolicySid"))

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
         */
        fun friendlyName(): Optional<String> =
            Optional.ofNullable(friendlyName.getNullable("FriendlyName"))

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(): Optional<String> =
            Optional.ofNullable(fromDomainSid.getNullable("FromDomainSid"))

        /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            Optional.ofNullable(statusCallbackMethod.getNullable("StatusCallbackMethod"))

        /**
         * The URL that we should call to pass status parameters (such as call ended) to your
         * application.
         */
        fun statusCallbackUrl(): Optional<String> =
            Optional.ofNullable(statusCallbackUrl.getNullable("StatusCallbackUrl"))

        /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(): Optional<VoiceFallbackMethod> =
            Optional.ofNullable(voiceFallbackMethod.getNullable("VoiceFallbackMethod"))

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * from `voice_url`.
         */
        fun voiceFallbackUrl(): Optional<String> =
            Optional.ofNullable(voiceFallbackUrl.getNullable("VoiceFallbackUrl"))

        /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(): Optional<VoiceMethod> =
            Optional.ofNullable(voiceMethod.getNullable("VoiceMethod"))

        /** The URL we should call when the BYOC Trunk receives a call. */
        fun voiceUrl(): Optional<String> = Optional.ofNullable(voiceUrl.getNullable("VoiceUrl"))

        /**
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
         */
        @JsonProperty("CnamLookupEnabled")
        @ExcludeMissing
        fun _cnamLookupEnabled(): JsonField<Boolean> = cnamLookupEnabled

        /**
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
         */
        @JsonProperty("ConnectionPolicySid")
        @ExcludeMissing
        fun _connectionPolicySid(): JsonField<String> = connectionPolicySid

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
         */
        @JsonProperty("FriendlyName")
        @ExcludeMissing
        fun _friendlyName(): JsonField<String> = friendlyName

        /**
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        @JsonProperty("FromDomainSid")
        @ExcludeMissing
        fun _fromDomainSid(): JsonField<String> = fromDomainSid

        /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * The URL that we should call to pass status parameters (such as call ended) to your
         * application.
         */
        @JsonProperty("StatusCallbackUrl")
        @ExcludeMissing
        fun _statusCallbackUrl(): JsonField<String> = statusCallbackUrl

        /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        @JsonProperty("VoiceFallbackMethod")
        @ExcludeMissing
        fun _voiceFallbackMethod(): JsonField<VoiceFallbackMethod> = voiceFallbackMethod

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * from `voice_url`.
         */
        @JsonProperty("VoiceFallbackUrl")
        @ExcludeMissing
        fun _voiceFallbackUrl(): JsonField<String> = voiceFallbackUrl

        /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
        @JsonProperty("VoiceMethod")
        @ExcludeMissing
        fun _voiceMethod(): JsonField<VoiceMethod> = voiceMethod

        /** The URL we should call when the BYOC Trunk receives a call. */
        @JsonProperty("VoiceUrl") @ExcludeMissing fun _voiceUrl(): JsonField<String> = voiceUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cnamLookupEnabled()
            connectionPolicySid()
            friendlyName()
            fromDomainSid()
            statusCallbackMethod()
            statusCallbackUrl()
            voiceFallbackMethod()
            voiceFallbackUrl()
            voiceMethod()
            voiceUrl()
            validated = true
        }

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
             * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all
             * inbound calls to the BYOC Trunk from the United States and Canada automatically
             * perform a CNAM Lookup and display Caller ID data on your phone. See
             * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
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
             * The SID of the Connection Policy that Twilio will use when routing traffic to your
             * communications infrastructure.
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
             * A descriptive string that you create to describe the resource. It is not unique and
             * can be up to 255 characters long.
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
             * The SID of the SIP Domain that should be used in the `From` header of originating
             * calls sent to your SIP infrastructure. If your SIP infrastructure allows users to
             * "call back" an incoming call, configure this with a
             * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper
             * routing. If not configured, the from domain will default to "sip.twilio.com".
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
             * The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`.
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
             * The URL that we should call to pass status parameters (such as call ended) to your
             * application.
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
             * The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`.
             */
            fun voiceFallbackMethod(voiceFallbackMethod: JsonField<VoiceFallbackMethod>) = apply {
                this.voiceFallbackMethod = voiceFallbackMethod
            }

            /**
             * The URL that we should call when an error occurs while retrieving or executing the
             * TwiML from `voice_url`.
             */
            fun voiceFallbackUrl(voiceFallbackUrl: String) =
                voiceFallbackUrl(JsonField.of(voiceFallbackUrl))

            /**
             * The URL that we should call when an error occurs while retrieving or executing the
             * TwiML from `voice_url`.
             */
            fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
                this.voiceFallbackUrl = voiceFallbackUrl
            }

            /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
            fun voiceMethod(voiceMethod: VoiceMethod) = voiceMethod(JsonField.of(voiceMethod))

            /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
            fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
                this.voiceMethod = voiceMethod
            }

            /** The URL we should call when the BYOC Trunk receives a call. */
            fun voiceUrl(voiceUrl: String) = voiceUrl(JsonField.of(voiceUrl))

            /** The URL we should call when the BYOC Trunk receives a call. */
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
                    additionalProperties.toImmutable(),
                )
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ByocTrunkCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ByocTrunkCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ByocTrunkCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(byocTrunkCreateParams: ByocTrunkCreateParams) = apply {
            body = byocTrunkCreateParams.body.toBuilder()
            additionalHeaders = byocTrunkCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = byocTrunkCreateParams.additionalQueryParams.toBuilder()
        }

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
         * Whether Caller ID Name (CNAM) lookup is enabled for the trunk. If enabled, all inbound
         * calls to the BYOC Trunk from the United States and Canada automatically perform a CNAM
         * Lookup and display Caller ID data on your phone. See
         * [CNAM Lookups](https://www.twilio.com/docs/sip-trunking#CNAM) for more information.
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
         * The SID of the Connection Policy that Twilio will use when routing traffic to your
         * communications infrastructure.
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
         * A descriptive string that you create to describe the resource. It is not unique and can
         * be up to 255 characters long.
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
         * The SID of the SIP Domain that should be used in the `From` header of originating calls
         * sent to your SIP infrastructure. If your SIP infrastructure allows users to "call back"
         * an incoming call, configure this with a
         * [SIP Domain](https://www.twilio.com/docs/voice/api/sending-sip) to ensure proper routing.
         * If not configured, the from domain will default to "sip.twilio.com".
         */
        fun fromDomainSid(fromDomainSid: JsonField<String>) = apply {
            body.fromDomainSid(fromDomainSid)
        }

        /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /** The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`. */
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
         * The URL that we should call to pass status parameters (such as call ended) to your
         * application.
         */
        fun statusCallbackUrl(statusCallbackUrl: JsonField<String>) = apply {
            body.statusCallbackUrl(statusCallbackUrl)
        }

        /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: VoiceFallbackMethod) = apply {
            body.voiceFallbackMethod(voiceFallbackMethod)
        }

        /** The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`. */
        fun voiceFallbackMethod(voiceFallbackMethod: JsonField<VoiceFallbackMethod>) = apply {
            body.voiceFallbackMethod(voiceFallbackMethod)
        }

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * from `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: String) = apply {
            body.voiceFallbackUrl(voiceFallbackUrl)
        }

        /**
         * The URL that we should call when an error occurs while retrieving or executing the TwiML
         * from `voice_url`.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
            body.voiceFallbackUrl(voiceFallbackUrl)
        }

        /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(voiceMethod: VoiceMethod) = apply { body.voiceMethod(voiceMethod) }

        /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
        fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
            body.voiceMethod(voiceMethod)
        }

        /** The URL we should call when the BYOC Trunk receives a call. */
        fun voiceUrl(voiceUrl: String) = apply { body.voiceUrl(voiceUrl) }

        /** The URL we should call when the BYOC Trunk receives a call. */
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

        fun build(): ByocTrunkCreateParams =
            ByocTrunkCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VoiceFallbackMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`. */
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

        return /* spotless:off */ other is ByocTrunkCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ByocTrunkCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
