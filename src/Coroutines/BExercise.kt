package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    println("==================================================")
    println("🚀 Starting Kotlin Coroutines Test Execution")
    println("==================================================")

    val totalExecutionTime = measureTimeMillis {
        // 1. Basic Launch (Fire-and-Forget)
        println("\n--- 1. Testing launch (Background Task) ---")
        val job: Job = launch(Dispatchers.Default) {
            println("  [Thread: ${Thread.currentThread().name}] Background task started...")
            delay(1000L) // Non-blocking 1 second delay
            println("  [Thread: ${Thread.currentThread().name}] Background task finished!")
        }

        // 2. Async / Await (Returning a result)
        println("\n--- 2. Testing async/await (Fetching Data) ---")
        val userDeferred = async(Dispatchers.IO) { fetchUserData() }
        val scoreDeferred = async(Dispatchers.IO) { fetchUserScore() }

        println("  Waiting for network requests to complete...")
        val user = userDeferred.await()
        val score = scoreDeferred.await()
        println("  ✅ Result: User = $user | Score = $score")

        // 3. Exception Handling inside Coroutines
        println("\n--- 3. Testing Exception Handling ---")
        val errorJob = launch(Dispatchers.Default) {
            try {
                performRiskyOperation()
            } catch (e: Exception) {
                println("  ⚠️ Caught expected error: ${e.message}")
            }
        }

        // Wait for active background jobs to finish
        job.join()
        errorJob.join()
    }

    println("\n==================================================")
    println("🎉 All tests finished in ${totalExecutionTime} ms!")
    println("==================================================")
}

// ✅ Top-level suspend functions
suspend fun fetchUserData(): String {
    delay(800L) // Simulates API network latency
    return "Sokha"
}

suspend fun fetchUserScore(): Int {
    delay(600L) // Runs concurrently with fetchUserData
    return 95
}

suspend fun performRiskyOperation() {
    delay(200L)
    throw IllegalStateException("Network connection failed!")
}