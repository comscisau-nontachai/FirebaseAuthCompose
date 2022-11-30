package com.example.firebaseauthmvvmcompose.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthmvvmcompose.R
import com.example.firebaseauthmvvmcompose.ui.theme.FirebaseAuthMvvmComposeTheme
import com.example.firebaseauthmvvmcompose.ui.theme.spacing

@Composable
fun HomeScreen(navController: NavController) {
    var spacing = MaterialTheme.spacing
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(spacing.medium)
            .padding(top = spacing.extraLarge),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.welcome_back),
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall,
            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = stringResource(id = R.string.name),
            style = androidx.compose.material3.MaterialTheme.typography.displaySmall,
            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
        )
        Image(
            painter = painterResource(id = R.drawable.ic_person),
            contentDescription = stringResource(id = R.string.empty),
            modifier = Modifier.size(128.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(spacing.medium)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {

                Text(
                    text = stringResource(id = R.string.name),
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.3f),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Dev Test",
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.7f),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {

                Text(
                    text = stringResource(id = R.string.email),
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.3f),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "dev@gmail.com",
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.7f),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                )
            }
        }

        /*button*/
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = spacing.extraLarge)
        ) {
            Text(text = stringResource(id = R.string.logout), color = colorResource(id = R.color.white))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    FirebaseAuthMvvmComposeTheme() {
        HomeScreen(navController = rememberNavController())
    }
}