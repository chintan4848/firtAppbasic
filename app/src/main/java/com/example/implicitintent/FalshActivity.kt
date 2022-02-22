package com.example.implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class FalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_falsh)

        var fade_in=AnimationUtils.loadAnimation(this,R.anim.fade_in)

        var imglogo:ImageView=findViewById(R.id.imglogo)

        imglogo.startAnimation(fade_in)

        Handler().postDelayed({

                              var intent:Intent=Intent(applicationContext,LoginActivity::class.java)
                              startActivity(intent)
                              finish()
        },3000)
    }
}