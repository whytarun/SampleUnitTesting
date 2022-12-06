package com.example.unittestexamples.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized ::class)
class ParameterizedTestCase(private val inputString :String, private val expectedValue :Boolean) {

    @Test
    fun test(){
        val helper =Helper()
        val result = helper.isPallindrome(inputString)
        Assert.assertEquals(expectedValue, result)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters
        fun data() :List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}