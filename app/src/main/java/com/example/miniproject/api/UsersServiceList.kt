package com.example.miniproject.api

import com.example.miniproject.models.ApiClass
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesInterFacèRepository {

     @GET("/quotes")
     suspend fun getQuotes(@Query("page") page:Int):Response<ApiClass>
     //baseurl + "/quotes" +?page=1


}