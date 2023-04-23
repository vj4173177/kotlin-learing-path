package com.example.miniproject.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.miniproject.R

class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        val mainButton = view.findViewById<View>(R.id.ContinueButton) as Button
        // Inflate the layout for this fragment
        mainButton.setOnClickListener { view:View->
            Navigation.findNavController(view).navigate(R.id.action_login2_to_verification)}
        return view.rootView      }

}