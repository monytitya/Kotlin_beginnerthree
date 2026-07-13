package Oparetors

fun main() {
    val isPasswordCorrect = true
    val isRecognizedDevice = false
    val hasTwoFactorEnabled = false
    val isAccountLocked = false

    var allowDirectLogin = false
    var requireTwoFactorPIN = false
    var showBlockedMessage = false

    // PRINT RESULTS
    println("Direct Login Allowed: $allowDirectLogin")
    println("2FA PIN Required: $requireTwoFactorPIN")
    println("Account Blocked: $showBlockedMessage")
}