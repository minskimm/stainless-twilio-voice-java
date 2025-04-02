// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.models.iprecords.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordDeleteParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordRetrieveParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IpRecordServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordService = client.ipRecords()

        val ipRecord =
            ipRecordService.create(
                IpRecordCreateParams.builder()
                    .ipAddress("10.2.3.4")
                    .cidrPrefixLength(30L)
                    .friendlyName("friendly_name")
                    .build()
            )

        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordService = client.ipRecords()

        val ipRecord =
            ipRecordService.retrieve(
                IpRecordRetrieveParams.builder().sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
            )

        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordService = client.ipRecords()

        val ipRecord =
            ipRecordService.update(
                IpRecordUpdateParams.builder()
                    .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .friendlyName("update_name")
                    .build()
            )

        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordService = client.ipRecords()

        val ipRecords =
            ipRecordService.list(
                IpRecordListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
            )

        ipRecords.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordService = client.ipRecords()

        ipRecordService.delete(
            IpRecordDeleteParams.builder().sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
        )
    }
}
