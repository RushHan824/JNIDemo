package com.example.jnidemo.animals

interface Animal {
    //JNI正向调用
    fun eat():String
    //JNI返向调用
    fun makeSound():String
}