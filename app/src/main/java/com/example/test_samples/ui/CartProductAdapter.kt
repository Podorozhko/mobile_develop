package com.example.test_samples.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test_samples.R
import com.example.test_samples.model.Product
import kotlinx.android.synthetic.main.item_product.view.*

class CartProductAdapter (
    private val onDeleteClick: (string: String) -> Unit
): RecyclerView.Adapter<CartProductAdapter.ViewHolder>() {

    private var products = listOf<Product>()

    fun setData(products: List<Product>) {
        this.products = products
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartProductAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false))

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: CartProductAdapter.ViewHolder, position: Int) {
        holder.bind(products[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.productNameTv.text = product.productName
            itemView.productDiscountTv.text = product.discount.toString() + "%"
            itemView.productPriceTv.text = "%.2f Р".format(product.discountPrice)

            itemView.deleteProductIv.setOnClickListener{
                onDeleteClick(product.productName)
            }
        }
    }

}