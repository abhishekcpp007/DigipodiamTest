package com.example.testapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Screen(val route: String) {
    object StartScreen : Screen("start")
    object MenuScreen : Screen("menu")
    object DetailScreen : Screen("detail")
}


@Composable
fun Nav(navController: NavHostController) {
    NavHost(
        navController = navController, startDestination = Screen.StartScreen.route
    ) {
        composable(Screen.StartScreen.route) {
            StartScreen(navController)
        }
        composable(Screen.MenuScreen.route){
            MenuScreen(navController)
        }
        composable(Screen.DetailScreen.route){
            DetailScreen(navController)
        }
    }
}