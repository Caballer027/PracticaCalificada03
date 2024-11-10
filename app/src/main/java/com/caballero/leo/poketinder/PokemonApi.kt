package com.caballero.leo.poketinder

import retrofit2.Response
import retrofit2.http.GET
import okhttp3.OkHttpClient

interface PokemonApi {

    @GET("/api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>
}
