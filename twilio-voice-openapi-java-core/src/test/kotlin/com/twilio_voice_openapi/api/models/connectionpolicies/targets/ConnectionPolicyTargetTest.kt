// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies.targets

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionPolicyTargetTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val connectionPolicyTarget =
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

        assertThat(connectionPolicyTarget.accountSid())
            .contains("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(connectionPolicyTarget.connectionPolicySid())
            .contains("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(connectionPolicyTarget.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionPolicyTarget.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionPolicyTarget.enabled()).contains(true)
        assertThat(connectionPolicyTarget.friendlyName()).contains("friendly_name")
        assertThat(connectionPolicyTarget.priority()).contains(0L)
        assertThat(connectionPolicyTarget.sid()).contains("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(connectionPolicyTarget.target()).contains("https://example.com")
        assertThat(connectionPolicyTarget.url()).contains("https://example.com")
        assertThat(connectionPolicyTarget.weight()).contains(0L)
    }
}
