package com.example.pokemon.data.local.pokemon;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/pokemon/data/local/pokemon/LocalPokemonDao;", "", "deleteAllPokemon", "", "loadAllPokemon", "", "Lcom/example/pokemon/data/local/pokemon/LocalPokemon;", "loadAllPokemonPaged", "Landroidx/paging/DataSource$Factory;", "", "loadPokemonById", "name", "", "renewAllData", "pokemonList", "saveAllPokemon", "app_devDebug"})
public abstract interface LocalPokemonDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pokemon")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.example.pokemon.data.local.pokemon.LocalPokemon> loadAllPokemonPaged();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pokemon")
    public abstract java.util.List<com.example.pokemon.data.local.pokemon.LocalPokemon> loadAllPokemon();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pokemon WHERE pokemon_name=:name")
    public abstract com.example.pokemon.data.local.pokemon.LocalPokemon loadPokemonById(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveAllPokemon(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemon.data.local.pokemon.LocalPokemon> pokemonList);
    
    @androidx.room.Query(value = "DELETE FROM pokemon")
    public abstract void deleteAllPokemon();
    
    @androidx.room.Transaction()
    public abstract void renewAllData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemon.data.local.pokemon.LocalPokemon> pokemonList);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void renewAllData(@org.jetbrains.annotations.NotNull()
        com.example.pokemon.data.local.pokemon.LocalPokemonDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<com.example.pokemon.data.local.pokemon.LocalPokemon> pokemonList) {
        }
    }
}