package com.example.unittestexamples.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    private lateinit var helper: Helper
    @Before
    fun setup(){
        helper =Helper()
        println(" before every test case")
    }

    @After
    fun tearDown(){
        println(" after every test cases")
    }
    @Test
    fun isPallindrome() {
        //arrange

        //act
        val result =helper.isPallindrome("Hello")
        //assert
        assertEquals(false,result)
    }

    @Test
    fun isPallindrome_input_level_expectedTrue(){
        //arrange
        val helper =Helper()
        //act
        val result =helper.isPallindrome("radar")
        //assert
        assertEquals(true,result)
    }
}