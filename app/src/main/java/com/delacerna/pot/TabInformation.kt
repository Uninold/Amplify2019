package com.delacerna.pot

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_tab_information.*


@Suppress("UNREACHABLE_CODE")
class TabInformation : Fragment() {

    internal var name = arrayOf("one","two","three")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_tab_information, container, false)

        spinner.adapter = ArrayAdapter(context,android.R.layout.simple_spinner_dropdown_item, name)



    }



}// Required empty public constructor
