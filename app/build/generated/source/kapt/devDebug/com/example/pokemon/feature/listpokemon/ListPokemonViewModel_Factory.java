// Generated by Dagger (https://dagger.dev).
package com.example.pokemon.feature.listpokemon;

import com.example.pokemon.data.DataManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ListPokemonViewModel_Factory implements Factory<ListPokemonViewModel> {
  private final Provider<DataManager> dataManagerProvider;

  public ListPokemonViewModel_Factory(Provider<DataManager> dataManagerProvider) {
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public ListPokemonViewModel get() {
    return newInstance(dataManagerProvider.get());
  }

  public static ListPokemonViewModel_Factory create(Provider<DataManager> dataManagerProvider) {
    return new ListPokemonViewModel_Factory(dataManagerProvider);
  }

  public static ListPokemonViewModel newInstance(DataManager dataManager) {
    return new ListPokemonViewModel(dataManager);
  }
}
