package com.example.orderfoods.homepartui.ui.about

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {
    private lateinit var binding: FragmentAboutBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAboutBinding.bind(view)


    }
}