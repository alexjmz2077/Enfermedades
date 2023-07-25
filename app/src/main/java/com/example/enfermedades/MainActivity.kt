package com.example.enfermedades

import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    private lateinit var autoComplete: AutoCompleteTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val items = listOf(
            "Amoxicilina",
            "Ampicilina",
            "Azitromicina",
            "Bacitracina",
            "Cefalexina",
            "Cefoperazona",
            "Cefradina",
            "Claritromicina",
            "Enrofloxacina",
            "Espiramicina",
            "Florfenicol",
            "Furaltadona",
            "Tiafenicol"
        )

        autoComplete = findViewById(R.id.auto_complete)






    }
}