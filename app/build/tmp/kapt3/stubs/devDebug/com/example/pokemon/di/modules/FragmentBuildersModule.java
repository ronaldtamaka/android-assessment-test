package com.example.pokemon.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/di/modules/FragmentBuildersModule;", "", "()V", "contributeBaseStatFragment", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatFragment;", "contributeMovesFragment", "Lcom/example/pokemon/feature/detailpokemon/moves/MovesFragment;", "app_devDebug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    public FragmentBuildersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment contributeBaseStatFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.pokemon.feature.detailpokemon.moves.MovesFragment contributeMovesFragment();
}