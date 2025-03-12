// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.core.ClientOptions
import com.twilio_voice_openapi.api.core.RequestOptions
import com.twilio_voice_openapi.api.core.handlers.emptyHandler
import com.twilio_voice_openapi.api.core.handlers.errorHandler
import com.twilio_voice_openapi.api.core.handlers.jsonHandler
import com.twilio_voice_openapi.api.core.handlers.withErrorHandler
import com.twilio_voice_openapi.api.core.http.HttpMethod
import com.twilio_voice_openapi.api.core.http.HttpRequest
import com.twilio_voice_openapi.api.core.http.HttpResponse
import com.twilio_voice_openapi.api.core.http.HttpResponse.Handler
import com.twilio_voice_openapi.api.core.http.HttpResponseFor
import com.twilio_voice_openapi.api.core.http.json
import com.twilio_voice_openapi.api.core.http.parseable
import com.twilio_voice_openapi.api.core.prepare
import com.twilio_voice_openapi.api.errors.TwilioVoiceOpenAPIError
import com.twilio_voice_openapi.api.models.iprecords.IpRecord
import com.twilio_voice_openapi.api.models.iprecords.IpRecordCreateParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordDeleteParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordListResponse
import com.twilio_voice_openapi.api.models.iprecords.IpRecordRetrieveParams
import com.twilio_voice_openapi.api.models.iprecords.IpRecordUpdateParams

class IpRecordServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IpRecordService {

    private val withRawResponse: IpRecordService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IpRecordService.WithRawResponse = withRawResponse

    override fun create(params: IpRecordCreateParams, requestOptions: RequestOptions): IpRecord =
        // post /v1/IpRecords
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IpRecordRetrieveParams,
        requestOptions: RequestOptions,
    ): IpRecord =
        // get /v1/IpRecords/{Sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: IpRecordUpdateParams, requestOptions: RequestOptions): IpRecord =
        // post /v1/IpRecords/{Sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: IpRecordListParams,
        requestOptions: RequestOptions,
    ): IpRecordListResponse =
        // get /v1/IpRecords
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IpRecordDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/IpRecords/{Sid}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpRecordService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: IpRecordCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRecord> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "IpRecords")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: IpRecordRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRecord> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<IpRecord> =
            jsonHandler<IpRecord>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: IpRecordUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRecord> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<IpRecordListResponse> =
            jsonHandler<IpRecordListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IpRecordListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRecordListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "IpRecords")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: IpRecordDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "IpRecords", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
