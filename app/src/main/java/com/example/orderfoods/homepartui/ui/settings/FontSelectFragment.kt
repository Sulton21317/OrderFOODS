package com.example.orderfoods.homepartui.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.orderfoods.R
import com.google.android.material.button.MaterialButton

class FontSelectFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var rootView: View = inflater.inflate(R.layout.fragment_select_font, container, false)
        var dissmisBtn = rootView.findViewById<MaterialButton>(R.id.dismiss_btn_font)
        dissmisBtn.setOnClickListener { dismiss() }


        return rootView
    }
    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, height)
    }
}
