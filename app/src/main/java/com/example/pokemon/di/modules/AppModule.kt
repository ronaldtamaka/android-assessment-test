package com.example.pokemon.di.modules

import android.content.Context
import androidx.room.Room
import com.example.pokemon.App
import com.example.pokemon.data.AppDatabase
import com.example.pokemon.data.AppDatabase.Companion.MIGRATION_1_2
import dagger.Provides
import com.example.pokemon.di.scopes.ApplicationContext
import dagger.Module
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @ApplicationContext
    fun provideContext(application: App): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideAppDatabase(application: App): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "pokemon.db")
            //.addMigrations(MIGRATION_1_2) //TODO enable this to test migration from v1 to v2
            .build()
    }

}