package com.example.test_samples

class Cart (val products: List<Product> = emptyList()) {
    fun getDiscountSum() = products.map {product -> product.getDiscountPrice()}.sum()
    fun getFullSum() = products.map {product -> product.getPrice()}.sum()
}