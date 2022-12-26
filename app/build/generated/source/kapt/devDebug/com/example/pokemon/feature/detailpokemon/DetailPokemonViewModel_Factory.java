// Generated by Dagger (https://dagger.dev).
package com.example.pokemon.feature.detailpokemon;

import com.example.pokemon.data.DataManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailPokemonViewModel_Factory implements Factory<DetailPokemonViewModel> {
  private final Provider<DataManager> dataManagerProvider;

  public DetailPokemonViewModel_Factory(Provider<DataManager> dataManagerProvider) {
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public DetailPokemonViewModel get() {
    return newInstance(dataManagerProvider.get());
  }

  public static DetailPokemonViewModel_Factory create(Provider<DataManager> dataManagerProvider) {
    return new DetailPokemonViewModel_Factory(dataManagerProvider);
  }

  public static DetailPokemonViewModel newInstance(DataManager dataManager) {
    return new DetailPokemonViewModel(dataManager);
  }
}