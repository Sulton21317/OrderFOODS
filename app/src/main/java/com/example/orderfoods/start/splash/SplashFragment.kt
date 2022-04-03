package com.example.orderfoods.start.splash

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar!!.hide()
        val binding = FragmentSplashBinding.bind(view)
        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }
        binding.registrationBtn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_registrationFragment)
        }

    }

}