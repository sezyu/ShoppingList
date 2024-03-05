package com.example.shoppinglist.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shoppinglist.domain.ShopItem


@Entity(tableName = "shop_items")
data class ShopItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val count: Int,
    var isActive: Boolean,

) {
}