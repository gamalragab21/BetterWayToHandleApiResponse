package com.example.handeldataevent.data.remote

import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("id")
    val id:Int,
    @SerializedName("title")
    val title:String
)
