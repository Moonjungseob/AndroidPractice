package com.busanit501.androidlabtest501.ch11_jetpack.fragmentSample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.busanit501.androidlaptest2.R
import com.busanit501.androidlaptest2.ch11_jecpack.fragmentSample.Ch11FragmentSampleMainActivity


class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val nextButton: Button = view.findViewById(R.id.button_next_fragment)
        val prevButton: Button = view.findViewById(R.id.button_prev_fragment)

        nextButton.setOnClickListener {
            (activity as Ch11FragmentSampleMainActivity).showNextFragment()
        }

        prevButton.setOnClickListener {
            (activity as Ch11FragmentSampleMainActivity).showPreviousFragment()
        }

        return view
    }
}