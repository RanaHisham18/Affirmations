package com.rana.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rana.affirmations.R
import com.rana.affirmations.model.Affirmation


class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //create new items
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // TODO("Not yet implemented")
        //new view
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    //replace the items
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //return the size of the dataset
    override fun getItemCount(): Int {
        // TODO("Not yet implemented")
        return dataset.size
    }
}

