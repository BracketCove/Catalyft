package com.wiseassblog.domain.error

const val ERROR_NOT_FOUND = "Unable to locate Record."
const val ERROR_UNSC_IO = "Unable to access IO Device."

/**
 * Errors which
 */
sealed class Error(message: String? = null): Exception(message) {
    object RecordNotFound: Error(ERROR_NOT_FOUND)
    object IoDeviceFailure: Error(ERROR_UNSC_IO)
}


