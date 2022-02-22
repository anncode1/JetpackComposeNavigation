package com.anncode.navigationtest.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.anncode.navigationtest.ui.composables.RoundedButton
import com.anncode.navigationtest.ui.navigation.AppScreens
import com.anncode.navigationtest.ui.theme.Purple500


@Composable
fun LoginScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Purple500
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RoundedButton(onClick = {
                navController.navigate(AppScreens.HomeScreen.name)
            }, text = "Login")
            RoundedButton(onClick = {
                navController.navigate(AppScreens.SignInScreen.name)
            }, text = "Create an Account")
        }
    }

}
