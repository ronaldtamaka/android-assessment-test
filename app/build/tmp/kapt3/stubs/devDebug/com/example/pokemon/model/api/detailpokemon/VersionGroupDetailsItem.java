package com.example.pokemon.model.api.detailpokemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/pokemon/model/api/detailpokemon/VersionGroupDetailsItem;", "", "levelLearnedAt", "", "versionGroup", "Lcom/example/pokemon/model/api/detailpokemon/VersionGroup;", "moveLearnMethod", "Lcom/example/pokemon/model/api/detailpokemon/MoveLearnMethod;", "(Ljava/lang/Integer;Lcom/example/pokemon/model/api/detailpokemon/VersionGroup;Lcom/example/pokemon/model/api/detailpokemon/MoveLearnMethod;)V", "getLevelLearnedAt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoveLearnMethod", "()Lcom/example/pokemon/model/api/detailpokemon/MoveLearnMethod;", "getVersionGroup", "()Lcom/example/pokemon/model/api/detailpokemon/VersionGroup;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/example/pokemon/model/api/detailpokemon/VersionGroup;Lcom/example/pokemon/model/api/detailpokemon/MoveLearnMethod;)Lcom/example/pokemon/model/api/detailpokemon/VersionGroupDetailsItem;", "equals", "", "other", "hashCode", "toString", "", "app_devDebug"})
public final class VersionGroupDetailsItem {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "level_learned_at")
    private final java.lang.Integer levelLearnedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "version_group")
    private final com.example.pokemon.model.api.detailpokemon.VersionGroup versionGroup = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "move_learn_method")
    private final com.example.pokemon.model.api.detailpokemon.MoveLearnMethod moveLearnMethod = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemon.model.api.detailpokemon.VersionGroupDetailsItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer levelLearnedAt, @org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.VersionGroup versionGroup, @org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.MoveLearnMethod moveLearnMethod) {
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
    
    public VersionGroupDetailsItem() {
        super();
    }
    
    public VersionGroupDetailsItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer levelLearnedAt, @org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.VersionGroup versionGroup, @org.jetbrains.annotations.Nullable()
    com.example.pokemon.model.api.detailpokemon.MoveLearnMethod moveLearnMethod) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLevelLearnedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.VersionGroup component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.VersionGroup getVersionGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.MoveLearnMethod component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.model.api.detailpokemon.MoveLearnMethod getMoveLearnMethod() {
        return null;
    }
}