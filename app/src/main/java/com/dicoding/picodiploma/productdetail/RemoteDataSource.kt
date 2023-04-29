package com.dicoding.picodiploma.productdetail

import android.content.Context

class RemoteDataSource(private val context: Context) {
    fun getDetailProduct(): ProductModel {
        return ProductModel(
            name = context.getString(R.string.nama_produk),
            store = context.getString(R.string.store),
            size = context.getString(R.string.size),
            color = context.getString(R.string.color),
            desc = context.getString(R.string.description),
            image = R.drawable.shoes,
            date = context.getString(R.string.date),
            rating = context.getString(R.string.ratting),
            price = context.getString(R.string.harga),
            countRating = context.getString(R.string.countRating)
        )
    }

}