package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{
    println("==================================================")
    println("🚀 Starting Kotlin Coroutines Test Execution")
    println("==================================================")

    fun main() = runBlocking {
        println("1. Main thread starts running: ${Thread.currentThread().name}")

        // Launch a background task (Fire-and-forget)
        val job = launch(Dispatchers.Default) {
            println("2. Background task started on thread: ${Thread.currentThread().name}")
            delay(1000L) // Simulates non-blocking delay
            println("3. Background task completed!")
        }

        // Launch an async task that returns a value
        val deferredResult = async(Dispatchers.IO) {
            delay(500L)
            "Data loaded successfully from API" // Return value
        }

        println("4. Waiting for async task to finish...")
        val data = deferredResult.await()
        println("5. Received result: $data")

        // Wait for the launch job to complete before ending main
        job.join()
        println("6. All coroutines completed! Exiting main.")
    }
}