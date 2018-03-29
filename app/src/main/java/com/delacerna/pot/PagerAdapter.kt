package com.delacerna.pot

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by Harold on 3/10/2018.
 */

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    var mFm = fm
    var mFragmentItems: ArrayList<Fragment> = ArrayList()
    var mFragmentTitles: ArrayList<String> = ArrayList()

    fun addFragments(fragmentItem: Fragment,fragmentTitle: String ){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }


    override fun getItem(position: Int): Fragment {
            return  mFragmentItems[position]
    }

    override fun getCount(): Int {
       return mFragmentItems.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitles[position]
    }


}