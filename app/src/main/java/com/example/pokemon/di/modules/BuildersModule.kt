package com.example.pokemon.di.modules

import com.example.pokemon.feature.listpokemon.ListPokemonActivity
import com.example.pokemon.feature.detailpokemon.DetailPokemonActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule{
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindDetailPokemonActivity(): DetailPokemonActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindListPokemonActivity(): ListPokemonActivity
}