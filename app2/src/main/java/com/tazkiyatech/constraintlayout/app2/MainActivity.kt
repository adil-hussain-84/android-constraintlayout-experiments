package com.tazkiyatech.constraintlayout.app2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private val button1: Button
        get() = findViewById(R.id.button1)

    private val button2: Button
        get() = findViewById(R.id.button2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showButtonTwo(view: View) {
        button1.layoutParams.width = ConstraintLayout.LayoutParams.WRAP_CONTENT
        button2.visibility = View.VISIBLE
    }

    fun hideButtonTwo(view: View) {
        button1.layoutParams.width = ConstraintLayout.LayoutParams.MATCH_CONSTRAINT
        button2.visibility = View.GONE
    }
}