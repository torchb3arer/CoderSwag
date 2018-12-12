package com.example.torchb3arer.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.torchb3arer.coderswag.Model.Category
import com.example.torchb3arer.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter(){

    val context = context
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View

        val holder : ViewHolder

        //Si se lanza por primera vez
        if (convertView ==null){
            println("Se crea por primera vez")
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage  = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName  = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        }
        else {
            println("Recicla la vista")
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        //Cada vez que cargue la visa va a hacer esto, lo que es costoso en termino de memoria
        /*categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
        */
        val category = categories[position]

        //Obtiene la ID de la imagen,
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        //categoryImage.setImageResource(resourceId)
        holder.categoryImage?.setImageResource(resourceId)
        //categoryName.text = category.title
        holder.categoryName?.text = category.title
        return categoryView

        //-----------------------------------------------------------------------------
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }

}