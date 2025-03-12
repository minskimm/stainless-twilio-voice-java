package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: TwilioVoiceOpenAPIError) :
    TwilioVoiceOpenAPIServiceException(403, headers, body, error)
