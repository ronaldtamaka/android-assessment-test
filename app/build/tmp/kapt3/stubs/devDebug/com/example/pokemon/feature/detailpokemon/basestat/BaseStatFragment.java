package com.example.pokemon.feature.detailpokemon.basestat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatFragment;", "Lcom/example/pokemon/base/BaseFragment;", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatViewModel;", "()V", "_binding", "Lcom/example/pokemon/databinding/FragmentBaseStatBinding;", "adapter", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatAdapter;", "binding", "getBinding", "()Lcom/example/pokemon/databinding/FragmentBaseStatBinding;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "Companion", "app_devDebug"})
public final class BaseStatFragment extends com.example.pokemon.base.BaseFragment<com.example.pokemon.feature.detailpokemon.basestat.BaseStatViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<com.example.pokemon.feature.detailpokemon.basestat.BaseStatViewModel> viewModelClass = null;
    private com.example.pokemon.databinding.FragmentBaseStatBinding _binding;
    private com.example.pokemon.feature.detailpokemon.basestat.BaseStatAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STAT = "STAT";
    
    public BaseStatFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.example.pokemon.feature.detailpokemon.basestat.BaseStatViewModel> getViewModelClass() {
        return null;
    }
    
    private final com.example.pokemon.databinding.FragmentBaseStatBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatFragment$Companion;", "", "()V", "KEY_STAT", "", "newInstance", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatFragment;", "data", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String data) {
            return null;
        }
    }
}