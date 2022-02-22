package com.anncode.navigationtest.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.navigation.NavController
import com.anncode.navigationtest.ui.domain.User
import com.anncode.navigationtest.ui.theme.CyanBlue

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ProfileScreen(
    navController: NavController,
    user: User
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = CyanBlue
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "My Profile ${user.name}",
                color = Color.White,
                fontSize = TextUnit(50F, TextUnitType.Sp)
            )
        }
    }
}

