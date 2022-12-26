package com.example.pokemon.di.modules;

import com.example.pokemon.feature.listpokemon.ListPokemonActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = BuildersModule_BindListPokemonActivity.ListPokemonActivitySubcomponent.class
)
public abstract class BuildersModule_BindListPokemonActivity {
  private BuildersModule_BindListPokemonActivity() {}

  @Binds
  @IntoMap
  @ClassKey(ListPokemonActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ListPokemonActivitySubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface ListPokemonActivitySubcomponent extends AndroidInjector<ListPokemonActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ListPokemonActivity> {}
  }
}
