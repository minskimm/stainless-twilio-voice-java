// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class IpRecordListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createIpRecordListResponse() {
      val ipRecordListResponse = IpRecordListResponse.builder()
          .addIpRecord(IpRecord.builder()
              .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
              .cidrPrefixLength(0L)
              .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .friendlyName("friendly_name")
              .ipAddress("ip_address")
              .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
              .url("https://example.com")
              .build())
          .meta(IpRecordListResponse.Meta.builder()
              .firstPageUrl("https://example.com")
              .key("key")
              .nextPageUrl("https://example.com")
              .page(0L)
              .pageSize(0L)
              .previousPageUrl("https://example.com")
              .url("https://example.com")
              .build())
          .build()
      assertThat(ipRecordListResponse).isNotNull
      assertThat(ipRecordListResponse.ipRecords().get()).containsExactly(IpRecord.builder()
          .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .cidrPrefixLength(0L)
          .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .friendlyName("friendly_name")
          .ipAddress("ip_address")
          .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .url("https://example.com")
          .build())
      assertThat(ipRecordListResponse.meta()).contains(IpRecordListResponse.Meta.builder()
          .firstPageUrl("https://example.com")
          .key("key")
          .nextPageUrl("https://example.com")
          .page(0L)
          .pageSize(0L)
          .previousPageUrl("https://example.com")
          .url("https://example.com")
          .build())
    }
}
