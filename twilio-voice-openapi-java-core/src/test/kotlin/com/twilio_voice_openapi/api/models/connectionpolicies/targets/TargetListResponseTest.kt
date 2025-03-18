// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies.targets

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TargetListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createTargetListResponse() {
        val targetListResponse =
            TargetListResponse.builder()
                .meta(
                    TargetListResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .addTarget(
                    ConnectionPolicyTarget.builder()
                        .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .friendlyName("friendly_name")
                        .priority(0L)
                        .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .target("https://example.com")
                        .url("https://example.com")
                        .weight(0L)
                        .build()
                )
                .build()
        assertThat(targetListResponse).isNotNull
        assertThat(targetListResponse.meta())
            .contains(
                TargetListResponse.Meta.builder()
                    .firstPageUrl("https://example.com")
                    .key("key")
                    .nextPageUrl("https://example.com")
                    .page(0L)
                    .pageSize(0L)
                    .previousPageUrl("https://example.com")
                    .url("https://example.com")
                    .build()
            )
        assertThat(targetListResponse.targets().getOrNull())
            .containsExactly(
                ConnectionPolicyTarget.builder()
                    .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .friendlyName("friendly_name")
                    .priority(0L)
                    .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .target("https://example.com")
                    .url("https://example.com")
                    .weight(0L)
                    .build()
            )
    }
}
