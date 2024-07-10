package com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlaptest2.databinding.FragmentTest2Binding

class Test2Fragment : Fragment() {
    lateinit var binding: FragmentTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTest2Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTest2Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
}