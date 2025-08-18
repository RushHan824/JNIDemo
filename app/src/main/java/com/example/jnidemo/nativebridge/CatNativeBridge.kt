package com.example.jnidemo.nativebridge

import com.example.jnidemo.animals.Cat

class CatNativeBridge {
    private val cat = Cat()

    fun eat(): String = cat.nativeEat()
    fun makeSound(): String = cat.nativeMakeSound()
    init {
        System.loadLibrary("jnidemo")
    }
}