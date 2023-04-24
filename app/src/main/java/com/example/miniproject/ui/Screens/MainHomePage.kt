package com.example.miniproject.ui.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.miniproject.R
import com.example.miniproject.ui.adapter.ViewPager2ForHomeTab
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainHomePage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =inflater.inflate(R.layout.fragment_main_home_page, container, false)

        var tabLayout=view.findViewById<TabLayout>(R.id.tabViewBar)
        var viewPager2=view.findViewById<ViewPager2>(R.id.HomePageTabBarLayout)

        val adapter= ViewPager2ForHomeTab(requireActivity().supportFragmentManager,lifecycle)

        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager2){tab,position->  when(position){
            0->tab.text="First"
            1->tab.text="Second"
            2->tab.text="Third"
        } }.attach()








        return view
    }


}