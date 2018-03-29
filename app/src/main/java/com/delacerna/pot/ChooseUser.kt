package com.delacerna.pot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_user.*

class ChooseUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_user)


        btnCompany.setOnClickListener {
            var intent = Intent(applicationContext, CreateAccount::class.java)
            startActivity(intent)
        }
    }
}
