package com.example.orderfoods.homepartui.ui.order

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfoods.databinding.FoodOrderItemBinding
import com.example.orderfoods.homepartui.api.model.CategoryItem
import com.example.orderfoods.homepartui.api.model.Item

class OrderAdapter(private val categoryList: ArrayList<Item>) :
    RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    inner class OrderViewHolder(val binding: FoodOrderItemBinding, val parent: ViewGroup) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Item) {
            binding.orderFoodName.text = data.foodname
            binding.orderFoodPrice.text = data.summa

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder =
        OrderViewHolder(
            FoodOrderItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), parent
        )

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int = categoryList.size
}