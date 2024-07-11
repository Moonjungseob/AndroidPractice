package com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar.tabTest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlaptest2.R
import com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar.ItemData
import com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar.MyAdapter3
import com.busanit501.androidlaptest2.databinding.FragmentTabTest1Binding
import com.busanit501.androidlaptest2.databinding.FragmentTest1Binding


class TabTest1Fragment : Fragment() {
        lateinit var binding: FragmentTabTest1Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = FragmentTabTest1Binding.inflate(layoutInflater)
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentTabTest1Binding.inflate(layoutInflater,container,false)

            return binding.root
        }

    }