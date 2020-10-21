package com.unitec.localizaamigos

import retrofit2.http.Body
import retrofit2.http.POST
interface ServicioUsuario {
    //vamos a seguir la ruta de servicios estilo rest
    //el metodo post siempre se usa para guardar
    //a lo siguiente se le llama construccion de api rest
    @POST("api/usuario")
    fun guardar(@Body usuario:Usuario):Call<Estatus>
}