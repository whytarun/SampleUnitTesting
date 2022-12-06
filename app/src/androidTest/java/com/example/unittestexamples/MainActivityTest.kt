package com.example.unittestexamples

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import java.util.regex.Pattern.matches

class MainActivityTest{

    @get:Rule
    val activityScenarioRule = androidx.test.ext.junit.rules.activityScenarioRule<MainActivity>()

    @Test
    fun testNextButton_expectedCorrectQuote(){
        // arrange to get the view
//        onView(withId(R.id.btnNext)).perform(click())
//        onView(withId(R.id.btnPrevious)).perform(click())
//        onView(withId(R.id.btnPrevious)).perform(click())
//        onView(withId(R.id.btnPrevious)).perform(click())

        //onView(withId(R.id.quoteText)).perform(matches(withText("red valueee")))
        onView(withId(R.id.quoteText)).perform(typeText("updated text"))
    }

    @Test
    fun testShareButton_extendedIntentChooser(){
        Intents.init()
        val expected =allOf(hasAction(Intent.ACTION_SEND))
        onView(withId(R.id.floatingActionButton)).perform(click())
        intended(expected)
        Intents.release()
    }
}