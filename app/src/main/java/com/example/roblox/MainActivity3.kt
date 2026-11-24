package com.example.roblox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backbutton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val robux = intent.getIntExtra("totalrbx", 0)
        val nextbutton3 = findViewById<Button>(R.id.NEXTT3)
        val textview1 = findViewById<TextView>(R.id.totall)
        textview1.text = "$robux Robux"
        val backk = findViewById<Button>(R.id.backk)
        backk.setOnClickListener {
            finish()
        }
        nextbutton3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("totalrbx", robux)
            startActivity(intent)
        }
    }
}