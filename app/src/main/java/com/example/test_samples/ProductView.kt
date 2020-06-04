package com.example.test_samples

interface ProductView {
    fun print(price: Double)
    fun print(product: Product)
    fun print(cart: Cart)
    fun print(name: String)
}