package com.geekbrains.a2kotlinbuildtypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById<TextView>(R.id.textView).text = BuildConfig.TYPE
        Toast.makeText(applicationContext,"Paid config",Toast.LENGTH_SHORT).show()
    }
}