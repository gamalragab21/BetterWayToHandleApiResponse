package com.example.handeldataevent.ui

import androidx.lifecycle.ViewModel
import com.example.handeldataevent.repositries.MainRepositories
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
    @Inject constructor(private val repositories: MainRepositories):ViewModel() {

        val data=repositories.getPosts()
}