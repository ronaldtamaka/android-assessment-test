package com.example.pokemon.feature.detailpokemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/TypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/pokemon/feature/detailpokemon/TypeAdapter$TypeHolder;", "data", "", "Lcom/example/pokemon/model/api/detailpokemon/TypesItem;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getColor", "", "type", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TypeHolder", "app_devDebug"})
public final class TypeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.pokemon.feature.detailpokemon.TypeAdapter.TypeHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemon.model.api.detailpokemon.TypesItem> data = null;
    
    public TypeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemon.model.api.detailpokemon.TypesItem> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemon.model.api.detailpokemon.TypesItem> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.pokemon.feature.detailpokemon.TypeAdapter.TypeHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.feature.detailpokemon.TypeAdapter.TypeHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final java.lang.String getColor(java.lang.String type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/feature/detailpokemon/TypeAdapter$TypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/pokemon/databinding/ViewPokemonTypeBinding;", "(Lcom/example/pokemon/databinding/ViewPokemonTypeBinding;)V", "getBinding", "()Lcom/example/pokemon/databinding/ViewPokemonTypeBinding;", "app_devDebug"})
    public static final class TypeHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.pokemon.databinding.ViewPokemonTypeBinding binding = null;
        
        public TypeHolder(@org.jetbrains.annotations.NotNull()
        com.example.pokemon.databinding.ViewPokemonTypeBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.databinding.ViewPokemonTypeBinding getBinding() {
            return null;
        }
    }
}