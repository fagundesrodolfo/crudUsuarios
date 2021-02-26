package com.example.crud.model;

import java.lang.System;

/**
 * Classe genérica de resposta para requisições
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/example/crud/model/Response;", "T", "", "response", "(Ljava/lang/Object;)V", "errors", "Ljava/util/ArrayList;", "", "getErrors", "()Ljava/util/ArrayList;", "getResponse", "()Ljava/lang/Object;", "setResponse", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/example/crud/model/Response;", "equals", "", "other", "hashCode", "", "toString", "crudUsuarios"})
public final class Response<T extends java.lang.Object> {
    
    /**
     * Lista para salvar os possiveis erros
     * E será repassada para o cliente
     */
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.String> errors = null;
    @org.jetbrains.annotations.Nullable
    private T response;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getErrors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable
    T p0) {
    }
    
    public Response(@org.jetbrains.annotations.Nullable
    T response) {
        super();
    }
    
    public Response() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T component1() {
        return null;
    }
    
    /**
     * Classe genérica de resposta para requisições
     */
    @org.jetbrains.annotations.NotNull
    public final com.example.crud.model.Response<T> copy(@org.jetbrains.annotations.Nullable
    T response) {
        return null;
    }
    
    /**
     * Classe genérica de resposta para requisições
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Classe genérica de resposta para requisições
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Classe genérica de resposta para requisições
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
}