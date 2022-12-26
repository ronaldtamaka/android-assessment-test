package com.example.pokemon.di.modules;

import com.example.pokemon.feature.detailpokemon.DetailPokemonActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = BuildersModule_BindDetailPokemonActivity.DetailPokemonActivitySubcomponent.class
)
public abstract class BuildersModule_BindDetailPokemonActivity {
  private BuildersModule_BindDetailPokemonActivity() {}

  @Binds
  @IntoMap
  @ClassKey(DetailPokemonActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetailPokemonActivitySubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface DetailPokemonActivitySubcomponent
      extends AndroidInjector<DetailPokemonActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetailPokemonActivity> {}
  }
}
