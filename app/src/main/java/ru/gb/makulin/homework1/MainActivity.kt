package ru.gb.makulin.homework1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()
        setOnClickListener()
    }

    private fun initButton() {
        button = findViewById(R.id.test_button)
    }

    private fun setOnClickListener() {
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "Работает", Toast.LENGTH_SHORT).show()
            }
        })
    }
}