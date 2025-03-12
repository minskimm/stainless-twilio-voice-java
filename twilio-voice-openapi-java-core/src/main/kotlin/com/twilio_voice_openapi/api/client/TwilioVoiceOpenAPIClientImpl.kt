// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.client

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.getPackageVersion
import com.twilio_voice_openapi.api.services.blocking.ArchiveService
import com.twilio_voice_openapi.api.services.blocking.ArchiveServiceImpl
import com.twilio_voice_openapi.api.services.blocking.ByocTrunkService
import com.twilio_voice_openapi.api.services.blocking.ByocTrunkServiceImpl
import com.twilio_voice_openapi.api.services.blocking.ConnectionPolicyService
import com.twilio_voice_openapi.api.services.blocking.ConnectionPolicyServiceImpl
import com.twilio_voice_openapi.api.services.blocking.DialingPermissionService
import com.twilio_voice_openapi.api.services.blocking.DialingPermissionServiceImpl
import com.twilio_voice_openapi.api.services.blocking.IpRecordService
import com.twilio_voice_openapi.api.services.blocking.IpRecordServiceImpl
import com.twilio_voice_openapi.api.services.blocking.SettingService
import com.twilio_voice_openapi.api.services.blocking.SettingServiceImpl
import com.twilio_voice_openapi.api.services.blocking.SourceIpMappingService
import com.twilio_voice_openapi.api.services.blocking.SourceIpMappingServiceImpl

class TwilioVoiceOpenAPIClientImpl(
    private val clientOptions: ClientOptions,

) : TwilioVoiceOpenAPIClient {

    private val clientOptionsWithUserAgent =

      if (clientOptions.headers.names().contains("User-Agent")) clientOptions

      else clientOptions.toBuilder().putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}").build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: TwilioVoiceOpenAPIClientAsync by lazy { TwilioVoiceOpenAPIClientAsyncImpl(clientOptions) }

    private val withRawResponse: TwilioVoiceOpenAPIClient.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val archives: ArchiveService by lazy { ArchiveServiceImpl(clientOptionsWithUserAgent) }

    private val byocTrunks: ByocTrunkService by lazy { ByocTrunkServiceImpl(clientOptionsWithUserAgent) }

    private val connectionPolicies: ConnectionPolicyService by lazy { ConnectionPolicyServiceImpl(clientOptionsWithUserAgent) }

    private val dialingPermissions: DialingPermissionService by lazy { DialingPermissionServiceImpl(clientOptionsWithUserAgent) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    private val ipRecords: IpRecordService by lazy { IpRecordServiceImpl(clientOptionsWithUserAgent) }

    private val sourceIpMappings: SourceIpMappingService by lazy { SourceIpMappingServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): TwilioVoiceOpenAPIClientAsync = async

    override fun withRawResponse(): TwilioVoiceOpenAPIClient.WithRawResponse = withRawResponse

    override fun archives(): ArchiveService = archives

    override fun byocTrunks(): ByocTrunkService = byocTrunks

    override fun connectionPolicies(): ConnectionPolicyService = connectionPolicies

    override fun dialingPermissions(): DialingPermissionService = dialingPermissions

    override fun settings(): SettingService = settings

    override fun ipRecords(): IpRecordService = ipRecords

    override fun sourceIpMappings(): SourceIpMappingService = sourceIpMappings

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TwilioVoiceOpenAPIClient.WithRawResponse {

        private val archives: ArchiveService.WithRawResponse by lazy { ArchiveServiceImpl.WithRawResponseImpl(clientOptions) }

        private val byocTrunks: ByocTrunkService.WithRawResponse by lazy { ByocTrunkServiceImpl.WithRawResponseImpl(clientOptions) }

        private val connectionPolicies: ConnectionPolicyService.WithRawResponse by lazy { ConnectionPolicyServiceImpl.WithRawResponseImpl(clientOptions) }

        private val dialingPermissions: DialingPermissionService.WithRawResponse by lazy { DialingPermissionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val settings: SettingService.WithRawResponse by lazy { SettingServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ipRecords: IpRecordService.WithRawResponse by lazy { IpRecordServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sourceIpMappings: SourceIpMappingService.WithRawResponse by lazy { SourceIpMappingServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun archives(): ArchiveService.WithRawResponse = archives

        override fun byocTrunks(): ByocTrunkService.WithRawResponse = byocTrunks

        override fun connectionPolicies(): ConnectionPolicyService.WithRawResponse = connectionPolicies

        override fun dialingPermissions(): DialingPermissionService.WithRawResponse = dialingPermissions

        override fun settings(): SettingService.WithRawResponse = settings

        override fun ipRecords(): IpRecordService.WithRawResponse = ipRecords

        override fun sourceIpMappings(): SourceIpMappingService.WithRawResponse = sourceIpMappings
    }
}
