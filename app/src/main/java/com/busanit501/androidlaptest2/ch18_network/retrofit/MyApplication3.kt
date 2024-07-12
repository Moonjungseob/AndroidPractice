package com.busanit501.androidlaptest2.ch18_network.retrofit

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// 자주 사용이 될 네트워크 인터페이스를 , 미리 시스템에 등록.
// 메니페스트에 등록해서,
// 앱이 실행이 되면, 해당 MyApplication 의 기능이
// 메모리 등록이 되어서 사용하기 편함.
class MyApplication3 : Application(){


        val BASE_URL = "https://apis.data.go.kr/6260000/"

        val BASE_URL2 = "https://newsapi.org"



        //add....................................
        var networkService: INetworkService3

        var networkService2: INetworkService2

        val retrofit: Retrofit
            get() = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val retrofit2: Retrofit
        get() = Retrofit.Builder()
            .baseUrl(BASE_URL2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        init {
            networkService = retrofit.create(INetworkService3::class.java)
            networkService2 = retrofit2.create(INetworkService2::class.java)
        }


}