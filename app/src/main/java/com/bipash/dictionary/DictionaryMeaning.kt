package com.bipash.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DictionaryMeaning : AppCompatActivity() {
    private lateinit var txtMeaning : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary_meaning)

        txtMeaning = findViewById(R.id.txtMeaning)

        val intent = intent
        if(intent!=null){
            val meaning = intent.getStringExtra("meaning")
            txtMeaning.text = "Your given word meaning is : $meaning"
        }
        else{
            txtMeaning.text = "PLease do it again"
        }

    }
}