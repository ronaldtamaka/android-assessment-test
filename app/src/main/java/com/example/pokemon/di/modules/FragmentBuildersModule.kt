package com.example.pokemon.di.modules

import com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment
import com.example.pokemon.feature.detailpokemon.moves.MovesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeBaseStatFragment(): BaseStatFragment

    @ContributesAndroidInjector
    abstract fun contributeMovesFragment(): MovesFragment

}