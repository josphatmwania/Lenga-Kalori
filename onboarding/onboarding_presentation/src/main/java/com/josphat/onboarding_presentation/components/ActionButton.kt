package com.josphat.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.Text
//import androidx.compose.material3.TextStyle



@Composable
fun ActionButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier,
    isEnabled: Boolean = false,
    /**
     * Todo
     */
//    textStyle: TextStyle = MaterialTheme.typography.labelMedium
) {
    Button(
        onClick = onClick,
        modifier = Modifier,
        shape = RoundedCornerShape(100.dp)

    ) {
        Text{
            text = text,
//            style = textStyle,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)



        }
    }


}


