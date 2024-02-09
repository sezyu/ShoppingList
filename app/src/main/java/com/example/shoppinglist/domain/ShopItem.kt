package com.example.shoppinglist.domain

data class ShopItem(
    var name: String,
    val id: Int,
    var count: Int,
    var isActive: Boolean
) {
}