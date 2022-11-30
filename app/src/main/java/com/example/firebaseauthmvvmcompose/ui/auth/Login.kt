package com.example.firebaseauthmvvmcompose.ui.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthmvvmcompose.R
import com.example.firebaseauthmvvmcompose.navaigation.ROUTE_SIGNUP
import com.example.firebaseauthmvvmcompose.ui.theme.FirebaseAuthMvvmComposeTheme
import com.example.firebaseauthmvvmcompose.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    navController: NavController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val spacing = MaterialTheme.spacing
        val (refHeader, refEmail, refPassword, refButtonLogin, refTextSignup) = createRefs()

        Box(modifier = Modifier
            .constrainAs(refHeader) {
                top.linkTo(parent.top, spacing.extraLarge)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
            .wrapContentSize()) {
            AuthHeader()
        }

        TextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = stringResource(id = R.string.email))
        },
            modifier = Modifier.constrainAs(refEmail) {
                top.linkTo(refHeader.bottom, spacing.extraLarge)
                start.linkTo(parent.start, spacing.large)
                end.linkTo(parent.end, spacing.large)
                width = Dimension.fillToConstraints
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                autoCorrect = false,
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        TextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = stringResource(id = R.string.password))
        },
            modifier = Modifier.constrainAs(refPassword) {
                top.linkTo(refEmail.bottom, spacing.medium)
                start.linkTo(parent.start, spacing.large)
                end.linkTo(parent.end, spacing.large)
                width = Dimension.fillToConstraints
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                autoCorrect = false,
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )

        Button(onClick = {

        }, modifier = Modifier.constrainAs(refButtonLogin) {
            top.linkTo(refPassword.bottom, spacing.large)
            start.linkTo(parent.start, spacing.extraLarge)
            end.linkTo(parent.end, spacing.extraLarge)
            width = Dimension.fillToConstraints
        }) {
            Text(
                text = stringResource(id = R.string.login),
                style = MaterialTheme.typography.button,
                color = colorResource(id = R.color.white)
            )
        }

        Text(
            modifier = Modifier.constrainAs(refTextSignup) {
                top.linkTo(refButtonLogin.bottom, spacing.medium)
                start.linkTo(parent.start, spacing.extraLarge)
                end.linkTo(parent.end, spacing.extraLarge)
            }.clickable {
                navController.navigate(ROUTE_SIGNUP){
                    popUpTo(ROUTE_SIGNUP){ inclusive = true}
                }
            },
            text = stringResource(id = R.string.dont_have_account),
            style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
        )

    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    FirebaseAuthMvvmComposeTheme {
        LoginScreen(navController = rememberNavController())
    }
}