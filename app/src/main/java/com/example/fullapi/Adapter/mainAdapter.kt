package com.example.fullapi.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fullapi.Model.barang
import com.example.fullapi.databinding.ListItemBinding


class mainAdapter(val barang:MutableList<barang>):RecyclerView.Adapter<mainAdapter.barangViewHolder>() {

    inner class barangViewHolder(val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): barangViewHolder {
      return barangViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: barangViewHolder, position: Int) {
       holder.binding.apply {
           Tvnama.text = barang[position].nama
       }
    }

    override fun getItemCount(): Int=barang.size

}