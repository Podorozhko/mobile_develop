package com.example.test_samples

class Cart (val products: List<Product> = emptyList()) {
    fun calcTotal() = products.map {product -> product.calcDiscountPrice()}.sum()
}