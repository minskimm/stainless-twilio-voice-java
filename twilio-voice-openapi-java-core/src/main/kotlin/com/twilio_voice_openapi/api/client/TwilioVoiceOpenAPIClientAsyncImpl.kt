// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.client

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.getPackageVersion
import com.twilio_voice_openapi.api.services.async.ArchiveServiceAsync
import com.twilio_voice_openapi.api.services.async.ArchiveServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.ByocTrunkServiceAsync
import com.twilio_voice_openapi.api.services.async.ByocTrunkServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.ConnectionPolicyServiceAsync
import com.twilio_voice_openapi.api.services.async.ConnectionPolicyServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.DialingPermissionServiceAsync
import com.twilio_voice_openapi.api.services.async.DialingPermissionServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.IpRecordServiceAsync
import com.twilio_voice_openapi.api.services.async.IpRecordServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.SettingServiceAsync
import com.twilio_voice_openapi.api.services.async.SettingServiceAsyncImpl
import com.twilio_voice_openapi.api.services.async.SourceIpMappingServiceAsync
import com.twilio_voice_openapi.api.services.async.SourceIpMappingServiceAsyncImpl

class TwilioVoiceOpenAPIClientAsyncImpl(private val clientOptions: ClientOptions) :
    TwilioVoiceOpenAPIClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: TwilioVoiceOpenAPIClient by lazy {
        TwilioVoiceOpenAPIClientImpl(clientOptions)
    }

    private val withRawResponse: TwilioVoiceOpenAPIClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val archives: ArchiveServiceAsync by lazy {
        ArchiveServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val byocTrunks: ByocTrunkServiceAsync by lazy {
        ByocTrunkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connectionPolicies: ConnectionPolicyServiceAsync by lazy {
        ConnectionPolicyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dialingPermissions: DialingPermissionServiceAsync by lazy {
        DialingPermissionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingServiceAsync by lazy {
        SettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ipRecords: IpRecordServiceAsync by lazy {
        IpRecordServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sourceIpMappings: SourceIpMappingServiceAsync by lazy {
        SourceIpMappingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): TwilioVoiceOpenAPIClient = sync

    override fun withRawResponse(): TwilioVoiceOpenAPIClientAsync.WithRawResponse = withRawResponse

    override fun archives(): ArchiveServiceAsync = archives

    override fun byocTrunks(): ByocTrunkServiceAsync = byocTrunks

    override fun connectionPolicies(): ConnectionPolicyServiceAsync = connectionPolicies

    override fun dialingPermissions(): DialingPermissionServiceAsync = dialingPermissions

    override fun settings(): SettingServiceAsync = settings

    override fun ipRecords(): IpRecordServiceAsync = ipRecords

    override fun sourceIpMappings(): SourceIpMappingServiceAsync = sourceIpMappings

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TwilioVoiceOpenAPIClientAsync.WithRawResponse {

        private val archives: ArchiveServiceAsync.WithRawResponse by lazy {
            ArchiveServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val byocTrunks: ByocTrunkServiceAsync.WithRawResponse by lazy {
            ByocTrunkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val connectionPolicies: ConnectionPolicyServiceAsync.WithRawResponse by lazy {
            ConnectionPolicyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dialingPermissions: DialingPermissionServiceAsync.WithRawResponse by lazy {
            DialingPermissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ipRecords: IpRecordServiceAsync.WithRawResponse by lazy {
            IpRecordServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sourceIpMappings: SourceIpMappingServiceAsync.WithRawResponse by lazy {
            SourceIpMappingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun archives(): ArchiveServiceAsync.WithRawResponse = archives

        override fun byocTrunks(): ByocTrunkServiceAsync.WithRawResponse = byocTrunks

        override fun connectionPolicies(): ConnectionPolicyServiceAsync.WithRawResponse =
            connectionPolicies

        override fun dialingPermissions(): DialingPermissionServiceAsync.WithRawResponse =
            dialingPermissions

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun ipRecords(): IpRecordServiceAsync.WithRawResponse = ipRecords

        override fun sourceIpMappings(): SourceIpMappingServiceAsync.WithRawResponse =
            sourceIpMappings
    }
}
