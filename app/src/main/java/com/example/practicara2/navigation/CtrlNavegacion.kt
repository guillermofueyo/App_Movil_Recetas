package com.example.practicara2.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicara2.view.DetalleView
import com.example.practicara2.view.ListaView
import com.example.practicara2.view.PantallaLogin
import com.example.practicara2.viewmodel.DetalleViewModel
import com.example.practicara2.viewmodel.ListaViewModel
import com.example.practicara2.viewmodel.LoginViewModel

@Composable
fun CtrlNavegacion() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {

        composable(route = Screen.Login.route) {
            val loginViewModel: LoginViewModel = viewModel()
            PantallaLogin(
                navController = navController,
                viewModel = loginViewModel
            )
        }


        composable(route = Screen.Lista.route) {
            val listaViewModel: ListaViewModel = viewModel()
            ListaView(
                navController = navController,
                viewModel = listaViewModel
            )
        }


        composable(
            route = Screen.Detalle.route,
            arguments = listOf(
                navArgument("idReceta") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val detalleViewModel: DetalleViewModel = viewModel(backStackEntry)
            DetalleView(
                navController = navController,
                viewModel = detalleViewModel
            )
        }
    }
}