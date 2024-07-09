package com.busanit501.androidlaptest2.ch11_jecpack.recyclerview.test1simple

import android.os.Bundle
import android.widget.GridLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlaptest2.R
import com.busanit501.androidlaptest2.databinding.ActivityCh11MainRecyclerView1Binding

class Ch11MainRecyclerView1MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityCh11MainRecyclerView1Binding

    //데이터 추가 및 삭제 테스트
    // 순서1
    var newDataNumber = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCh11MainRecyclerView1Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_main_recycler_view1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //샘플 더미 데이터 넣기.
        val datas = mutableListOf<String>()
        for(i in 1..10) {
            datas.add("오늘 점심 뭐먹지 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager = LinearLayoutManager(this@Ch11MainRecyclerView1MainActivity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample1.layoutManager = layoutManager

        // 어댑터 붙이기.
        binding.ch11RecyclerSample1.adapter = Ch11MyAdapterSample(datas)


        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.
        val datas2 = mutableListOf<String>()
        for(i in 1..10) {
            datas2.add("오늘 점심 뭐먹지2 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager2 = LinearLayoutManager(this@Ch11MainRecyclerView1MainActivity)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample2.layoutManager = layoutManager2

        // 어댑터 붙이기.
        binding.ch11RecyclerSample2.adapter = Ch11MyAdapterSample2(datas2)


        // 3번째 리사이클러뷰
        val datas3 = mutableListOf<String>()
        for(i in 1..10) {
            datas3.add("오늘 점심 뭐먹지2 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager3 = LinearLayoutManager(this@Ch11MainRecyclerView1MainActivity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL
        binding.ch11RecyclerSample3.layoutManager = layoutManager3

        // 어댑터 붙이기.
        binding.ch11RecyclerSample3.adapter = Ch11MyAdapterSample3(datas3)


        //4번째 리사이클러뷰 ,
        //데이터 추가 및 삭제 테스트
        //순서2
        // 더미 데이터 만들기.
        val testDataSet = mutableListOf<String>()
        for (i in 0..10){
            testDataSet.add("오늘 점심 ? 설렁탕 $i")
        }

        // 3번째 리사이클러뷰 재사용. 어댑터 , 뷰홀더 , 목록의요소도 재사용
        val layoutManager4 = LinearLayoutManager(this@Ch11MainRecyclerView1MainActivity)
        layoutManager4.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample4.layoutManager = layoutManager4

        // 어댑터 붙이기.
        val customAdapter = Ch11MyAdapterSample3(testDataSet)
        binding.ch11RecyclerSample4.adapter = customAdapter

        // 버튼에 이벤트 핸들러 추가해서, 추가, 삭제 기능 구현.
        binding.ch11recyclerDataAddBtn.setOnClickListener {
            testDataSet.add("내일 점심 뭐 먹지" + newDataNumber++)
            // 추가할 때, notifyDataSetChanged -> notifyItemInserted
            customAdapter.notifyItemInserted(testDataSet.size)
        }

        binding.ch11recyclerDataRemoveBtn.setOnClickListener {
//            testDataSet.removeAt(testDataSet.size - 1)
            // 삭제할 때, notifyItemRemoved 이용해서 작업.
//            customAdapter.notifyDataSetChanged()

            val position = testDataSet.size - 1
            if(position >= 0) {
                customAdapter.removeItem(position)
            }
        }

        // 5번째 리사이클러뷰
        // 3번째 리사이클러뷰 재사용. 어댑터 , 뷰홀더 , 목록의요소도 재사용
        val layoutManager5 = GridLayoutManager(this@Ch11MainRecyclerView1MainActivity
            ,2, GridLayoutManager.VERTICAL,false)
        binding.ch11RecyclerSample5.layoutManager = layoutManager5

        // 어댑터 붙이기.
        val customAdapter2 = Ch11MyAdapterSample4(datas3)
        binding.ch11RecyclerSample5.adapter = customAdapter2


    } //onCreate
}