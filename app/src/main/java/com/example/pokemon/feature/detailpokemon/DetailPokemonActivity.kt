package com.example.pokemon.feature.detailpokemon

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.pokemon.base.BaseActivity
import com.example.pokemon.databinding.ActivityDetailPokemonBinding
import com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment
import com.example.pokemon.feature.detailpokemon.moves.MovesFragment
import com.example.pokemon.model.api.detailpokemon.DetailPokemonResponse
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class DetailPokemonActivity : BaseActivity<DetailPokemonViewModel>(), HasAndroidInjector {
    override val viewModelClass: Class<DetailPokemonViewModel> = DetailPokemonViewModel::class.java
    private lateinit var binding: ActivityDetailPokemonBinding

    @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

    private lateinit var tabAdapter: TabAdapter
    private lateinit var typeAdapter: TypeAdapter

    companion object {
        const val POKEMON_NAME = "POKEMON_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.data.observe(this, {
            setupTabs(it)

            Glide.with(this)
                .load(it.sprites?.other?.officialArtwork?.frontDefault)
                .centerCrop()
                .into(binding.artwork)
            binding.name.text = it.name

            typeAdapter = TypeAdapter(it.types)
            binding.rvType.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            binding.rvType.adapter = typeAdapter
        })

        intent.getStringExtra(POKEMON_NAME)?.let {
            viewModel.loadDetail(it)
        }
    }

    private fun setupTabs(data: DetailPokemonResponse){
        tabAdapter = TabAdapter(supportFragmentManager, lifecycle)
        tabAdapter.addFragments(BaseStatFragment.newInstance(Gson().toJson(data)))
        tabAdapter.addFragments(MovesFragment.newInstance(Gson().toJson(data.moves)))
        binding.pager.adapter = tabAdapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            if(position==0){
                tab.text = "Base Stats"
            }else{
                tab.text = "Moves"
            }
        }.attach()
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

}