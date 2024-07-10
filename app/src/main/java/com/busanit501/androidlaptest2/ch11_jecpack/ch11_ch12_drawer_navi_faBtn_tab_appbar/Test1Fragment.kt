package com.busanit501.androidlaptest2.ch11_jecpack.ch11_ch12_drawer_navi_faBtn_tab_appbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlaptest2.databinding.FragmentTest1Binding


class Test1Fragment : Fragment() {
    lateinit var binding: FragmentTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTest1Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTest1Binding.inflate(layoutInflater,container,false)
        // 이 데이터 들은 , 외부에서, 레트로핏 , 통신 라이브러리 이용해서, 데이터 받아와야함.
        val itemList = mutableListOf<ItemData>()
        val itemData1 = ItemData()
        itemData1.email = "lsy1"
        itemData1.img1 ="https://firebasestorage.googleapis.com/v0/b/androidtest-8f15c.appspot.com/o/AndroidImageShareApp%2FtTg1U5EwUn7qQChOcg8X.jpg?alt=media&token=25f69100-c24c-4e71-9f4a-b5747101bd02"
        itemData1.img2 = "https://firebasestorage.googleapis.com/v0/b/androidtest-8f15c.appspot.com/o/AndroidImageShareApp%2FrT5IN9mcaYEAd4EFdX34.jpg?alt=media&token=dec45894-9cd1-423a-9ee4-dcf9eeefe726"

        val itemData2 = ItemData()
        itemData2.email = "lsy2"
        itemData2.img1 = "https://firebasestorage.googleapis.com/v0/b/androidtest-8f15c.appspot.com/o/AndroidImageShareApp%2FojKcLdTEZ9fvYYUBE5Mz.jpg?alt=media&token=e2b4a543-856e-4cf3-affe-749340d37f4a"
        itemData2.img2 = "https://firebasestorage.googleapis.com/v0/b/androidtest-8f15c.appspot.com/o/AndroidImageShareApp%2FTk9apemhBHWs9xZqXL2g.jpg?alt=media&token=3f0dd1c3-875e-4462-90f6-334f599047d4"

        itemList.add(itemData1)
        itemList.add(itemData2)

//        리사이클러뷰 붙이기
        binding.tabRecyclerTest1.adapter = context?.let { MyAdapter3(it,itemList) }
        binding.tabRecyclerTest1.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

}