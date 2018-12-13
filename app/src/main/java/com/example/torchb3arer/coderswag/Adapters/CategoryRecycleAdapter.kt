package com.example.torchb3arer.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.torchb3arer.coderswag.Model.Category
import com.example.torchb3arer.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0.bindCategory(categories[p1],context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.category_list_item, p0,false)
        return Holder(view)
    }



    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //Referenciamos a los elementos de la UI
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)

        fun bindCategory(category: Category, context: Context){
            val resorceID = context.resources.getIdentifier(category.image,
                    "drawable",context.packageName)
            categoryImage?.setImageResource(resorceID)
            categoryName?.text = category.title
        }
    }
}