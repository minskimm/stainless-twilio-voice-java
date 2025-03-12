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
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunk
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListResponse
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkUpdateParams

class ByocTrunkServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ByocTrunkService {

    private val withRawResponse: ByocTrunkService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ByocTrunkService.WithRawResponse = withRawResponse

    override fun create(params: ByocTrunkCreateParams, requestOptions: RequestOptions): ByocTrunk =
        // post /v1/ByocTrunks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ByocTrunkRetrieveParams, requestOptions: RequestOptions): ByocTrunk =
        // get /v1/ByocTrunks/{Sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ByocTrunkUpdateParams, requestOptions: RequestOptions): ByocTrunk =
        // post /v1/ByocTrunks/{Sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ByocTrunkListParams, requestOptions: RequestOptions): ByocTrunkListResponse =
        // get /v1/ByocTrunks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ByocTrunkDeleteParams, requestOptions: RequestOptions) {
      // delete /v1/ByocTrunks/{Sid}
      withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ByocTrunkService.WithRawResponse {

        private val errorHandler: Handler<TwilioVoiceOpenAPIError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ByocTrunk> = jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: ByocTrunkCreateParams, requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "ByocTrunks")
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

        private val retrieveHandler: Handler<ByocTrunk> = jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: ByocTrunkRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "ByocTrunks", params.getPathParam(0))
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

        private val updateHandler: Handler<ByocTrunk> = jsonHandler<ByocTrunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: ByocTrunkUpdateParams, requestOptions: RequestOptions): HttpResponseFor<ByocTrunk> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "ByocTrunks", params.getPathParam(0))
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

        private val listHandler: Handler<ByocTrunkListResponse> = jsonHandler<ByocTrunkListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: ByocTrunkListParams, requestOptions: RequestOptions): HttpResponseFor<ByocTrunkListResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "ByocTrunks")
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

        override fun delete(params: ByocTrunkDeleteParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "ByocTrunks", params.getPathParam(0))
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
