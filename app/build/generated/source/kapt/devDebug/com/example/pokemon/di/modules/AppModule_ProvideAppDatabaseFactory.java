// Generated by Dagger (https://dagger.dev).
package com.example.pokemon.di.modules;

import com.example.pokemon.App;
import com.example.pokemon.data.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<App> applicationProvider;

  public AppModule_ProvideAppDatabaseFactory(AppModule module, Provider<App> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(module, applicationProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(AppModule module,
      Provider<App> applicationProvider) {
    return new AppModule_ProvideAppDatabaseFactory(module, applicationProvider);
  }

  public static AppDatabase provideAppDatabase(AppModule instance, App application) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase(application));
  }
}