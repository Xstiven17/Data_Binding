package com.example.databinding.data

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.databinding.Usuario

interface UserDao {

    @Insert
    suspend fun insertUser(user: Usuario): Long

    @Update
    suspend fun updateUser(user: Usuario)

    @Delete
    suspend fun deleteUser(user: Usuario)

    @Query("SELECT*FROM usuario")
    fun getAllUser(): LiveData<List<Usuario>>

    @Query("DELETE FROM usuario")
    fun deleteAllUser()
}