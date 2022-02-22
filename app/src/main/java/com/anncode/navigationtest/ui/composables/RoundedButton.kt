package com.anncode.navigationtest.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundedButton(
    onClick: () -> Unit,
    text: String
) {
    OutlinedButton(
        onClick = { onClick.invoke() },
        border = BorderStroke(1.dp, Color.White),
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.White,
            backgroundColor = Color.Transparent
        ),

        ) {
        Text(text = text)
    }
}
