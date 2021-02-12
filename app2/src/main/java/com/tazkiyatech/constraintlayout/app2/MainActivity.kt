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

        showButtonTwo()
        changeButtonOneWidthToWrapContent()
    }

    fun toggleVisibility(view: View) {
        if (button2.visibility == View.VISIBLE) {
            hideButtonTwo()
        } else {
            showButtonTwo()
        }
    }

    fun toggleWidth(view: View) {
        if (button1.layoutParams.width == ConstraintLayout.LayoutParams.WRAP_CONTENT) {
            changeButtonOneWidthToMatchConstraint()
        } else {
            changeButtonOneWidthToWrapContent()
        }
    }

    private fun showButtonTwo() {
        button2.visibility = View.VISIBLE
    }

    private fun hideButtonTwo() {
        button2.visibility = View.GONE
    }

    private fun changeButtonOneWidthToWrapContent() {
        button1.layoutParams.width = ConstraintLayout.LayoutParams.WRAP_CONTENT
        button1.requestLayout()
    }

    private fun changeButtonOneWidthToMatchConstraint() {
        button1.layoutParams.width = ConstraintLayout.LayoutParams.MATCH_CONSTRAINT
        button1.requestLayout()
    }
}