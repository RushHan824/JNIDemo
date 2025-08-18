package com.example.jnidemo.repository

import com.example.jnidemo.nativebridge.CatNativeBridge

class CatRepository :AnimalRepository{
    private val bridge = CatNativeBridge()

    override fun getEatBehavior(): String = bridge.eat()
    override fun getSoundBehavior(): String = bridge.makeSound()
}