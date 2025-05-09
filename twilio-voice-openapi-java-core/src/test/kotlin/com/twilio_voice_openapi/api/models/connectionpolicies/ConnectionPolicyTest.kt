// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionPolicyTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val connectionPolicy =
            ConnectionPolicy.builder()
                .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .friendlyName("friendly_name")
                .links(JsonValue.from(mapOf<String, Any>()))
                .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .url("https://example.com")
                .build()

        assertThat(connectionPolicy.accountSid()).contains("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(connectionPolicy.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionPolicy.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionPolicy.friendlyName()).contains("friendly_name")
        assertThat(connectionPolicy._links()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(connectionPolicy.sid()).contains("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(connectionPolicy.url()).contains("https://example.com")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionPolicy =
            ConnectionPolicy.builder()
                .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .friendlyName("friendly_name")
                .links(JsonValue.from(mapOf<String, Any>()))
                .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .url("https://example.com")
                .build()

        val roundtrippedConnectionPolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionPolicy),
                jacksonTypeRef<ConnectionPolicy>(),
            )

        assertThat(roundtrippedConnectionPolicy).isEqualTo(connectionPolicy)
    }
}
