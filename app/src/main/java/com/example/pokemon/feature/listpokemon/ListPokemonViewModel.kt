package com.example.pokemon.feature.listpokemon

import androidx.paging.*
import com.example.pokemon.base.BaseViewModel
import com.example.pokemon.data.DataManager
import com.example.pokemon.model.api.pokemon.Pokemon
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope

class ListPokemonViewModel
@Inject constructor(private val dataManager: DataManager) : BaseViewModel(){

    lateinit var dataFlow: Flow<PagingData<Pokemon>>

    fun loadData() {
        dataFlow = Pager(
            config = PagingConfig(pageSize = 10, initialLoadSize = 10),
            pagingSourceFactory = { ListPokemonDataSource(dataManager) }
        ).flow.cachedIn(viewModelScope)
    }

}