// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionPolicyListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val connectionPolicyListResponse =
            ConnectionPolicyListResponse.builder()
                .addConnectionPolicy(
                    ConnectionPolicy.builder()
                        .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .friendlyName("friendly_name")
                        .links(JsonValue.from(mapOf<String, Any>()))
                        .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .url("https://example.com")
                        .build()
                )
                .meta(
                    ConnectionPolicyListResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .build()

        assertThat(connectionPolicyListResponse.connectionPolicies().getOrNull())
            .containsExactly(
                ConnectionPolicy.builder()
                    .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .friendlyName("friendly_name")
                    .links(JsonValue.from(mapOf<String, Any>()))
                    .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .url("https://example.com")
                    .build()
            )
        assertThat(connectionPolicyListResponse.meta())
            .contains(
                ConnectionPolicyListResponse.Meta.builder()
                    .firstPageUrl("https://example.com")
                    .key("key")
                    .nextPageUrl("https://example.com")
                    .page(0L)
                    .pageSize(0L)
                    .previousPageUrl("https://example.com")
                    .url("https://example.com")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionPolicyListResponse =
            ConnectionPolicyListResponse.builder()
                .addConnectionPolicy(
                    ConnectionPolicy.builder()
                        .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .friendlyName("friendly_name")
                        .links(JsonValue.from(mapOf<String, Any>()))
                        .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .url("https://example.com")
                        .build()
                )
                .meta(
                    ConnectionPolicyListResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedConnectionPolicyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionPolicyListResponse),
                jacksonTypeRef<ConnectionPolicyListResponse>(),
            )

        assertThat(roundtrippedConnectionPolicyListResponse).isEqualTo(connectionPolicyListResponse)
    }
}
