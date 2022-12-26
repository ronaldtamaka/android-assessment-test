package com.example.pokemon.feature.detailpokemon.basestat

import com.example.pokemon.base.BaseViewModel
import com.example.pokemon.data.DataManager
import com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse
import javax.inject.Inject

class BaseStatViewModel
@Inject constructor(private val dataManager: DataManager) : BaseViewModel(){

    fun generateBaseStat(data: DetailPokemonResponse) = data.stats

}