package com.anncode.navigationtest.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anncode.navigationtest.ui.composables.RoundedButton
import com.anncode.navigationtest.ui.theme.Purple700

@Composable
fun SignInScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Purple700
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RoundedButton(onClick = { /*TODO*/ }, text = "Create")
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen()
}
