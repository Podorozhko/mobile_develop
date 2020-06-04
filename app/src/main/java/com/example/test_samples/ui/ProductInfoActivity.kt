package com.example.test_samples.ui

import android.content.Intent
import android.os.Bundle
import com.example.test_samples.R
import kotlinx.android.synthetic.main.product_info_layout.*

class ProductInfoActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_info_layout)

        productInfoToCartButton.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
        productInfoBackButton.setOnClickListener { finish() }

    }
}