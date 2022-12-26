package com.example.pokemon.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/di/component/AppComponent;", "", "inject", "", "app", "Lcom/example/pokemon/App;", "Builder", "app_devDebug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.example.pokemon.di.modules.AppModule.class, com.example.pokemon.di.modules.NetworkModule.class, com.example.pokemon.di.modules.BuildersModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.App app);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/di/component/AppComponent$Builder;", "", "application", "Lcom/example/pokemon/App;", "build", "Lcom/example/pokemon/di/component/AppComponent;", "networkModule", "Lcom/example/pokemon/di/modules/NetworkModule;", "app_devDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.pokemon.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.example.pokemon.App application);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.pokemon.di.component.AppComponent.Builder networkModule(@org.jetbrains.annotations.NotNull()
        com.example.pokemon.di.modules.NetworkModule networkModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.pokemon.di.component.AppComponent build();
    }
}