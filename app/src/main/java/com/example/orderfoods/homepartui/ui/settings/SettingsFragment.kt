package com.example.orderfoods.homepartui.ui.settings

import android.app.Dialog
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.orderfoods.R
import com.example.orderfoods.app.InitApplication
import com.example.orderfoods.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private lateinit var binding: FragmentSettingsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        // 2

        binding.switchCompatMode.isChecked = !InitApplication.instance!!.isNightModeEnabled()

        binding.switchCompatMode.setOnClickListener {
            // 3
            val isNightTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            // 4
            when (isNightTheme) {
                Configuration.UI_MODE_NIGHT_YES -> {
                    InitApplication.instance!!.setIsNightModeEnabled(false)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                Configuration.UI_MODE_NIGHT_NO -> {
                    InitApplication.instance!!.setIsNightModeEnabled(true)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }
        }

        binding.linearLayoutLanguage.setOnClickListener {

            val dialog = LanguageSelectFragment()
            dialog.show(requireActivity().supportFragmentManager, "selectLanguage")

        }
        binding.linearLayoutFont.setOnClickListener {

            val dialog = FontSelectFragment()
            dialog.show(requireActivity().supportFragmentManager, "selectLanguage")

        }
    }
}