package com.example.crud.controlls

import com.example.crud.model.Response
import com.example.crud.model.UserDTO
import com.example.crud.services.UserService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("user")
class UserControll {

    @Inject
    lateinit var userService: UserService

    /**
     * Salva um novo usuario
     * */
    @Post
    fun save(@Body userDto: UserDTO): HttpResponse<Response<UserDTO>> {
        val response = Response<UserDTO>()
        val user = userDto.toUse()

        return if (user != null) {
            userService.saveUser(user, response)
            HttpResponse.ok()
        } else {
            response.errors.add("Usuario invalido!")
            HttpResponse.badRequest(response)
        }
    }

    /**
     * Retorna todos os usuarios salvos
     * */
    @Get
    fun findAll(): HttpResponse<Response<List<UserDTO>>>{
        val response = Response<List<UserDTO>>()
        userService.findAll(response)
        return HttpResponse.ok(response)
    }

    /**
     * Apaga um usuario por id
     * */
    @Delete("/{id}")
    fun delete(@Part id: Long): HttpResponse<Response<UserDTO>>{
        val response = Response<UserDTO>()
        userService.delete(id, response)
        return HttpResponse.ok(response)
    }

    /**
     * Encontra um usuario por id
     * */
    @Get("/{id}")
    fun findById(@Part id: Long): HttpResponse<Response<UserDTO>>{
        val response = Response<UserDTO>()
        userService.findById(id, response)
        return HttpResponse.ok(response)
    }

}