package com.example.miniproject.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.miniproject.R
import com.example.miniproject.Repository.QuotesRepository
import com.example.miniproject.RetrofitHelper
import com.example.miniproject.api.QuotesInterFacèRepository
import com.example.miniproject.viewModel.MainViewModel
import com.example.miniproject.viewModel.MainViewModelFactory
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var quoteService=RetrofitHelper.getInstance().create(QuotesInterFacèRepository::class.java)
        val repository=QuotesRepository(quoteService)
        mainViewModel=ViewModelProvider(this,MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.quotes.observe(this,Observer{
            Log.d("Actual Data",it.results.toString())

        })

    }


}