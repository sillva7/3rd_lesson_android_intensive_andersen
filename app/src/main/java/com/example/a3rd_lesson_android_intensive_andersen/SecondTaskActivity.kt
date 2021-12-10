package com.example.a3rd_lesson_android_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception
import java.util.*

class SecondTaskActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var imageView: ImageView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)

        editText = findViewById(R.id.editText)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            try {
                Picasso.get().load(editText.text.toString())
                    .into(imageView, object : com.squareup.picasso.Callback {
                        override fun onSuccess() {
                        }
                        override fun onError(e: Exception?) {
                            Toast.makeText(
                                this@SecondTaskActivity,
                                "Cant upload image",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    })
            } catch (e: Exception) {
                Toast.makeText(this, "Cant upload image", Toast.LENGTH_SHORT).show()
            }
        }


    }

//
}