package com.delacerna.pot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtcreateAccount.setOnClickListener {
            var intent = Intent(this@MainActivity,ChooseUser::class.java)
            startActivity(intent)
        }
        btnLogMeIn.setOnClickListener {
            var intentLogIn = Intent(this@MainActivity,MyProjects::class.java)
            startActivity(intentLogIn)
        }

    }
}
