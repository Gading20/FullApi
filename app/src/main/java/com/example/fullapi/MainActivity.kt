package com.example.fullapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fullapi.Adapter.mainAdapter
import com.example.fullapi.Model.ListResponse
import com.example.fullapi.Model.barang
import com.example.fullapi.WebService.APIService
import com.example.fullapi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var mainAdapter: mainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    private  fun showRecycler (){

    }

    private fun getData(){
        APIService.ApiEndPoint().getData().enqueue(object : Callback<ListResponse<barang>>{
            override fun onResponse(
                call: Call<ListResponse<barang>>,
                response: Response<ListResponse<barang>>
            ) {

            }

            override fun onFailure(call: Call<ListResponse<barang>>, t: Throwable) {
                
            }

        }
    }
}