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
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMapping
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListResponse
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingUpdateParams

class SourceIpMappingServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SourceIpMappingService {

    private val withRawResponse: SourceIpMappingService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SourceIpMappingService.WithRawResponse = withRawResponse

    override fun create(params: SourceIpMappingCreateParams, requestOptions: RequestOptions): SourceIpMapping =
        // post /v1/SourceIpMappings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: SourceIpMappingRetrieveParams, requestOptions: RequestOptions): SourceIpMapping =
        // get /v1/SourceIpMappings/{Sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: SourceIpMappingUpdateParams, requestOptions: RequestOptions): SourceIpMapping =
        // post /v1/SourceIpMappings/{Sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: SourceIpMappingListParams, requestOptions: RequestOptions): SourceIpMappingListResponse =
        // get /v1/SourceIpMappings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SourceIpMappingDeleteParams, requestOptions: RequestOptions) {
      // delete /v1/SourceIpMappings/{Sid}
      withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SourceIpMappingService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<SourceIpMapping> = jsonHandler<SourceIpMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: SourceIpMappingCreateParams, requestOptions: RequestOptions): HttpResponseFor<SourceIpMapping> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "SourceIpMappings")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveHandler: Handler<SourceIpMapping> = jsonHandler<SourceIpMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: SourceIpMappingRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<SourceIpMapping> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "SourceIpMappings", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<SourceIpMapping> = jsonHandler<SourceIpMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: SourceIpMappingUpdateParams, requestOptions: RequestOptions): HttpResponseFor<SourceIpMapping> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "SourceIpMappings", params.getPathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<SourceIpMappingListResponse> = jsonHandler<SourceIpMappingListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: SourceIpMappingListParams, requestOptions: RequestOptions): HttpResponseFor<SourceIpMappingListResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "SourceIpMappings")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(params: SourceIpMappingDeleteParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "SourceIpMappings", params.getPathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }
    }
}
