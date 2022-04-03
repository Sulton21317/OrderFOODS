package com.example.orderfoods.homepartui.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orderfoods.R
import com.example.orderfoods.databinding.FragmentHomeBinding
import com.example.orderfoods.homepartui.api.model.CategoryItem
import com.example.orderfoods.homepartui.api.model.Item
import com.example.orderfoods.homepartui.ui.home.adapter.CategoryAdapter


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)
        binding.categoryItemFood.apply {
            val linearLayoutManager = LinearLayoutManager(requireActivity())
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            layoutManager = linearLayoutManager
            setHasFixedSize(true)
            adapter = CategoryAdapter(loadListData())

        }

    }

    private fun loadListData(): ArrayList<CategoryItem> {
        val list = ArrayList<Item>()
        list.add(Item("FoodName", "1", "url", "\$10"))
        list.add(Item("FoodName", "1", "url", "\$24"))
        list.add(Item("FoodName", "1", "url", "\$40"))
        list.add(Item("FoodName", "1", "url", "\$9"))
        list.add(Item("FoodName", "1", "url", "\$16"))
        list.add(Item("FoodName", "1", "url", "\$14"))
        list.add(Item("FoodName", "1", "url", "\$17"))
        list.add(Item("FoodName", "1", "url", "\$18"))
        list.add(Item("FoodName", "1", "url", "\$30"))
        val ls = ArrayList<CategoryItem>()
        ls.add(CategoryItem("Ovqatlar", list))
        ls.add(CategoryItem("Mevalar", list))
        ls.add(CategoryItem("Sabzavotlar", list))
        ls.add(CategoryItem("Sut mahsulotlari", list))
        ls.add(CategoryItem("Go'sht mahsulotlari", list))
        ls.add(CategoryItem("Boshqa turdagi mahsulotlar", list))
        return ls
    }


}