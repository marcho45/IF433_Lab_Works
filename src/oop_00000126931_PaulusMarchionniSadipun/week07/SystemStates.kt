package oop_00000126931_PaulusMarchionniSadipun.week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val massage: String) : ApiResponse()
    object Loading : ApiResponse()
}