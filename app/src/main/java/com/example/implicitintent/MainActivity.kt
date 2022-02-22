package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var edturl:EditText=findViewById(R.id.edturl)
        var edtcall:EditText=findViewById(R.id.edtcall)
        var edtmap:EditText=findViewById(R.id.edtmap)


        var btnurl:Button=findViewById(R.id.btnurl)
        var btncall:Button=findViewById(R.id.btncall)
        var btnmap:Button=findViewById(R.id.btnmap)


        btnurl.setOnClickListener {
            var intent=Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(edturl.text.toString()))
            startActivity(intent)

        }

        btncall.setOnClickListener{

            var intent=Intent()
            intent.setAction(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:"+edtcall.text.toString()))
            startActivity(intent)


        }

        btnmap.setOnClickListener {

            var intent=Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("geo:0,0?q="+edtmap.text.toString()))
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.firstmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        

        return super.onOptionsItemSelected(item)


    }
}