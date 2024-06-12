package com.example.databinding.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.databinding.Usuario

@Database(entities = [Usuario::class], version = 1)

abstract class UserDataBase: RoomDatabase(){
    abstract val userDao: UserDao

    companion object {
        @Volatile
        private var INSTANCE: UserDataBase ?= null
        fun getInstance(context:Context): UserDataBase {
            synchronized(this){
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDataBase::class.java,
                        "User_db"
                    )
                        .build()
                }
                INSTANCE = instance
                return instance
            }
        }
    }
}
