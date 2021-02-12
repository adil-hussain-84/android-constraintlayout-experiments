package com.tazkiyatech.constraintlayout.app1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Flow

class MainActivity : AppCompatActivity() {

    private val flow: Flow
        get() = findViewById(R.id.flow)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startAlignViews(view: View) {
        flow.setHorizontalAlign(Flow.HORIZONTAL_ALIGN_START)
    }

    fun centerAlignViews(view: View) {
        flow.setHorizontalAlign(Flow.HORIZONTAL_ALIGN_CENTER)
    }

    fun endAlignViews(view: View) {
        flow.setHorizontalAlign(Flow.HORIZONTAL_ALIGN_END)
    }
}