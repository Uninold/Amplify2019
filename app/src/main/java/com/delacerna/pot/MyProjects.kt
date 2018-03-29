package com.delacerna.pot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_projects.*

class MyProjects : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_projects)

        bottomNavView.disableShiftMode(bottomNavigation)

        imgAddProduct.setOnClickListener {
            val intent = Intent(applicationContext,AddProductActivity::class.java)
            startActivity(intent)
        }

    }

}
