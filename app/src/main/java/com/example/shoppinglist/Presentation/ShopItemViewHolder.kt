package com.example.shoppinglist.Presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.R

class ShopItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvName: TextView = view.findViewById(R.id.nameTextView)
    val tvCount: TextView = view.findViewById(R.id.countTextView)
}