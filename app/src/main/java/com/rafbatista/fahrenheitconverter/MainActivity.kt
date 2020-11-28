package com.rafbatista.fahrenheitconverter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.rafbatista.fahrenheitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun convertToCelsius(view: View) {
        val userInput = binding.editTextTempInput.text
        val fahrenheitTemp =  userInput.toString().toFloat()
        val celsiusTemp = ( (fahrenheitTemp  -  32.0  ) *  5.0) / 9.0
        val roundedCelsiusTemp = String.format("%.2f", celsiusTemp)
        Log.i("Converted Temp" , roundedCelsiusTemp)

        val toast = Toast.makeText(this, "Success", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 225)
        toast.show()

        binding.convertedTemp.setText(roundedCelsiusTemp)

    }

    fun convertToFahrenheit(view: View) {
        val userInput = binding.editTextTempInput.text
        val celciusTemp =  userInput.toString().toFloat()
        val fahrenheitTemp = ( (celciusTemp  * 9.0 / 5.0) ) + 32.0
        val roundedFahrenheitTemp = String.format("%.2f", fahrenheitTemp)
        Log.i("Converted Temp" , roundedFahrenheitTemp)

        val toast = Toast.makeText(this, "Success", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 225)
        toast.show()

        binding.convertedTemp.setText(roundedFahrenheitTemp)

    }

}