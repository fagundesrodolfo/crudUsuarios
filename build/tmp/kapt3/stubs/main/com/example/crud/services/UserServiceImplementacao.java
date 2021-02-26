package com.example.crud.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u000eH\u0016J\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/crud/services/UserServiceImplementacao;", "Lcom/example/crud/services/UserService;", "()V", "userRepository", "Lcom/example/crud/repository/UserRepository;", "getUserRepository", "()Lcom/example/crud/repository/UserRepository;", "setUserRepository", "(Lcom/example/crud/repository/UserRepository;)V", "delete", "", "userId", "", "response", "Lcom/example/crud/model/Response;", "Lcom/example/crud/model/UserDTO;", "findAll", "", "findById", "saveUser", "user", "Lcom/example/crud/model/domain/User;", "crudUsuarios"})
@javax.inject.Singleton
public final class UserServiceImplementacao implements com.example.crud.services.UserService {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    public com.example.crud.repository.UserRepository userRepository;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.crud.repository.UserRepository getUserRepository() {
        return null;
    }
    
    public final void setUserRepository(@org.jetbrains.annotations.NotNull
    com.example.crud.repository.UserRepository p0) {
    }
    
    @java.lang.Override
    public void saveUser(@org.jetbrains.annotations.NotNull
    com.example.crud.model.domain.User user, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response) {
    }
    
    @java.lang.Override
    public void delete(long userId, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response) {
    }
    
    @java.lang.Override
    public void findAll(@org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<java.util.List<com.example.crud.model.UserDTO>> response) {
    }
    
    @java.lang.Override
    public void findById(long userId, @org.jetbrains.annotations.NotNull
    com.example.crud.model.Response<com.example.crud.model.UserDTO> response) {
    }
    
    public UserServiceImplementacao() {
        super();
    }
}