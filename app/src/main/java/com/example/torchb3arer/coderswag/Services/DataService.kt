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
            Product("Devslopes Graphic Beanie", "$18","hat01"),
            Product("Devslopes Hat Black", "$20","hat02"),
            Product("Devslopes Graphic White", "$18","hat03"),
            Product("Devslopes Graphic Snapback", "$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","%28","hoodie01"),
            Product("Devslopes Hoodie Red","%25","hoodie02"),
            Product("Devslopes Hoodie Green","%26","hoodie03"),
            Product("Devslopes Hoodie Used","%12","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","%18","shirt01"),
            Product("Devslopes Badge Light Grey","%15","shirt02"),
            Product("Devslopes Logo Shirt Red","%12","shirt03"),
            Product("Devslopes Hustle","%15","shirt04"),
            Product("Kickflip Studios","%18","shirt05")

            )
}