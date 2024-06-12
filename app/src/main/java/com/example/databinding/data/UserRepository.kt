package com.example.databinding.data

import com.example.databinding.Usuario

class UserRepository(private val dao: UserDao) {
    val users = dao.getAllUser()

    suspend fun insert(user: Usuario): Long{
        return dao.insertUser(user)
    }

    suspend fun delete(user:Usuario) {
        return dao.deleteUser(user)
    }
    suspend fun update(user:Usuario) {
        return dao.updateUser(user)
    }



}
