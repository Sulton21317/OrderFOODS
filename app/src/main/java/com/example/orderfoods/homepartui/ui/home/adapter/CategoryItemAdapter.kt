package com.example.orderfoods.homepartui.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfoods.databinding.FoodCategroyItemRowBinding
import com.example.orderfoods.homepartui.api.model.Item

class CategoryItemAdapter(private val categoryItemList: ArrayList<Item>) :
    RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder =
        CategoryItemViewHolder(
            FoodCategroyItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        holder.bind(categoryItemList[position])
    }

    override fun getItemCount(): Int = categoryItemList.size


    inner class CategoryItemViewHolder(
        private val binding: FoodCategroyItemRowBinding,

        ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Item) {
            binding.foodName.text = data.foodname
            binding.foodPrice.text = data.summa
            binding.sellBtn.setOnClickListener {


            }
        }
    }
}
