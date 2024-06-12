package com.example.databinding

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuario")
data class  Usuario(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    var id: Int,
    @ColumnInfo(name = "user_name")
    var nombre: String,
    @ColumnInfo(name = "user_age")
    var edad: Int
)
