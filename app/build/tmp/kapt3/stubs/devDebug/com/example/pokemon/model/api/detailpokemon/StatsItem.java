package com.example.pokemon.model.api.detailpokemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/pokemon/model/api/detailpokemon/StatsItem;", "", "stat", "Lcom/example/pokemon/model/api/detailpokemon/Stat;", "baseStat", "", "effort", "(Lcom/example/pokemon/model/api/detailpokemon/Stat;ILjava/lang/Integer;)V", "getBaseStat", "()I", "getEffort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStat", "()Lcom/example/pokemon/model/api/detailpokemon/Stat;", "component1", "component2", "component3", "copy", "(Lcom/example/pokemon/model/api/detailpokemon/Stat;ILjava/lang/Integer;)Lcom/example/pokemon/model/api/detailpokemon/StatsItem;", "equals", "", "other", "hashCode", "toString", "", "app_devDebug"})
public final class StatsItem {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stat")
    private final com.example.pokemon.model.api.detailpokemon.Stat stat = null;
    @com.google.gson.annotations.SerializedName(value = "base_stat")
    private final int baseStat = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "effort")
    private final java.lang.Integer effort = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemon.model.api.detailpokemon.StatsItem copy(@org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.Stat stat, int baseStat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer effort) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public StatsItem() {
        super();
    }
    
    public StatsItem(@org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.Stat stat, int baseStat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer effort) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.Stat component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.Stat getStat() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getBaseStat() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEffort() {
        return null;
    }
}