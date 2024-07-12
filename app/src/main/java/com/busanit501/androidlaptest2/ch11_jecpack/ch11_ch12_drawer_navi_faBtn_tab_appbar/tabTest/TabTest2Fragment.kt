package com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar.tabTest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlaptest2.databinding.FragmentTabTest2Binding


class TabTest2Fragment : Fragment() {
    lateinit var binding: FragmentTabTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTabTest2Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabTest2Binding.inflate(layoutInflater,container,false)

        return binding.root
    }

}