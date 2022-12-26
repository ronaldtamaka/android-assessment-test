package com.example.pokemon.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/pokemon/data/DataManager;", "", "api", "Lcom/example/pokemon/network/APIService;", "prefs", "Lcom/example/pokemon/data/PreferencesHelper;", "localDatabase", "Lcom/example/pokemon/data/AppDatabase;", "(Lcom/example/pokemon/network/APIService;Lcom/example/pokemon/data/PreferencesHelper;Lcom/example/pokemon/data/AppDatabase;)V", "loadAllPokemonFromLocal", "Landroidx/paging/DataSource$Factory;", "", "Lcom/example/pokemon/data/local/pokemon/LocalPokemon;", "reqDetailPokemon", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/example/pokemon/model/api/detailpokemon/DetailPokemonResponse;", "name", "", "reqPokemon", "Lcom/example/pokemon/model/api/pokemon/PokemonResponse;", "page", "limit", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllPokemonToLocal", "Lio/reactivex/Completable;", "listPokemon", "", "app_devDebug"})
@javax.inject.Singleton()
public final class DataManager {
    private final com.example.pokemon.network.APIService api = null;
    private final com.example.pokemon.data.PreferencesHelper prefs = null;
    private final com.example.pokemon.data.AppDatabase localDatabase = null;
    
    @javax.inject.Inject()
    public DataManager(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.network.APIService api, @org.jetbrains.annotations.NotNull()
    com.example.pokemon.data.PreferencesHelper prefs, @org.jetbrains.annotations.NotNull()
    com.example.pokemon.data.AppDatabase localDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable saveAllPokemonToLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemon.data.local.pokemon.LocalPokemon> listPokemon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.example.pokemon.data.local.pokemon.LocalPokemon> loadAllPokemonFromLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reqPokemon(int page, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.pokemon.model.api.pokemon.PokemonResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<retrofit2.Response<com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse>> reqDetailPokemon(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}