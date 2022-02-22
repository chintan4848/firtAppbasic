package com.example.implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var uname:TextInputEditText=findViewById(R.id.edtusernme)

        var upass:TextInputEditText=findViewById(R.id.edtpass)

        var btnlogin:Button=findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener {
            var username=uname.text.toString()
            var password=upass.text.toString()

            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
            {
                Toast.makeText(this, "Please enter username/password", Toast.LENGTH_SHORT).show()

            }
            else
            {
                if(username=="admin" && password=="admin")
                {
                    Toast.makeText(this, "successfull login", Toast.LENGTH_SHORT).show()
                    var intent:Intent=Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Invalid username/password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}