package com.example.handeldataevent.repositries

import com.example.handeldataevent.data.remote.network.ApiPostsService
import com.example.handeldataevent.helpers.result
import javax.inject.Inject

class MainRepositories @Inject constructor(private val postsService: ApiPostsService){


     fun getPosts()= result {
        postsService.getPosts()
    }

}