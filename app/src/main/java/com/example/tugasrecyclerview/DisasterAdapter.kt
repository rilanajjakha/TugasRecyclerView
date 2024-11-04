package com.example.tugasrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecyclerview.databinding.ItemDisasterBinding

class DisasterAdapter(private val images: List<Int>) : RecyclerView.Adapter<DisasterAdapter.DisasterViewHolder>() {

    inner class DisasterViewHolder(val binding: ItemDisasterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DisasterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DisasterViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(images[position])
    }

    override fun getItemCount() = images.size
}
