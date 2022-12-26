package com.example.pokemon.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/pokemon/di/modules/AppModule;", "", "()V", "provideAppDatabase", "Lcom/example/pokemon/data/AppDatabase;", "application", "Lcom/example/pokemon/App;", "provideContext", "Landroid/content/Context;", "app_devDebug"})
@dagger.Module(includes = {com.example.pokemon.di.modules.ViewModelModule.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ApplicationContext()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.App application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.pokemon.data.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.App application) {
        return null;
    }
}