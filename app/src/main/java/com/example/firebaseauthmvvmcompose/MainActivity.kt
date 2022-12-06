package com.example.firebaseauthmvvmcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.firebaseauthmvvmcompose.navaigation.AppNavHost
import com.example.firebaseauthmvvmcompose.ui.auth.AuthViewModel
import com.example.firebaseauthmvvmcompose.ui.theme.FirebaseAuthMvvmComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<AuthViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseAuthMvvmComposeTheme {
                AppNavHost(viewModel)
            }
        }
    }
}