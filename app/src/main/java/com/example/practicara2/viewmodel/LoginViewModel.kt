package com.example.practicara2.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel : ViewModel(){

    private val _usuario = MutableStateFlow("")
    val usuario: StateFlow<String> = _usuario.asStateFlow()

    private val _contrasena = MutableStateFlow("")
    val contrasena: StateFlow<String> = _contrasena.asStateFlow()

    private val _loginFallido = MutableStateFlow(false)
    val loginFallido: StateFlow<Boolean> = _loginFallido.asStateFlow()

    private val USUARIO_VALIDO = "usuario1"
    private val CONTRASENA_VALIDA = "usuario1"

    fun onUsuarioCambia(texto: String) {
        _usuario.value = texto
        _loginFallido.value = false
    }

    fun onContrasenaCambia(texto: String) {
        _contrasena.value = texto
        _loginFallido.value = false
    }

    fun iniciarSesion(): Boolean {
        return if (_usuario.value == USUARIO_VALIDO &&
            _contrasena.value == CONTRASENA_VALIDA) {
            _loginFallido.value = false
            true
        } else {
            _loginFallido.value = true
            false
        }
    }
}
