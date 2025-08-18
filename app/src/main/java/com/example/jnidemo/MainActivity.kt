package com.example.jnidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jnidemo.databinding.ActivityMainBinding
import com.example.jnidemo.repository.CatRepository
import com.example.jnidemo.repository.AnimalRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repository: AnimalRepository = CatRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cateat.setOnClickListener{showBehavior(Behavior.EAT)}
        binding.catmakesound.setOnClickListener{showBehavior(Behavior.SOUND)}

    }
    private enum class Behavior{EAT,SOUND}

    private fun showBehavior(kind:Behavior){
            val msg=when(kind){
                Behavior.EAT->repository.getEatBehavior()
                Behavior.SOUND->repository.getSoundBehavior()
            }
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}

