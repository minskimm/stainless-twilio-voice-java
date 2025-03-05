package com.twilio_voice_openapi.api.errors

open class TwilioVoiceOpenAPIException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
