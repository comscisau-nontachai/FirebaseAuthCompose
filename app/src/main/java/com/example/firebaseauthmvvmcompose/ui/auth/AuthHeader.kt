package com.example.firebaseauthmvvmcompose.ui.auth

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firebaseauthmvvmcompose.R
import com.example.firebaseauthmvvmcompose.ui.theme.FirebaseAuthMvvmComposeTheme
import com.example.firebaseauthmvvmcompose.ui.theme.spacing

@Composable
fun AuthHeader() {
    Column(
        modifier = Modifier.wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val spacing = androidx.compose.material.MaterialTheme.spacing
        Image(
            modifier = Modifier.size(128.dp,128.dp),
            painter = painterResource(id = R.drawable.ic_app_logo),
            contentDescription = stringResource(id = R.string.app_name)
        )
        Text(
            modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = spacing.medium),
            text = "Firebase Auth Sample",
            style = MaterialTheme.typography.h5,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.onSurface
        )
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun AppHeaderLight() {
    FirebaseAuthMvvmComposeTheme {
        AuthHeader()
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AppHeaderDark() {
    FirebaseAuthMvvmComposeTheme {
        AuthHeader()
    }
}