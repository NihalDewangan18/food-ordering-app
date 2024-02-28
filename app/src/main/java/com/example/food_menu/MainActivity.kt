package com.example.food_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnButtonClick()
    }

    private fun addListenerOnButtonClick() {
        val button : Button = findViewById(R.id.submitButton)
        val fries: CheckBox = findViewById(R.id.checkBox)
        val burger: CheckBox = findViewById(R.id.checkBox2)
        val pizza: CheckBox = findViewById(R.id.checkBox3)
        val cake: CheckBox = findViewById(R.id.checkBox4)
        val brownie: CheckBox = findViewById(R.id.checkBox5)

        button.setOnClickListener {
            var totalAmount = 0
            val result = StringBuilder()
            result.append("Selected Items:")
            if (pizza.isChecked) {
                result.append("\nPizza 100Rs")
                totalAmount += 100
            }
            if (cake.isChecked) {
                result.append("\nCoffee 50Rs")
                totalAmount += 50
            }
            if (burger.isChecked) {
                result.append("\nBurger 120Rs")
                totalAmount += 120
            }
            result.append("\nTotal: $totalAmount Rs")
            // Displaying the message on the toast
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_LONG).show()
        }
    }
}