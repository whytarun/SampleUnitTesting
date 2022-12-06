package com.example.unittestexamples.utils

import org.junit.Assert
import org.junit.Test

class StringTest {

    @Test
    fun testReverseString_SingleChar_expectedSingleChar(){
        val helper =Helper()
        val result =helper.reverseString("a")
        Assert.assertEquals("a", result)
    }

    @Test
    fun testReverseString_validInput_expectedSingleChar(){
        val helper =Helper()
        val result =helper.reverseString("help")
        Assert.assertEquals("pleh", result)
    }

    @Test(expected = IllegalArgumentException ::class)
    fun testReverseString_invalidInput_expectedNull(){
        val helper =Helper()
        val result =helper.reverseString(null)
        Assert.assertEquals("Illegal argument exception", result)
    }
}