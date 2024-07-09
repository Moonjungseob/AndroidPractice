package com.busanit501.androidlaptest2.ch11_jecpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlaptest2.databinding.FragmentCh11TwoBinding

class Ch11TwoFragment : Fragment() {


    // 순서2, 프래그먼트 만들기. 뼈대 샘플 코딩 많이 지움.

    lateinit var binding: FragmentCh11TwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCh11TwoBinding.inflate(layoutInflater,container,false)

//        return inflater.inflate(R.layout.fragment_ch11_one, container, false)
        return binding.root
    }


}