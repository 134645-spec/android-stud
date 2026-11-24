package com.example.roblox


import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backbutton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        var totalrbx = 0
        val robux = intent.getIntExtra("totalrobx", 0)
        if (robux !== null) {
            totalrbx = robux.toInt()
        }


        val button = findViewById<Button>(R.id.NEXT)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("totalrobux", totalrbx )
            startActivity(intent)

        }





    }
}