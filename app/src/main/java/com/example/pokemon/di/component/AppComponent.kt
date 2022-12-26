package com.example.pokemon.di.component

import com.example.pokemon.App
import com.example.pokemon.di.modules.NetworkModule
import dagger.BindsInstance
import com.example.pokemon.di.modules.BuildersModule
import com.example.pokemon.di.modules.AppModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    BuildersModule::class
])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        @BindsInstance
        fun networkModule(networkModule: NetworkModule): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}