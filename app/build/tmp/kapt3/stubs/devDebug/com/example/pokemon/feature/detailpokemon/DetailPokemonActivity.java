package com.example.pokemon.feature.detailpokemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/DetailPokemonActivity;", "Lcom/example/pokemon/base/BaseActivity;", "Lcom/example/pokemon/feature/detailpokemon/DetailPokemonViewModel;", "Ldagger/android/HasAndroidInjector;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "binding", "Lcom/example/pokemon/databinding/ActivityDetailPokemonBinding;", "tabAdapter", "Lcom/example/pokemon/feature/detailpokemon/TabAdapter;", "typeAdapter", "Lcom/example/pokemon/feature/detailpokemon/TypeAdapter;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "Ldagger/android/AndroidInjector;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupTabs", "data", "Lcom/example/pokemon/model/api/detailpokemon/DetailPokemonResponse;", "Companion", "app_devDebug"})
public final class DetailPokemonActivity extends com.example.pokemon.base.BaseActivity<com.example.pokemon.feature.detailpokemon.DetailPokemonViewModel> implements dagger.android.HasAndroidInjector {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<com.example.pokemon.feature.detailpokemon.DetailPokemonViewModel> viewModelClass = null;
    private com.example.pokemon.databinding.ActivityDetailPokemonBinding binding;
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector;
    private com.example.pokemon.feature.detailpokemon.TabAdapter tabAdapter;
    private com.example.pokemon.feature.detailpokemon.TypeAdapter typeAdapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.pokemon.feature.detailpokemon.DetailPokemonActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POKEMON_NAME = "POKEMON_NAME";
    
    public DetailPokemonActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.example.pokemon.feature.detailpokemon.DetailPokemonViewModel> getViewModelClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidInjector() {
        return null;
    }
    
    public final void setAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupTabs(com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/DetailPokemonActivity$Companion;", "", "()V", "POKEMON_NAME", "", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}