package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.databinding.DlapBinding

class MainActivity : AppCompatActivity() {
    //Databinding y Viewbinding crean clases de acuerdo al nombre establecido en el xml
    private lateinit var binding: ActivityMainBinding
    //private lateinit var binding2: DlapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.tvHelloWorld.text = "Holiiiii!"
        binding.nombres = "Diana"
        binding.apellidos = "Portillo"
    }
}