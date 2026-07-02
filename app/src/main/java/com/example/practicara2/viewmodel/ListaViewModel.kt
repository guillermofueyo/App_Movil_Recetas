package com.example.practicara2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.practicara2.model.Receta
import com.example.practicara2.model.RepositorioRecetas
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListaViewModel : ViewModel() {


    private val _textoBusqueda = MutableStateFlow("")
    val textoBusqueda: StateFlow<String> = _textoBusqueda.asStateFlow()


    private val _categoriaSeleccionada = MutableStateFlow<String?>(null)
    val categoriaSeleccionada: StateFlow<String?> = _categoriaSeleccionada.asStateFlow()


    private val _recetasFiltradas = MutableStateFlow(RepositorioRecetas.recetas)
    val recetasFiltradas: StateFlow<List<Receta>> = _recetasFiltradas.asStateFlow()


    val categorias: List<String> = RepositorioRecetas.categorias


    fun onTextoBusquedaCambia(texto: String) {
        _textoBusqueda.value = texto
        aplicarFiltros()
    }


    fun onCategoriaSeleccionada(categoria: String) {
        _categoriaSeleccionada.value =
            if (_categoriaSeleccionada.value == categoria) null else categoria
        aplicarFiltros()
    }


    private fun aplicarFiltros() {
        val texto = _textoBusqueda.value.lowercase()
        val categoria = _categoriaSeleccionada.value

        _recetasFiltradas.value = RepositorioRecetas.recetas.filter { receta ->
            val coincideNombre = receta.nombre.lowercase().contains(texto)
            val coincideCategoria = categoria == null || receta.categoria == categoria
            coincideNombre && coincideCategoria
        }
    }
}