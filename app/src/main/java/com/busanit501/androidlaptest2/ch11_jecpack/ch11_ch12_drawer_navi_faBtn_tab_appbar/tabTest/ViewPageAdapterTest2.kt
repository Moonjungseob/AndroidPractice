package com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar.tabTest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapterTest2(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    //각 프래그먼트들을 담을 리스트
    var testFragment : List<Fragment>

    init {
        testFragment = listOf(TabTest1Fragment(), TabTest2Fragment(), TabTest3Fragment(),TabTest4Fragment())
    }

    override fun getItemCount(): Int {
        return testFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        val returnFragment : Fragment = testFragment[position]
        return returnFragment
    }

}