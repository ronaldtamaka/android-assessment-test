package com.example.pokemon.di.modules;

import com.example.pokemon.feature.detailpokemon.moves.MovesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeMovesFragment.MovesFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeMovesFragment {
  private FragmentBuildersModule_ContributeMovesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MovesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MovesFragmentSubcomponent extends AndroidInjector<MovesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovesFragment> {}
  }
}
