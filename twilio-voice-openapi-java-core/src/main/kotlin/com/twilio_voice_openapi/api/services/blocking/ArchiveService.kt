// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.models.archives.ArchiveDeleteCallParams

interface ArchiveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Delete an archived call record from Bulk Export. Note: this does not also delete
     * the record from the Voice API.
     */
    fun deleteCall(params: ArchiveDeleteCallParams) =
        deleteCall(
          params, RequestOptions.none()
        )

    /** @see [deleteCall] */
    fun deleteCall(params: ArchiveDeleteCallParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * A view of [ArchiveService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `delete /v1/Archives/{Date}/Calls/{Sid}`, but is
         * otherwise the same as [ArchiveService.deleteCall].
         */
        @MustBeClosed
        fun deleteCall(params: ArchiveDeleteCallParams): HttpResponse =
            deleteCall(
              params, RequestOptions.none()
            )

        /** @see [deleteCall] */
        @MustBeClosed
        fun deleteCall(params: ArchiveDeleteCallParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
