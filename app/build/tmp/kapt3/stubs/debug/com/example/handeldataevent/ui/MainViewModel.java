package com.example.handeldataevent.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R%\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/handeldataevent/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repositories", "Lcom/example/handeldataevent/repositries/MainRepositories;", "(Lcom/example/handeldataevent/repositries/MainRepositories;)V", "data", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/handeldataevent/utlis/ApiResponse;", "", "Lcom/example/handeldataevent/data/remote/Posts;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.handeldataevent.repositries.MainRepositories repositories = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.handeldataevent.utlis.ApiResponse<java.util.List<com.example.handeldataevent.data.remote.Posts>>> data = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.handeldataevent.repositries.MainRepositories repositories) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.handeldataevent.utlis.ApiResponse<java.util.List<com.example.handeldataevent.data.remote.Posts>>> getData() {
        return null;
    }
}