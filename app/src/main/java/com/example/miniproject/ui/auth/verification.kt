package com.example.miniproject.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.miniproject.R


class verification : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_verification, container, false)
        val mainButton = view.findViewById<Button>(R.id.VerifyButton)
        // Inflate the layout for this fragment
        mainButton.setOnClickListener {
                view:View->
            Navigation.findNavController(view).navigate(R.id.action_verification_to_mainHomePage)
        }
        return view.rootView
    }


}