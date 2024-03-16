package com.example.cba.Screen


import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cba.Data.ApiDataItem
import com.example.cba.MainViewModel
import com.example.cba.Routes

@Composable
fun ScreenMain(viewModel: MainViewModel){
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Routes.Details.route) { val apiDataItem = ApiDataItem("192.168.1.1", "Home Network", "Bangalore")
        val apiDataItemScreenMain = ApiDataItem("115.99.218.21", "115.99.218.0/23", "Krishnagiri")

        composable(Routes.Details.route) {
            DetailsPage(navController = navController, apiDataItem = apiDataItemScreenMain)
        }
    }
}