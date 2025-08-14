package com.example.jnidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.jnidemo.animals.Cat
import com.example.jnidemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cateat.setOnClickListener{
            Toast.makeText(this,Cat().eat(),Toast.LENGTH_SHORT).show()
        }
        binding.catmakesound.setOnClickListener{
            Toast.makeText(this,Cat().makeSound(),Toast.LENGTH_SHORT).show()
        }

    }
}