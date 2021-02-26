package com.example.crud.services

import com.example.crud.model.Response
import com.example.crud.domain.User
import com.example.crud.model.UserDTO
import com.example.crud.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserServiceImplementacao : UserService {

    @Inject
    lateinit var userRepository: UserRepository

    override fun saveUser(user: User, response: Response<UserDTO>) {

        val tempUser = userRepository.findByEmail(user.email)

        if (tempUser != null){
            response.errors.add("Usuario ja Cadastrado!")
            return
        }

        userRepository.apply {
            save(user)
            findByEmail(user.email)?.let { response.response = UserDTO(it) }
        }
    }

    override fun delete(userId: Long, response: Response<UserDTO>) {
        userRepository.deleteById(userId)
    }

    override fun findAll(response: Response<List<UserDTO>>) {
        val userList = userRepository.findAll().map { UserDTO(it) }
        response.response = userList
    }

    override fun findById(userId: Long, response: Response<UserDTO>) {
        val user = userRepository.findById(userId)
        if (user.isPresent){
            response.response = UserDTO(user.get())
        }else{
            response.errors.add("Id invalido!")
        }
    }
}