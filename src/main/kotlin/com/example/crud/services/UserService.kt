package com.example.crud.services

import com.example.crud.model.Response
import com.example.crud.domain.User
import com.example.crud.model.UserDTO

interface UserService {

    fun saveUser(user: User, response: Response<UserDTO>)

    fun delete(userId: Long, response: Response<UserDTO>)

    fun findAll(response: Response<List<UserDTO>>)

    fun findById(userId: Long, response: Response<UserDTO>)

}