package com.example.crud.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0007H&J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\u000f"}, d2 = {"Lcom/example/crud/services/UserService;", "", "delete", "", "userId", "", "response", "Lcom/example/crud/model/Response;", "Lcom/example/crud/model/UserDTO;", "findAll", "", "findById", "saveUser", "user", "Lcom/example/crud/model/domain/User;", "crudUsuarios"})
public abstract interface UserService {
    
    public abstract void saveUser(@org.jetbrains.annotations.NotNull
    com.example.crud.model.domain.User user, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response);
    
    public abstract void delete(long userId, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response);
    
    public abstract void findAll(@org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<java.util.List<com.example.crud.model.UserDTO>> response);
    
    public abstract void findById(long userId, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response);
}