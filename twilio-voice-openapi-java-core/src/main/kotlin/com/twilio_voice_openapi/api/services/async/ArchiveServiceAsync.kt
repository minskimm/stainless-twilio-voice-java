// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.models.ArchiveDeleteCallParams
import java.util.concurrent.CompletableFuture

interface ArchiveServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Delete an archived call record from Bulk Export. Note: this does not also delete the record
     * from the Voice API.
     */
    fun deleteCall(params: ArchiveDeleteCallParams): CompletableFuture<Void?> =
        deleteCall(params, RequestOptions.none())

    /** @see [deleteCall] */
    fun deleteCall(
        params: ArchiveDeleteCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ArchiveServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `delete /v1/Archives/{Date}/Calls/{Sid}`, but is
         * otherwise the same as [ArchiveServiceAsync.deleteCall].
         */
        @MustBeClosed
        fun deleteCall(params: ArchiveDeleteCallParams): CompletableFuture<HttpResponse> =
            deleteCall(params, RequestOptions.none())

        /** @see [deleteCall] */
        @MustBeClosed
        fun deleteCall(
            params: ArchiveDeleteCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
