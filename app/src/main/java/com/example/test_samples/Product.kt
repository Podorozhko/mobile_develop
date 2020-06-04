package com.example.test_samples

class Product(
    /**
     * Must be positive
     */
    private val price: Double,
    private val discount: Int = 0,
    private val productName: String
) {
    /**
     * @return price with applied discount determined by [salePercent]
     *
     * If [salePercent] is more than 100 than product will have negative price
     * If [salePercent] less than 0 product price will be increased
     */
    fun getPrice(): Double = price
    fun getDiscount(): Int = discount
    fun getDiscountPrice(): Double = price * (1 - discount / 100.0)
    fun getProductName(): String = productName
}