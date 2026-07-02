package com.example.practicara2.model

data class Receta(
    val id: Int,
    val nombre: String,
    val categoria: String,
    val descripcion: String,
    val ingredientes: List<String>,
    val pasos: List<String>,
    val imagen: Int
)