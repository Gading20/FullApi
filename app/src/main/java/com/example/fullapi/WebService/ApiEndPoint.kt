package com.example.fullapi.WebService

import com.example.fullapi.Model.ListResponse
import com.example.fullapi.Model.SingleResponse
import com.example.fullapi.Model.barang
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiEndPoint {

    @GET("barang")
    fun getData() : Call<ListResponse<barang>>

    @GET("barang/{id}")
    fun getDataById(@Path("id")id:Int):Call<ListResponse<barang>>

    @POST("barang")
    fun PostData(@Field("nama")nama:String,
                 @Field("kode")kode:Int,
                @Field("id")id: Int,
                @Field("createdAt")createdAt:String,
                @Field("updatedAt")updatedAt:String):Call<ListResponse<barang>>
}