package com.example.pokemon.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/example/pokemon/di/modules/ViewModelModule;", "", "()V", "bindBaseStatViewModel", "Landroidx/lifecycle/ViewModel;", "baseStatViewModel", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatViewModel;", "bindDetailPokemonViewModel", "detailPokemonViewModel", "Lcom/example/pokemon/feature/detailpokemon/DetailPokemonViewModel;", "bindListPokemonViewModel", "listPokemonViewModel", "Lcom/example/pokemon/feature/listpokemon/ListPokemonViewModel;", "bindMovesViewModel", "movesViewModel", "Lcom/example/pokemon/feature/detailpokemon/moves/MovesViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/pokemon/base/AppViewModelFactory;", "app_devDebug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ViewModelKey(value = com.example.pokemon.feature.detailpokemon.basestat.BaseStatViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBaseStatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.detailpokemon.basestat.BaseStatViewModel baseStatViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ViewModelKey(value = com.example.pokemon.feature.detailpokemon.moves.MovesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMovesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.detailpokemon.moves.MovesViewModel movesViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ViewModelKey(value = com.example.pokemon.feature.detailpokemon.DetailPokemonViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDetailPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.detailpokemon.DetailPokemonViewModel detailPokemonViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ViewModelKey(value = com.example.pokemon.feature.listpokemon.ListPokemonViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindListPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.listpokemon.ListPokemonViewModel listPokemonViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.base.AppViewModelFactory factory);
}