package com.example.unittestexamples

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val quoteText :TextView
    get() = findViewById(R.id.quoteText)

    private val quoteAuthor :TextView
        get() = findViewById(R.id.quoteAuthor)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun setQuote(quote: Quote){
        quoteText.text =quote.toString()
        quoteAuthor.text =quote.toString()
    }

    fun onPrevious(view: View) {

    }
    fun onNext(view: View) {

    }

    fun onShare(view: View) {
        val intent =Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        //intent.putExtra(Intent.EXTRA_TEXT)
        startActivity(intent)
    }
}