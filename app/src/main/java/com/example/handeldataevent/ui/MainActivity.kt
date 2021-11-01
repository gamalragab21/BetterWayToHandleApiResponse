package com.example.handeldataevent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.handeldataevent.R
import com.example.handeldataevent.utlis.ApiResponse
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private  val TAG = "HandleDataEvent"

    val mainViewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPosts();
    }

    private fun getPosts() {
        lifecycleScope.launchWhenStarted {
            mainViewModel.data.collect {
                when(it){
                    is ApiResponse.Success ->{
                        Log.i(TAG, "getPosts: ${it.date.toString()}")
                       ploating.isVisible=false
                        tv_status.text="Success"
                        tv_data.text=it.date.toString()
                    }
                    is ApiResponse.Loading ->{
                        ploating.isVisible=true
                        tv_status.text="Loading"

                    }
                     is ApiResponse.Failure ->{
                         ploating.isVisible=false
                         tv_status.text="Failure"
                         tv_data.text=it.msg


                     }
                }
            }
        }
    }

}