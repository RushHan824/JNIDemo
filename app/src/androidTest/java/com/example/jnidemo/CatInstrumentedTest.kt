package com.example.jnidemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.jnidemo.animals.Cat
import com.example.jnidemo.nativebridge.CatNativeBridge
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CatInstrumentedTest {
    //@get:Rule val scenario = ActivityScenarioRule(MainActivity::class.java)
    //这个是 junit 的规则 告诉测试框架在每次运行前后要做一些事情
    //这里是启动 mainactivity
    //当然如果不依赖 activity 可以不写这个

    @Test
    fun eat_returns_expected_string() {
        val cat = Cat()
        val out = cat.eat()
        assertEquals("Cats eat fish", out)
    }

    @Test
    fun makeSound_calls_back_and_returns_meow() {
        val cat = Cat()
        val out = cat.makeSound()
        assertEquals("Meow~", out)   // 你 demo 里回调返回的是 "Meow~"
    }
}