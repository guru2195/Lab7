package com.humber.lab5.model

// Data class representing the login credentials.
data class LoginModel(
    val username: String,
    val password: String
) {
    // Returns true if both username and password are not blank.
    fun isValid(): Boolean {
        return username.isNotBlank() && password.isNotBlank()
    }

    // Dummy authentication function that simulates a login attempt.
    // Returns a LoginResult indicating success or failure.
    fun attemptLogin(): LoginResult {
        if (!isValid()) {
            return LoginResult.Failure("Username or password cannot be empty.")
        }
        // Replace the logic below with your real authentication mechanism.
        return if (username == "admin" && password == "password") {
            LoginResult.Success
        } else {
            LoginResult.Failure("Invalid credentials.")
        }
    }
}

// A sealed class to represent the result of a login attempt.
sealed class LoginResult {
    object Success : LoginResult()
    data class Failure(val errorMessage: String) : LoginResult()
}
