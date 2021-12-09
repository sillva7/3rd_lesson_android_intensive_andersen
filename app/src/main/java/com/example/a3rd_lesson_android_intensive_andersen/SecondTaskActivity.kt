package com.example.a3rd_lesson_android_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import com.squareup.picasso.Picasso

class SecondTaskActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)

        editText = findViewById(R.id.editText)
        imageView = findViewById(R.id.imageView)


        editText.doAfterTextChanged {
            Picasso.get().load(editText.text.toString()).into(imageView)
            Log.d("TAG", "onCreate: " + editText.text.toString())
        }


    }

//
}