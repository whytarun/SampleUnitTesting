package com.example.unittestexamples

import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test(expected = FileNotFoundException :: class)
    fun populateQuoteFromAsset() {
        val quoteManager =QuoteManager()
            quoteManager.populateQuoteFromAsset(ApplicationProvider.getApplicationContext(),"")
    }

    @Test(expected = JsonSyntaxException :: class)
    fun populateQuoteFromAsset_invalidException_Json() {
        val quoteManager =QuoteManager()
        quoteManager.populateQuoteFromAsset(ApplicationProvider.getApplicationContext(),"malformed.json")
    }

    @Test
    fun populateQuoteFromAsset_validJson_Count() {
        val quoteManager =QuoteManager()
        quoteManager.populateQuoteFromAsset(ApplicationProvider.getApplicationContext(),"quote.json")
        assertEquals(9,quoteManager.quoteList)
    }

    @Test
    fun testPreviousQuote_expected_correctQuote(){
        val quoteManager =QuoteManager()
        //arrange
        quoteManager.populateQuotes(arrayOf(
            Quote("red","1"),
            Quote("blue","2"),
            Quote("green","3")
        ))

        //act
        val quote =quoteManager.getPreviousQuote()
        //assert

        assertEquals(1,quote.color)
    }
}