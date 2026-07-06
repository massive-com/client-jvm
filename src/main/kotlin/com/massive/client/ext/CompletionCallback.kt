package com.massive.client.ext

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Notified when a suspending operation started from one of the `*Async` methods
 * completes. Lets Java callers use the WebSocket client without touching coroutines.
 */
interface MassiveCompletionCallback {
    fun onComplete()
    fun onError(error: Throwable)
}

/**
 * Launches [block] in [scope] and invokes [callback] when it finishes (or fails).
 * Returns the launched [Job] so callers may cancel or join it.
 */
internal fun coroutineToCompletionCallback(
        callback: MassiveCompletionCallback?,
        scope: CoroutineScope,
        block: suspend () -> Unit
): Job =
        scope.launch {
            try {
                block()
                callback?.onComplete()
            } catch (error: Throwable) {
                callback?.onError(error)
            }
        }
