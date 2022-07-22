package com.tazkiyatech.constraintlayout.app3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Flow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.textView1).setOnClickListener {
            findViewById<View>(R.id.textView2).visibility = View.VISIBLE
        }

        findViewById<View>(R.id.textView2).setOnClickListener {
            it.visibility = View.GONE
        }

        findViewById<View>(R.id.textView3).setOnClickListener {
            findViewById<View>(R.id.textView4).visibility = View.VISIBLE
        }

        findViewById<View>(R.id.textView4).setOnClickListener {
            it.visibility = View.GONE
        }
    }
}
