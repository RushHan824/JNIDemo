package com.example.jnidemo.animals

class Cat : Animal {
    //JNI正向调用 eat
    override fun eat(): String = nativeEat()

    //JNI返向调用
    override fun makeSound(): String = nativeMakeSound()

    external fun nativeEat():String

    external  fun nativeMakeSound():String
    fun calledByNative():String = "Meow~"
}