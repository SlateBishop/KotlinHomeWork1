package ru.gb.makulin.homework1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var firstText: TextView
    private lateinit var secondText: TextView
    private val data  = MyDataClass()
    private val data2  = data.copy(secondProperty =  "Новое свойство")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        setOnClickListener()
        setDataText(data2)
        cyclesTest()

    }

    private fun cyclesTest() {
        println()
        CyclesTest().foreachTest()
        CyclesTest().forTest()
        CyclesTest().downToTest()
//        CyclesTest().
//        CyclesTest().
//        CyclesTest().
    }

    private fun setDataText(data : MyDataClass) {

        firstText.text = data.firstProperty
        secondText.text = data.secondProperty
    }

    private fun initView() {
        button = findViewById(R.id.test_button)
        firstText = findViewById(R.id.text_first)
        secondText = findViewById(R.id.text_second)

    }

    private fun setOnClickListener() {
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "Работает", Toast.LENGTH_SHORT).show()
            }
        })
    }
}