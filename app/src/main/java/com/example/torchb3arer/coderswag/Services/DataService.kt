package com.example.torchb3arer.coderswag.Services

import com.example.torchb3arer.coderswag.Model.Category
import com.example.torchb3arer.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18","hat1"),
            Product("Devslopes Hat Black", "$20","hat2"),
            Product("Devslopes Graphic White", "$18","hat3"),
            Product("Devslopes Graphic Snapback", "$22","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","%28","hoodie1"),
            Product("Devslopes Hoodie Red","%25","hoodie2"),
            Product("Devslopes Hoodie Green","%26","hoodie3"),
            Product("Devslopes Hoodie Used","%12","hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","%18","shirt1"),
            Product("Devslopes Badge Light Grey","%15","shirt2"),
            Product("Devslopes Logo Shirt Red","%12","shirt3"),
            Product("Devslopes Hustle","%15","shirt4"),
            Product("Kickflip Studios","%18","shirt5")

            )

    val digitalGood = listOf<Product>()

    fun getProducts (category: String) : List<Product>{
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            //"DIGITAL" -> return digitalGood
            else -> digitalGood
        }
    }
}