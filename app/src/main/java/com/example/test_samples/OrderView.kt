package com.example.test_samples

import com.example.test_samples.model.Cart
import com.example.test_samples.model.Product
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface OrderView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun print(string: String)

    fun showErrorFirstName(visible: Boolean)
    fun showErrorLastName(visible: Boolean)
    fun showErrorMiddleName(visible: Boolean)
    fun showErrorPhoneNumber(visible: Boolean)

    fun print(cart: Cart)
    fun print(product: Product)
}