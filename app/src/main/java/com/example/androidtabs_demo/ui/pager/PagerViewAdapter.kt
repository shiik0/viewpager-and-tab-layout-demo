package com.example.androidtabs_demo.ui.pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtabs_demo.R
import kotlinx.android.synthetic.main.pager_item_view.view.*

class PagerViewAdapter( val images: List<Int>): RecyclerView.Adapter<PagerViewAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pager_item_view, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = images[position]
        holder.itemView.gallery_image.setImageResource(currentImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}