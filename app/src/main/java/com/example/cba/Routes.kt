package com.example.cba

sealed class Routes(val route: String) {
    data object Details : Routes("Details")
}