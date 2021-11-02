package com.example.handeldataevent.repositries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/handeldataevent/repositries/MainRepositories;", "", "postsService", "Lcom/example/handeldataevent/data/remote/network/ApiPostsService;", "(Lcom/example/handeldataevent/data/remote/network/ApiPostsService;)V", "getPosts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/handeldataevent/utlis/ApiResponse;", "", "Lcom/example/handeldataevent/data/remote/Posts;", "app_debug"})
public final class MainRepositories {
    private final com.example.handeldataevent.data.remote.network.ApiPostsService postsService = null;
    
    @javax.inject.Inject()
    public MainRepositories(@org.jetbrains.annotations.NotNull()
    com.example.handeldataevent.data.remote.network.ApiPostsService postsService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.handeldataevent.utlis.ApiResponse<java.util.List<com.example.handeldataevent.data.remote.Posts>>> getPosts() {
        return null;
    }
}