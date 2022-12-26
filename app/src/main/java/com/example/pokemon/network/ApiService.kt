package com.example.pokemon.network

import com.example.pokemon.model.api.pokemon.PokemonResponse
import com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface APIService {
    @GET("pokemon/{name}")
    fun requestDetailPokemon(
        @Path("name") name: String
    ): Single<Response<DetailPokemonResponse>>

    @GET("pokemon")
    suspend fun requestListPokemon(
        @Query("limit") limit: Int,
        @Query("offset") page: Int
    ): Response<PokemonResponse>
}
