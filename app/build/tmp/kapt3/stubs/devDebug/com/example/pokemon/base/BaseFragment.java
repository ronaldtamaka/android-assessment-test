package com.example.pokemon.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/pokemon/base/BaseFragment;", "T", "Lcom/example/pokemon/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "getViewModel", "()Lcom/example/pokemon/base/BaseViewModel;", "setViewModel", "(Lcom/example/pokemon/base/BaseViewModel;)V", "Lcom/example/pokemon/base/BaseViewModel;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_devDebug"})
public abstract class BaseFragment<T extends com.example.pokemon.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory factory;
    protected T viewModel;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<T> getViewModelClass();
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}