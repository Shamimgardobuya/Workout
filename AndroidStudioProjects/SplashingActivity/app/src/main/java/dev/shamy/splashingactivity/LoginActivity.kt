package dev.shamy.splashingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword1:TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin=findViewById(R.id.btnLogin)
        tilEmail=findViewById(R.id.tilEmail)
        tilPassword1=findViewById(R.id.tilPass1word)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)

        btnLogin.setOnClickListener {
//            val intent=Int
            validateLogin()
        }


//        val intent=Intent(this,LoginActivity::class.java)
//        startActivity(intent)
//        finish()
    }
    fun validateLogin(){
        var email=etEmail.text.toString()
        var password=etPassword.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is required"     //getString


        }
        if(password.isBlank()){
            tilPassword1.error="Password is required"
        }
    }
}