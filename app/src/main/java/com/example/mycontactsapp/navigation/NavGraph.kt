package com.example.mycontactsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mycontactsapp.ui.auth.LoginScreen
import com.example.mycontactsapp.ui.auth.RegisterScreen
import com.example.mycontactsapp.ui.contact.ContactDetailScreen
import com.example.mycontactsapp.ui.contact.ContactFormScreen
import com.example.mycontactsapp.ui.home.HomeScreen
import com.example.mycontactsapp.ui.splash.SplashScreen

@Composable
fun NavGraph(navController : NavHostController){

    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("contactDetail") { ContactDetailScreen(navController) }
        composable("contactForm/{mode}") { backStackEntry ->
            val mode = backStackEntry.arguments?.getString("mode") ?: "Add"
            ContactFormScreen(navController, mode)
        }
    }
}