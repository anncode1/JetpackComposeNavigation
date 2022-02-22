package com.anncode.navigationtest.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anncode.navigationtest.ui.composables.RoundedButton
import com.anncode.navigationtest.ui.theme.Purple500


@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Purple500
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RoundedButton(onClick = { /*TODO*/ }, text = "Login")
            RoundedButton(onClick = { /*TODO*/ }, text = "Create an Account")
        }
    }

}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
