package com.example.databinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val usuarioViewModel: Usuario by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usuarioViewModel.usuario.observe(this, Observer {
                usuario ->
            binding.nombreId.text = usuario.nombre
            binding.edadId.text = usuario.edad.toString()
        })

        updateUser()
    }

    fun updateUser() {
        usuarioViewModel.actualizarUsuario("Juan", 25)
    }
}