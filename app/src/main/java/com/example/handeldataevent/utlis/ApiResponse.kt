package com.example.handeldataevent.utlis

import java.util.*

sealed class ApiResponse<out T> {

    data class Success<out R>(val date:R):ApiResponse<R>()

    data class Failure(val msg:String):ApiResponse<Nothing>()

    object Loading:ApiResponse<Nothing>()

}