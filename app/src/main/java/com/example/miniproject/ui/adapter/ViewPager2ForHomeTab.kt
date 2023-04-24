package com.example.miniproject.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.miniproject.ui.Screens.HomeTab
import com.example.miniproject.ui.Screens.Settings

class ViewPager2ForHomeTab (fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return  3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0->HomeTab()
            1->Settings()
            3->HomeTab()
            else->Fragment()
        }
    }

}