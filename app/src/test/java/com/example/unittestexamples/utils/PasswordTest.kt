package com.example.unittestexamples.utils

import org.junit.Assert
import org.junit.Test

class PasswordTest {
    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        //arrange
        val helper =Helper()
        // act
        val result =helper.validatePassword("     ")
        Assert.assertEquals("password is required field",result)
    }


    @Test
    fun validatePassword_2charInput_expectedValidationMessage(){
        //arrange
        val helper =Helper()
        // act
        val result =helper.validatePassword("ch")
        Assert.assertEquals("password should not be less than 6",result)
    }

    @Test
    fun validatePassword_16charInput_expectedValidationMessage(){
        //arrange
        val helper =Helper()
        // act
        val result =helper.validatePassword("ch3ff3f3f3f333333fffffffffffffff")
        Assert.assertEquals("password should not be greater than 15",result)
    }

    @Test
    fun validatePassword_ValidInput_expectedValidationMessage(){
        //arrange
        val helper =Helper()
        // act
        val result =helper.validatePassword("Tharun@91")
        //assert
        Assert.assertEquals("valid",result)
    }


}