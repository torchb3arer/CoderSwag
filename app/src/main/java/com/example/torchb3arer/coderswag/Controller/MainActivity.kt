package com.example.torchb3arer.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.torchb3arer.coderswag.Adapters.CategoryAdapter
import com.example.torchb3arer.coderswag.Model.Category
import com.example.torchb3arer.coderswag.R
import com.example.torchb3arer.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter : ArrayAdapter <Category>
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Adapter generico
        //adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.categories)
        //categoryListView.adapter = adapter

        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter
    }
}
