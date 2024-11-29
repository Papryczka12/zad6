package com.example.eaefasdf

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBoxPets: CheckBox = findViewById(R.id.checkBoxPets)
        val editTextPetNames: EditText = findViewById(R.id.editTextPetNames)

        checkBoxPets.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                editTextPetNames.visibility = View.VISIBLE
            } else {
                editTextPetNames.visibility = View.GONE
            }
        }
    }
}
