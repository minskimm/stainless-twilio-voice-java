// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.sourceipmappings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceIpMappingTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val sourceIpMapping =
            SourceIpMapping.builder()
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipRecordSid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sipDomainSid("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .url("https://example.com")
                .build()

        assertThat(sourceIpMapping.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sourceIpMapping.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sourceIpMapping.ipRecordSid()).contains("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(sourceIpMapping.sid()).contains("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(sourceIpMapping.sipDomainSid()).contains("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(sourceIpMapping.url()).contains("https://example.com")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceIpMapping =
            SourceIpMapping.builder()
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipRecordSid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sipDomainSid("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .url("https://example.com")
                .build()

        val roundtrippedSourceIpMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceIpMapping),
                jacksonTypeRef<SourceIpMapping>(),
            )

        assertThat(roundtrippedSourceIpMapping).isEqualTo(sourceIpMapping)
    }
}
