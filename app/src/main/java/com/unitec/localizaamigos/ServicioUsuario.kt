package com.unitec.localizaamigos

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
interface ServicioUsuario {
    //vamos a seguir la ruta de servicios estilo rest
    //el metodo post siempre se usa para guardar
    //a lo siguiente se le llama construccion de api rest
    @POST("api/usuario")
    fun guardar(@Body usuario:Usuario):Call<Estatus>
    //el siguiente metodo sirve para buscar todos los usuarios que guardasre
    @GET("api/usuario")
    fun buscarTodos():List<Usuario>
}