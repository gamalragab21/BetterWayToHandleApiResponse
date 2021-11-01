package com.example.handeldataevent.data.remote.network

import com.example.handeldataevent.data.remote.Posts
import retrofit2.Response
import retrofit2.http.GET

interface ApiPostsService {

    @GET("posts")
    suspend fun getPosts():Response<List<Posts>>

}