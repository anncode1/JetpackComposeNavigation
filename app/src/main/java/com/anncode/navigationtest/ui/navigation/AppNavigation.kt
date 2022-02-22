package com.anncode.navigationtest.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.anncode.navigationtest.ui.domain.User
import com.anncode.navigationtest.ui.screens.HomeScreen
import com.anncode.navigationtest.ui.screens.LoginScreen
import com.anncode.navigationtest.ui.screens.ProfileScreen
import com.anncode.navigationtest.ui.screens.SignInScreen
import com.google.gson.Gson

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.LoginScreen.name
    ) {
        composable(AppScreens.LoginScreen.name) { LoginScreen(navController) }
        composable(AppScreens.HomeScreen.name) { HomeScreen(navController) }
        composable(
            route = AppScreens.ProfileScreen.name + "/{userJson}"/*,
            // By default is string
            arguments = listOf(
                navArgument("userJson") {
                    type = NavType.fromArgType(".User", "com.anncode.navigationtest.ui.domain")
                }
            )*/
        ) {

            val userJson = it.arguments?.getString("userJson")
            val user = Gson().fromJson(userJson, User::class.java)
            ProfileScreen(navController, user)

        }
        composable(AppScreens.SignInScreen.name) { SignInScreen(navController) }
    }
}
