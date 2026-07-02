package com.example.practicara2.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.practicara2.model.Receta
import com.example.practicara2.model.RepositorioRecetas

class DetalleViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val idReceta: Int = savedStateHandle["idReceta"] ?: 0


    val receta: Receta? = RepositorioRecetas.buscarPorId(idReceta)
}