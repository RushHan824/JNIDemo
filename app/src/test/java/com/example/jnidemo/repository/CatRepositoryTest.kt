package com.example.jnidemo.repository

import com.example.jnidemo.nativebridge.CatNativeBridge
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CatRepositoryTest {

    private lateinit var catRepository: CatRepository
    private val mockBridge = mockk<CatNativeBridge>()

    @Before
    fun setUp() {
        catRepository = CatRepository()
        catRepository.bridge = mockBridge
    }

    @Test
    fun `getEatBehavior should return bridge eat result`() {
        every { mockBridge.eat() } returns "Cat is eating fish"
        
        val result = catRepository.getEatBehavior()
        
        assertEquals("Cat is eating fish", result)
    }

    @Test
    fun `getSoundBehavior should return bridge makeSound result`() {
        every { mockBridge.makeSound() } returns "Meow!"
        
        val result = catRepository.getSoundBehavior()
        
        assertEquals("Meow!", result)
    }
}