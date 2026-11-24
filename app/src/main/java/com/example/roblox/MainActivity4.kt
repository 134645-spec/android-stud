package com.example.roblox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backbutton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val username = findViewById<EditText>(R.id.user)
        val nextbutton4 = findViewById<Button>(R.id.NEXTT4)
        val back = findViewById<Button>(R.id.backbutt)

        back.setOnClickListener {
            finish()
        }


        nextbutton4.setOnClickListener {
            if (username != null) {
                val input = username.text.toString()
                val intent = Intent(this, MainActivity5::class.java)

                intent.putExtra("user" , input)
                startActivity(intent)
            }
        }
    }
}

