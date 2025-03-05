// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.ArchiveDeleteCallParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArchiveServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun deleteCall() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val archiveServiceAsync = client.archives()

        val future =
            archiveServiceAsync.deleteCall(
                ArchiveDeleteCallParams.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .build()
            )

        val response = future.get()
    }
}
