package com.example.pokemon.feature.listpokemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/pokemon/feature/listpokemon/ListPokemonViewModel;", "Lcom/example/pokemon/base/BaseViewModel;", "dataManager", "Lcom/example/pokemon/data/DataManager;", "(Lcom/example/pokemon/data/DataManager;)V", "dataFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/pokemon/model/api/pokemon/Pokemon;", "getDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "setDataFlow", "(Lkotlinx/coroutines/flow/Flow;)V", "loadData", "", "app_devDebug"})
public final class ListPokemonViewModel extends com.example.pokemon.base.BaseViewModel {
    private final com.example.pokemon.data.DataManager dataManager = null;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.pokemon.model.api.pokemon.Pokemon>> dataFlow;
    
    @javax.inject.Inject()
    public ListPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.data.DataManager dataManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.pokemon.model.api.pokemon.Pokemon>> getDataFlow() {
        return null;
    }
    
    public final void setDataFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.pokemon.model.api.pokemon.Pokemon>> p0) {
    }
    
    public final void loadData() {
    }
}