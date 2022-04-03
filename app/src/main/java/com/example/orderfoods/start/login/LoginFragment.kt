package com.example.orderfoods.start.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentLoginBinding
import com.example.orderfoods.homepartui.HomeActivity

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar!!.hide()
        val binding = FragmentLoginBinding.bind(view)

        binding.loginBackBtn.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.logLoginBtn.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

    }
}