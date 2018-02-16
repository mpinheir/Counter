package com.pelware.counter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun incrementa (view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        textView.text = count.toString();
    }

    fun decrementa (view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()

        // Decrements counter value if counter > 0
        var count: Int = Integer.parseInt(countString)

        if (count > 0){
            count--
        }

        // Display the new value in the text view.
        textView.text = count.toString();
    }

    fun reset (view: View) {
        // Display the new value in the text view.
        textView.text = 0.toString();
    }

}

