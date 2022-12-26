package com.example.pokemon.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/pokemon/util/NetworkState;", "", "status", "Lcom/example/pokemon/util/NetworkState$Status;", "(Lcom/example/pokemon/util/NetworkState$Status;)V", "responseCode", "", "(Lcom/example/pokemon/util/NetworkState$Status;I)V", "isSuccess", "", "(Lcom/example/pokemon/util/NetworkState$Status;IZ)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getStatus", "()Lcom/example/pokemon/util/NetworkState$Status;", "generateMessageBasedResponseCode", "", "code", "Companion", "Status", "app_devDebug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final com.example.pokemon.util.NetworkState.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String msg;
    private int responseCode = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.pokemon.util.NetworkState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.pokemon.util.NetworkState LOADED = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.pokemon.util.NetworkState LOADING = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemon.util.NetworkState.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.util.NetworkState.Status status) {
        super();
    }
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.util.NetworkState.Status status, int responseCode) {
        super();
    }
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.util.NetworkState.Status status, int responseCode, boolean isSuccess) {
        super();
    }
    
    private final void generateMessageBasedResponseCode(int code) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/pokemon/util/NetworkState$Status;", "", "(Ljava/lang/String;I)V", "RUNNING", "SUCCESS", "FAILED", "app_devDebug"})
    public static enum Status {
        /*public static final*/ RUNNING /* = new RUNNING() */,
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ FAILED /* = new FAILED() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/pokemon/util/NetworkState$Companion;", "", "()V", "LOADED", "Lcom/example/pokemon/util/NetworkState;", "getLOADED", "()Lcom/example/pokemon/util/NetworkState;", "LOADING", "getLOADING", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.util.NetworkState getLOADED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.util.NetworkState getLOADING() {
            return null;
        }
    }
}