package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.databinding.DlapBinding

class MainActivity : AppCompatActivity() {
    //Databinding y Viewbinding crean clases de acuerdo al nombre establecido en el xml
    private lateinit var binding: ActivityMainBinding
    //private lateinit var binding2: DlapBinding
    private lateinit var alumno: Alumno

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.tvHelloWorld.text = "Holiiiii!"

        alumno = Alumno("Juana", "Lopez Ramirez")

        //binding.nombres = "Diana"
        //binding.apellidos = "Portillo"

        binding.alumno = alumno //Ligando los datos
    }

    fun click(view: View){
        alumno.nombres = "Diana"
        alumno.apellidos = "Portillo"

        binding.alumno = alumno
    }
}