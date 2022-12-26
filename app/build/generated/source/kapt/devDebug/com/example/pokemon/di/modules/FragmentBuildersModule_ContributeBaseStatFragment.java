package com.example.pokemon.di.modules;

import com.example.pokemon.feature.detailpokemon.basestat.BaseStatFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeBaseStatFragment.BaseStatFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeBaseStatFragment {
  private FragmentBuildersModule_ContributeBaseStatFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BaseStatFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BaseStatFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BaseStatFragmentSubcomponent extends AndroidInjector<BaseStatFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BaseStatFragment> {}
  }
}
