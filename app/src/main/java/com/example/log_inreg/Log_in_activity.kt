package com.example.log_inreg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Log_in_activity : AppCompatActivity() {
    lateinit var Registrr:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        Registrr=findViewById(R.id.Txt_Reg)

        Registrr.setOnClickListener {
            val Rgb=Intent(this,MainActivity::class.java)
            startActivity(Rgb)
        }
    }
}