package com.example.pokemon.feature.detailpokemon.basestat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatAdapter$StatHolder;", "data", "", "Lcom/example/pokemon/model/api/detailpokemon/StatsItem;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "StatHolder", "app_devDebug"})
public final class BaseStatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.pokemon.feature.detailpokemon.basestat.BaseStatAdapter.StatHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemon.model.api.detailpokemon.StatsItem> data = null;
    
    public BaseStatAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemon.model.api.detailpokemon.StatsItem> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemon.model.api.detailpokemon.StatsItem> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.pokemon.feature.detailpokemon.basestat.BaseStatAdapter.StatHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.detailpokemon.basestat.BaseStatAdapter.StatHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/basestat/BaseStatAdapter$StatHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/pokemon/databinding/ViewPokemonStatBinding;", "(Lcom/example/pokemon/databinding/ViewPokemonStatBinding;)V", "getBinding", "()Lcom/example/pokemon/databinding/ViewPokemonStatBinding;", "app_devDebug"})
    public static final class StatHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.pokemon.databinding.ViewPokemonStatBinding binding = null;
        
        public StatHolder(@org.jetbrains.annotations.NotNull()
        com.example.pokemon.databinding.ViewPokemonStatBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.databinding.ViewPokemonStatBinding getBinding() {
            return null;
        }
    }
}