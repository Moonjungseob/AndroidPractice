package com.busanit501.androidlaptest2.ch18_network

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlaptest2.R
import com.busanit501.androidlaptest2.ch18_network.adpter.MyAdapterRetrofit3
import com.busanit501.androidlaptest2.ch18_network.adpter.MyAdapterRetrofit5
import com.busanit501.androidlaptest2.ch18_network.model.publicModel2.AnimalListModel
import com.busanit501.androidlaptest2.ch18_network.model.publicModel2.AnimalModel
import com.busanit501.androidlaptest2.ch18_network.retrofit.MyApplication5
import com.busanit501.androidlaptest2.databinding.ActivityAnimalMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnimalMainActivity : AppCompatActivity() {
    lateinit var binding : ActivityAnimalMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAnimalMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        restGetData(1)
//
        }//onCreate
    private fun restGetData(status : Int){
        if (status == 1) {
            val networkService = (applicationContext as MyApplication5).networkService5
            val serviceKey3 =
                "LJfLfL5OSu0luMqwtdgE42XbMlaI26c%2FkaPH%2FxYGm7QOnCo6ziluIyDAHpd0L%2B%2BlHRXjMPA%2Bts3Ord0IpKjgFQ%3D%3D"
            val resultType = "json"
            val userListCall = networkService.getList2(serviceKey3, 1, 100, resultType)
            userListCall.enqueue(object : Callback<AnimalListModel> {
                //익명 클래스가, Callback , 레트로핏2에서 제공하는 인터페이스를 구현했고,
                // 반드시 재정의해야하는 함수들이 있음.
                // 변경4
                override fun onResponse(
                    call: Call<AnimalListModel>,
                    response: Response<AnimalListModel>
                ) {
                    // 데이터를 성공적으로 받았을 때 수행되는 함수
                    val userList = response.body()?.getPetAnimalInfo?.body?.items
                    // 변경8
                    Log.d("lsy", "userList의 값 : ${userList?.item}")

                    // 데이터를 성공적으로 받았다면, 여기서 리사이클러 뷰 어댑터에 연결하면 됨.
                    // 리사이클러뷰 의 레이아웃 정하는 부분, 기본인 LinearLayoutManager 이용했고,

                    //변경6


                    val layoutManager = LinearLayoutManager(
                        this@AnimalMainActivity
                    )
                    layoutManager.orientation = LinearLayoutManager.HORIZONTAL
                    // 리사이클러뷰에 어댑터 연결
                    // 인자값은 : 현재 context : this@HttpTestReqResActivity
                    // 2번째 인자값은 : 데이터 , 네트워크 ,레트로핏2 통신으로 받아온 데이터 리스트

                    //변경7
                    binding.retrofitRecyclerView5.layoutManager = layoutManager
                    // 변경9 주의사항, 객체 안에 배열 또 있다.
                    binding.retrofitRecyclerView5.adapter =
                        MyAdapterRetrofit5(
                            this@AnimalMainActivity,
                            userList?.item
                        )

                }

                //변경5


                override fun onFailure(call: Call<AnimalListModel>, t: Throwable) {
Log.d("lsy", "데이터가 오고 있니?")
                    // 데이터를 못 받았을 때 수행되는 함수
                    call.cancel()
                }

            })

            }
        }
    } // 함수 끝