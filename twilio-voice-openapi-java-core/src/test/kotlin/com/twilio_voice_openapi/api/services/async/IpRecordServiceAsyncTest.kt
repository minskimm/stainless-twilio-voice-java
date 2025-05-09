// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.iprecords.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IpRecordServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordServiceAsync = client.ipRecords()

        val ipRecordFuture =
            ipRecordServiceAsync.create(
                IpRecordCreateParams.builder()
                    .ipAddress("10.2.3.4")
                    .cidrPrefixLength(30L)
                    .friendlyName("friendly_name")
                    .build()
            )

        val ipRecord = ipRecordFuture.get()
        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordServiceAsync = client.ipRecords()

        val ipRecordFuture = ipRecordServiceAsync.retrieve("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")

        val ipRecord = ipRecordFuture.get()
        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordServiceAsync = client.ipRecords()

        val ipRecordFuture =
            ipRecordServiceAsync.update(
                IpRecordUpdateParams.builder()
                    .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .friendlyName("update_name")
                    .build()
            )

        val ipRecord = ipRecordFuture.get()
        ipRecord.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordServiceAsync = client.ipRecords()

        val ipRecordsFuture =
            ipRecordServiceAsync.list(
                IpRecordListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
            )

        val ipRecords = ipRecordsFuture.get()
        ipRecords.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val ipRecordServiceAsync = client.ipRecords()

        val future = ipRecordServiceAsync.delete("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")

        val response = future.get()
    }
}
