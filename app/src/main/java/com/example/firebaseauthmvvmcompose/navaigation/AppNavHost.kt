package com.example.firebaseauthmvvmcompose.navaigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthmvvmcompose.ui.auth.AuthViewModel
import com.example.firebaseauthmvvmcompose.ui.auth.LoginScreen
import com.example.firebaseauthmvvmcompose.ui.auth.SignupScreen
import com.example.firebaseauthmvvmcompose.ui.home.HomeScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDesc: String = ROUTE_LOGIN
) {
    NavHost(navController = navController, startDestination = startDesc, modifier = modifier) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel = viewModel, navController = navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel = viewModel, navController = navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel,navController = navController)
        }
    }
}