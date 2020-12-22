package com.bipash.dictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtWord : EditText
    private lateinit var btnMeaning : Button
    private val wordMeading = mutableMapOf("Namaste" to "greetings","Jaam" to "Lets Go", "Gadha" to "Donkey")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtWord = findViewById(R.id.txtWord)
        btnMeaning = findViewById(R.id.btnMeaning)


        btnMeaning.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnMeaning ->{
                var word = txtWord.text.toString()
                if(word in wordMeading){
                    word = wordMeading[word]!!.toString()
                }
                else{
                    word = "Not found in Dictionary"
                }
                val intent = Intent(
                    this,
                    DictionaryMeaning::class.java)
                    intent.putExtra("meaning",word)
                    startActivity(intent)
            }
        }
    }
}