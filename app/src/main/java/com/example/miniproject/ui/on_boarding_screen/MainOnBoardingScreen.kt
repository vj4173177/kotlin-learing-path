package com.example.miniproject.ui.on_boarding_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.miniproject.R
import me.relex.circleindicator.CircleIndicator3

class MainOnBoardingScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_on_boarding_screen, container, false)

        val viewpagerVar : ViewPager2 = view.findViewById(R.id.OnBoardingScreenViewPager)
        var onBoardingScreenDataVar= listOf<onBoardingScreenData>(
            onBoardingScreenData("Your Personalized Makeup Guide 1", R.drawable.baseline_edit_24),
            onBoardingScreenData("Your Personalized Makeup Guide 2", R.drawable.baseline_settings_24)
            ,onBoardingScreenData("Your Personalized Makeup Guide 3", R.drawable.baseline_edit_24))

        val viewpager2Adapter=ViewPager2AdapterOnBoarding(childFragmentManager,onBoardingScreenDataVar)

        viewpagerVar.adapter=viewpager2Adapter
        val indicator = view.findViewById<CircleIndicator3>(R.id.CircularIndicator)
        indicator.setViewPager(viewpagerVar)
        val buttonForSwipe = view.findViewById<Button>(R.id.OnBoardingScreenButton)
        buttonForSwipe.setOnClickListener {

          //  view.findNavController().navigate(R.id.action_mainOnBoardingScreen_to_login2)
            Navigation.findNavController(view).navigate(R.id.action_mainOnBoardingScreen_to_login2)

//            viewpagerVar.beginFakeDrag()
//            viewpagerVar.fakeDragBy(-10f)
//            viewpagerVar.endFakeDrag()

        }











        return view
    }
}