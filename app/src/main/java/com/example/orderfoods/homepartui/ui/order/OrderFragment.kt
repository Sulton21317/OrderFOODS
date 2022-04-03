package com.example.orderfoods.homepartui.ui.order

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentOrderBinding
import com.example.orderfoods.homepartui.api.model.Item
import com.example.orderfoods.homepartui.ui.home.adapter.CategoryAdapter
import java.util.ArrayList

class OrderFragment : Fragment(R.layout.fragment_order) {
    private lateinit var binding: FragmentOrderBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOrderBinding.bind(view)
        binding.orderRecycList.apply {
            val linearLayoutManager = LinearLayoutManager(requireActivity())
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            layoutManager = linearLayoutManager
            setHasFixedSize(true)
            adapter = OrderAdapter(loadListData())

        }

    }

    private fun loadListData(): ArrayList<Item> {
        val list = ArrayList<Item>()
        list.add(Item("Buyurtma", "1", "url", "\$10"))
        list.add(Item("Buyurtma", "1", "url", "\$24"))
        list.add(Item("Buyurtma", "1", "url", "\$40"))
        list.add(Item("Buyurtma", "1", "url", "\$9"))
        list.add(Item("Buyurtma", "1", "url", "\$16"))
        list.add(Item("Buyurtma", "1", "url", "\$14"))
        list.add(Item("Buyurtma", "1", "url", "\$17"))
        list.add(Item("Buyurtma", "1", "url", "\$18"))
        list.add(Item("Buyurtma", "1", "url", "\$30"))
        return list
    }


}