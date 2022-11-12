package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.component1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Из текстовой XML разметки создаются видмые на устройстве View
        setContentView(R.layout.activity_main)

        // Присвоить переменной ссылку на view с id button1 из layout activity_main
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button_zero)
        val buttonMinus = findViewById<Button>(R.id.button_minus)
        val buttonPlus = findViewById<Button>(R.id.button_plus)
        val buttonDiv = findViewById<Button>(R.id.button_div)
        val buttonMult = findViewById<Button>(R.id.button_mult)
        val buttonEquals = findViewById<Button>(R.id.button_equals)
        val buttonC = findViewById<Button>(R.id.button_C)
        val textView = findViewById<TextView>(R.id.textView)


        // Присваиваем переменной ссылку на экземпляр класса (объект)
        val clickListener = object : View.OnClickListener {

            // Метод объекта OnClickListener вызовется при нажатии на кнопку
            override fun onClick(view: View) {
                // В переменную digit присвой значение цифры в зависимости от нажатой кнопки
                // view - кнопка из XML, на которую нажали
                val digit = when (view.id) {
                    R.id.button1 -> 1
                    R.id.button2 -> 2
                    R.id.button3 -> 3
                    R.id.button4 -> 4
                    R.id.button5 -> 5
                    R.id.button6 -> 6
                    R.id.button7 -> 7
                    R.id.button8 -> 8
                    R.id.button9 -> 9
                    R.id.button_zero -> 0

                    else -> -0
                }

                textView.text = digit.toString()
            }


        }

        // Передаем ссылку на объект clickListener в метод setOnClickListener,
        // который назначит его кнопке
        button1.setOnClickListener(clickListener)

    }
}