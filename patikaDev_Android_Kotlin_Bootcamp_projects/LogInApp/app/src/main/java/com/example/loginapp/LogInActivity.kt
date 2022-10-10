package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class LogInActivity : AppCompatActivity() {


    // flag for visibility of password
    private var isVisibilityOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val ivShowHidePassword = findViewById<ImageView>(R.id.ivShowHidePassword)

        ivShowHidePassword.setOnClickListener {
            isVisibilityOn = !isVisibilityOn
            showPassword(isVisibilityOn)
        }

        showPassword(isVisibilityOn)

    }

    // Show-Hide visibility of password
    private fun showPassword(isShow: Boolean) {
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val ivShowHidePassword = findViewById<ImageView>(R.id.ivShowHidePassword)
        if(isShow) {
            // to show the password
            etPassword.transformationMethod =HideReturnsTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility_off_24)
        }else {
            // to hide the password
            etPassword.transformationMethod =PasswordTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility_24)
        }
        // put the pointer at the end of the password string
        etPassword.setSelection(etPassword.text.toString().length)
    }



    fun signUp(view: View) {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }
}