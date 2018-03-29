package com.delacerna.pot

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*



class CreateAccount : AppCompatActivity() {

    lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        pagerAdapter = PagerAdapter(supportFragmentManager)

        pagerAdapter!!.addFragments(TabInformation(),"Information")
        pagerAdapter!!.addFragments(TabAccount(),"Account")

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)



    }
}
