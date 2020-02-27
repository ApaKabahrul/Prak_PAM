package com.pam.praktikum

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.hello).setOnClickListener {
            val i = Intent(this@MainActivity, Activity2::class.java)
            startActivity(i)
        }
    }
}