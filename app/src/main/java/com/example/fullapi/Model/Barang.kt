package com.example.fullapi.Model

import android.security.identity.AccessControlProfileId

data class barang(
    var id : Int,
    var nama : String,
    var kode : Int,
    var createdAt : String,
    var updatedAt : String
        )

data class ListResponse<T>(
    var msg : String,
    var status : Int,
    var data : MutableList<T>

)

data class  SingleResponse<T>(
    var msg: String,
    var status: Int,
    var data : T
)