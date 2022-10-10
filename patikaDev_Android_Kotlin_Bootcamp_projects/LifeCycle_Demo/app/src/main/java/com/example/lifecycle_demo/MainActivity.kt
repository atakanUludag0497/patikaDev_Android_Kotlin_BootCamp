package com.example.lifecycle_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Bundle containing previous frozen state
        setContentView(R.layout.activity_main)
        // The content view pointing to the id of layout
        // in the file activity_main.xml
        val toast = Toast.makeText(applicationContext, "onCreate Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        // It will show a message on the screen
        // then onStart is invoked
        val toast  = Toast.makeText(applicationContext, "onStart Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        // It will show a message on the screen
        // then onRestart is invoked
        val toast = Toast.makeText(applicationContext, "onRestart Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        // It will show a message on the screen
        // then onResume is invoked
        val toast = Toast.makeText(applicationContext, "onResume Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        // It will show a message on the screen
        // then onPause is invoked
        val toast = Toast.makeText(applicationContext, "onPause Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        // It will show a message on the screen
        // then onStop is invoked
        val toast = Toast.makeText(applicationContext, "onStop Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        // It will show a message on the screen
        // then onDestroy is invoked
        val toast = Toast.makeText(applicationContext, "onDestroy Metodu çağrıldı", Toast.LENGTH_LONG).show()
    }
}