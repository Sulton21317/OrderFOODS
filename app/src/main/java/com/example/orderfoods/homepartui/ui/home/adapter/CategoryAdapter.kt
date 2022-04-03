package com.example.orderfoods.homepartui.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfoods.databinding.FoodCategoryItemBinding
import com.example.orderfoods.homepartui.api.model.CategoryItem

class CategoryAdapter(private val categoryList: ArrayList<CategoryItem>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder =
        CategoryViewHolder(
            FoodCategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), parent
        )

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int = categoryList.size


    inner class CategoryViewHolder(
        private val binding: FoodCategoryItemBinding,
        val parent: ViewGroup
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: CategoryItem) {
            binding.categoryName.text = data.categoryname
            val linearLayoutManager = LinearLayoutManager(parent.context)
            linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
            binding.categoryItems.apply {

                layoutManager = linearLayoutManager
                adapter = CategoryItemAdapter(data.items)

            }

        }

    }
}