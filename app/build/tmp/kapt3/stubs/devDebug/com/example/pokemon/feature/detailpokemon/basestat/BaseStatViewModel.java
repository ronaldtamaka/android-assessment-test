package com.example.pokemon.feature.detailpokemon.basestat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatViewModel;", "Lcom/example/pokemon/base/BaseViewModel;", "dataManager", "Lcom/example/pokemon/data/DataManager;", "(Lcom/example/pokemon/data/DataManager;)V", "generateBaseStat", "", "Lcom/example/pokemon/model/api/detailpokemon/StatsItem;", "data", "Lcom/example/pokemon/model/api/detailpokemon/DetailPokemonResponse;", "app_devDebug"})
public final class BaseStatViewModel extends com.example.pokemon.base.BaseViewModel {
    private final com.example.pokemon.data.DataManager dataManager = null;
    
    @javax.inject.Inject()
    public BaseStatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.data.DataManager dataManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemon.model.api.detailpokemon.StatsItem> generateBaseStat(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse data) {
        return null;
    }
}