package com.example.miniproject.ui.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.viewpager2.widget.ViewPager2
import com.example.miniproject.R
import com.example.miniproject.ui.adapter.ViewPager2ForHomeTab
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeTab : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view= inflater.inflate(R.layout.fragment_home_tab, container, false)
       var button= view.findViewById<Button>(R.id.FirstFragment).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainHomePage_to_bindingClass)
        }
return view
    }


}