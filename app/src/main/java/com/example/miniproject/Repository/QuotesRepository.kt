package com.example.miniproject.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.miniproject.api.QuotesInterFacèRepository
import com.example.miniproject.models.ApiClass

class QuotesRepository (private  val quoteService: QuotesInterFacèRepository){

    private  val quoteLiveData= MutableLiveData<ApiClass>()
    val quotes:LiveData<ApiClass>
    get() = quoteLiveData
    suspend fun getQuotes(page:Int){
        val result=quoteService.getQuotes(page)
        if(result.body() !=null){
            quoteLiveData.postValue(result.body())
        }
    }
}