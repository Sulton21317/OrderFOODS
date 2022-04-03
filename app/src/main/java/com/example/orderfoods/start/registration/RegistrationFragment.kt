package com.example.orderfoods.start.registration

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentRegistrationBinding
import com.example.orderfoods.homepartui.HomeActivity

class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar!!.hide()
        val binding = FragmentRegistrationBinding.bind(view)
        binding.regBackBtn.setOnClickListener { findNavController().navigateUp() }
        binding.regRegistrationBtn.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

}