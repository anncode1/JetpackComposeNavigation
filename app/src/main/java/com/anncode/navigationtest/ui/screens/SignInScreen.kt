package com.anncode.navigationtest.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.anncode.navigationtest.ui.composables.RoundedButton
import com.anncode.navigationtest.ui.domain.User
import com.anncode.navigationtest.ui.navigation.AppScreens
import com.anncode.navigationtest.ui.theme.Purple700
import com.google.gson.Gson

@Composable
fun SignInScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Purple700
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val user = User("Robert", "Code")
            val userJson = Gson().toJson(user)
            RoundedButton(onClick = {
                navController.navigate(AppScreens.ProfileScreen.name + "/$userJson") {
                    popUpTo(AppScreens.LoginScreen.name) {
                        inclusive = true
                    }
                }
            }, text = "Create")
        }
    }
}

