package com.example.torchb3arer.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.torchb3arer.coderswag.Adapters.CategoryAdapter
import com.example.torchb3arer.coderswag.Adapters.CategoryRecycleAdapter
import com.example.torchb3arer.coderswag.Model.Category
import com.example.torchb3arer.coderswag.R
import com.example.torchb3arer.coderswag.Services.DataService
import com.example.torchb3arer.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter : ArrayAdapter <Category>
    //lateinit var adapter : CategoryAdapter
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Adapter generico
        //adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.categories)
        //categoryListView.adapter = adapter
        //adapter = CategoryAdapter(this,DataService.categories)
        //categoryListView.adapter = adapter

        //adapter = CategoryRecycleAdapter(this,DataService.categories)
        adapter = CategoryRecycleAdapter(this,DataService.categories){
            category->println(category.title)
            val productIntent = Intent(this,ProductActivity::class.java)
            startActivity(productIntent)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)

        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        //Si no cambian dinamicamente
        categoryListView.setHasFixedSize(true)



    }
}
