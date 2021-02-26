package com.example.crud.model

/**
 * Classe genérica de resposta para requisições
 * */
data class Response<T>(
    var response: T? = null
) {
    /**
     * Lista para salvar os possiveis erros
     * E será repassada para o cliente
     * */
    val errors = ArrayList<String>()
}
