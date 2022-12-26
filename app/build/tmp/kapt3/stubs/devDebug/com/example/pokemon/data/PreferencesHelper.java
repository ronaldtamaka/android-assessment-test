package com.example.pokemon.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/pokemon/data/PreferencesHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mPref", "Landroid/content/SharedPreferences;", "clear", "", "getBoolean", "", "key", "", "getInt", "", "getString", "defaultValue", "putBoolean", "value", "putInt", "putString", "app_devDebug"})
@javax.inject.Singleton()
public final class PreferencesHelper {
    private final android.content.SharedPreferences mPref = null;
    
    @javax.inject.Inject()
    public PreferencesHelper(@org.jetbrains.annotations.NotNull()
    @com.example.pokemon.di.scopes.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void clear() {
    }
}