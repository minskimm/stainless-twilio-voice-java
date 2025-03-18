// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRecordTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createIpRecord() {
        val ipRecord =
            IpRecord.builder()
                .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .cidrPrefixLength(0L)
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .friendlyName("friendly_name")
                .ipAddress("ip_address")
                .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .url("https://example.com")
                .build()
        assertThat(ipRecord).isNotNull
        assertThat(ipRecord.accountSid()).contains("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(ipRecord.cidrPrefixLength()).contains(0L)
        assertThat(ipRecord.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ipRecord.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ipRecord.friendlyName()).contains("friendly_name")
        assertThat(ipRecord.ipAddress()).contains("ip_address")
        assertThat(ipRecord.sid()).contains("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(ipRecord.url()).contains("https://example.com")
    }
}
