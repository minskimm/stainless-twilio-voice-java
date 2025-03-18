// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.sourceipmappings

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceIpMappingListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createSourceIpMappingListResponse() {
        val sourceIpMappingListResponse =
            SourceIpMappingListResponse.builder()
                .meta(
                    SourceIpMappingListResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .addSourceIpMapping(
                    SourceIpMapping.builder()
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipRecordSid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .sipDomainSid("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .url("https://example.com")
                        .build()
                )
                .build()
        assertThat(sourceIpMappingListResponse).isNotNull
        assertThat(sourceIpMappingListResponse.meta())
            .contains(
                SourceIpMappingListResponse.Meta.builder()
                    .firstPageUrl("https://example.com")
                    .key("key")
                    .nextPageUrl("https://example.com")
                    .page(0L)
                    .pageSize(0L)
                    .previousPageUrl("https://example.com")
                    .url("https://example.com")
                    .build()
            )
        assertThat(sourceIpMappingListResponse.sourceIpMappings().get())
            .containsExactly(
                SourceIpMapping.builder()
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipRecordSid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .sipDomainSid("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .url("https://example.com")
                    .build()
            )
    }
}
