package com.example.test_samples

import com.example.test_samples.model.Cart
import com.example.test_samples.model.Product
import kotlin.math.truncate

class ConsolePricePrinter: PricePrinter {
    override fun print(product: Product) {
        val price = product.discountPrice
        if (truncate(price) == price) {
            println("%.0fP".format(price))
        }
        else {
            println("%.2fP".format(price))
        }
    }

    override fun print(cart: Cart) {
        cart.products.forEach(this::print)
        val totalCartSum = cart.discountSum
        val strPrice: String
        strPrice = if (truncate(totalCartSum) == totalCartSum) {
            "%.0fP".format(totalCartSum)
        } else {
            "%.2fP".format(totalCartSum)
        }
        println("Сумма покупок с учетом скидок: $strPrice")
    }

    override fun print(name: String) {
        println(name)
    }
}