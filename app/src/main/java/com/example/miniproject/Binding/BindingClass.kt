package com.example.miniproject.Binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.miniproject.R
import com.example.miniproject.databinding.FragmentBindingClassBinding

class BindingClass : Fragment() {
    lateinit var binding: FragmentBindingClassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_binding_class, container, false)
binding.textView123.text="Abc"
        return binding.root
    }

}