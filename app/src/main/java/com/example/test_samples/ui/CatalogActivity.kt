package com.example.test_samples.ui

import android.content.Intent
import android.os.Bundle
import com.example.test_samples.R
import kotlinx.android.synthetic.main.catalog_layout.*

class CatalogActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.catalog_layout)

        catalogToProductInfoButton.setOnClickListener {
            startActivity(Intent(this, ProductInfoActivity::class.java))
        }
    }
}