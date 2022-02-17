package com.example.ca1

import android.app.AlarmManager
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ca1.prog.LoadingDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loading = LoadingDialog(this)
        loading.startLoading()
        val handler = Handler()
        handler.postDelayed(object :Runnable{
            override fun run() {
                loading.isDismiss()
            }

        },5000)
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        val button = findViewById<Button>(R.id.nextButton)
        val button1 = findViewById<Button>(R.id.nextButton1)
        val button2 = findViewById<Button>(R.id.nextButton2)

        button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
startActivity(intent)
            finish()
        }
        button1.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        button2.setOnClickListener{
            val intent = Intent(this,com.example.ca1.MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        }
        }


