package com.example.pokemon.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/pokemon/network/APIService;", "", "requestDetailPokemon", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/example/pokemon/model/api/detailpokemon/DetailPokemonResponse;", "name", "", "requestListPokemon", "Lcom/example/pokemon/model/api/pokemon/PokemonResponse;", "limit", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "pokemon/{name}")
    public abstract io.reactivex.Single<retrofit2.Response<com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse>> requestDetailPokemon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pokemon")
    public abstract java.lang.Object requestListPokemon(@retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.pokemon.model.api.pokemon.PokemonResponse>> continuation);
}