// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.models.ArchiveDeleteCallParams

interface ArchiveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Delete an archived call record from Bulk Export. Note: this does not also delete the record
     * from the Voice API.
     */
    @JvmOverloads
    fun deleteCall(
        params: ArchiveDeleteCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ArchiveService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `delete /v1/Archives/{Date}/Calls/{Sid}`, but is
         * otherwise the same as [ArchiveService.deleteCall].
         */
        @JvmOverloads
        @MustBeClosed
        fun deleteCall(
            params: ArchiveDeleteCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
