package com.example.jnidemo.animals

class Cat : Animal {
    //JNI正向调用 eat
    override fun eat(): String {
        return nativeEat()
    }
    external fun nativeEat():String

    //JNI返向调用
    override fun makeSound(): String {
        return nativeMakeSound()
    }
    external fun nativeMakeSound():String

    fun calledByNative():String{
        return "Meow~"
    }

    companion object{
        init {
            System.loadLibrary("jnidemo")
        }
    }
}