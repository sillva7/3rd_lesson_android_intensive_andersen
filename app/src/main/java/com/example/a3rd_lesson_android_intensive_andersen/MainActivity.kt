package com.example.a3rd_lesson_android_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toFirstTask(view: View) {

        startActivity(Intent(this, FirstTaskActivity::class.java))

    }

    fun toSecondTask(view: View) {

        startActivity(Intent(this, SecondTaskActivity::class.java))

    }
}