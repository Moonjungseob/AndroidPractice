package com.busanit501.androidlaptest2.ch18_network.retrofit


import com.busanit501.androidlaptest2.ch18_network.model.publicModel2.AnimalListModel
import retrofit2.http.GET
import retrofit2.http.Query

// 통신 라이브러리 : retrofit2 이용해서,
// 인터페이스, 추상 메서드를 만들어서,
// 레트로핏한테 전달 : 인터페이스 통으로 전달하면,
// 여기에 정의된 함수를 이용해서, 통신을 함. crud.
interface INetworkService5 {

    @GET("BusanPetAnimalInfoService/getPetAnimalInfo")
    fun getList2(
        @Query("serviceKey") serviceKey: String?,
        @Query("pageNo") pageNo: Int,
        @Query("numOfRows") numOfRows: Int,
        @Query("resultType") resultType : String
    ): retrofit2.Call<AnimalListModel>


}