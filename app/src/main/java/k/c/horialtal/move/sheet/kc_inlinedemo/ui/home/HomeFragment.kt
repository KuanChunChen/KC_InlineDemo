/**
 * Created by Elegant Access's KC on 11/4/20 12:12 PM.
 * Copyright (c) 2020 All rights reserved.
 * Your support is my biggest motivation , please follow my Instagram  : https://www.instagram.com/eleg.aces.kc/
 * See more project on github : https://github.com/KuanChunChen
 * See tutorial on my site : https://medium.com/@elegant-access-kc
 */

package k.c.horialtal.move.sheet.kc_inlinedemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import k.c.horialtal.move.sheet.kc_inlinedemo.InlineUtil
import k.c.horialtal.move.sheet.kc_inlinedemo.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity?)!!.supportActionBar?.show()
        initView()

    }


    private fun initView(){

        val inlineUtil = InlineUtil()


        inlineUtil.getMinutes1(hours = 3)
        inlineUtil.getMinutes2(hours = 3)
        inlineUtil.getMinutes3(hours = 3, lambda = { println(it) })

        inlineUtil.getMinutes4(hours = 3, lambda = { println(it) })

        inlineUtil.getMinutes5(hours = 3,
            lambda1 = { println(it) },
            lambda2 = { println(it) },
            lambda3 = { println(it) }
        )






    }
}