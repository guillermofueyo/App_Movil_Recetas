package com.example.practicara2.navigation

sealed class Screen (val route: String) {
    object Login: Screen("login")

    object Lista : Screen("lista")
    object Detalle : Screen("detalle/{idReceta}")



    {
        fun crearRuta(idReceta: Int) = "detalle/$idReceta"
    }
}