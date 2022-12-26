package com.example.pokemon.feature.detailpokemon;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/DetailPokemonViewModel;", "Lcom/example/pokemon/base/BaseViewModel;", "dataManager", "Lcom/example/pokemon/data/DataManager;", "(Lcom/example/pokemon/data/DataManager;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/pokemon/model/api/detailpokemon/DetailPokemonResponse;", "getData$app_devDebug", "()Landroidx/lifecycle/MutableLiveData;", "setData$app_devDebug", "(Landroidx/lifecycle/MutableLiveData;)V", "loadDetail", "", "name", "", "app_devDebug"})
public final class DetailPokemonViewModel extends com.example.pokemon.base.BaseViewModel {
    private final com.example.pokemon.data.DataManager dataManager = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse> data;
    
    @javax.inject.Inject()
    public DetailPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.data.DataManager dataManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse> getData$app_devDebug() {
        return null;
    }
    
    public final void setData$app_devDebug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse> p0) {
    }
    
    public final void loadDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}