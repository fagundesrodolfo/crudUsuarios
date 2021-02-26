package com.example.crud.controlls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b0\nH\u0007J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0001\u0010\u0013\u001a\u00020\fH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/crud/controlls/UserControll;", "", "()V", "userService", "Lcom/example/crud/services/UserService;", "getUserService", "()Lcom/example/crud/services/UserService;", "setUserService", "(Lcom/example/crud/services/UserService;)V", "delete", "Lio/micronaut/http/HttpResponse;", "Lcom/example/crud/model/Response;", "Lcom/example/crud/model/UserDTO;", "id", "", "findAll", "", "findById", "save", "userDto", "crudUsuarios"})
@io.micronaut.http.annotation.Controller(value = "user")
public final class UserControll {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    public com.example.crud.services.UserService userService;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.crud.services.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull
    com.example.crud.services.UserService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post
    public final io.micronaut.http.HttpResponse<com.example.crud.model.Response<com.example.crud.model.UserDTO>> save(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    com.example.crud.model.UserDTO userDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/list")
    public final io.micronaut.http.HttpResponse<com.example.crud.model.Response<java.util.List<com.example.crud.model.UserDTO>>> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public final io.micronaut.http.HttpResponse<com.example.crud.model.Response<com.example.crud.model.UserDTO>> delete(@io.micronaut.http.annotation.Part
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final io.micronaut.http.HttpResponse<com.example.crud.model.Response<com.example.crud.model.UserDTO>> findById(@io.micronaut.http.annotation.Part
    long id) {
        return null;
    }
    
    public UserControll() {
        super();
    }
}