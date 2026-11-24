package com.example.roblox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backbutton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rbx = intent.getIntExtra("totalrobux", 0)
        val nextbutton2 = findViewById<Button>(R.id.NEXTT)
        val add100 = findViewById<Button>(R.id.add1)
        val add500 = findViewById<Button>(R.id.add2)
        val add1000 = findViewById<Button>(R.id.add3)
        val add5000 = findViewById<Button>(R.id.add4)
        val backbut = findViewById<Button>(R.id.backbut)
        val resettotal = findViewById<Button>(R.id.reset)
        val total = findViewById<Button>(R.id.total)
        var totalrbx = rbx?.toInt()
        total.setOnClickListener {
            Toast.makeText(this, "Your total robux is: $totalrbx", Toast.LENGTH_SHORT).show()
        }
        add100.setOnClickListener {
            totalrbx = totalrbx?.plus(100)
        }
        add500.setOnClickListener {
            totalrbx = totalrbx?.plus(500)
        }
        add1000.setOnClickListener {
            totalrbx = totalrbx?.plus(1000)
        }
        add5000.setOnClickListener {
            totalrbx = totalrbx?.plus(5000)
        }
        resettotal.setOnClickListener {
            totalrbx = 0
        }
        nextbutton2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("totalrbx", totalrbx?.toInt() ?: 0)
            startActivity(intent)

        }
        backbut.setOnClickListener {
            val intet = Intent(this, MainActivity::class.java)
            intet.putExtra("totalrobx", totalrbx?.toInt() ?: 0)
            startActivity(intet)

            }

    }
}