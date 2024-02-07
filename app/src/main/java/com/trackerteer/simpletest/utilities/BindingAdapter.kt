package com.trackerteer.simpletest.utilities

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.trackerteer.simpletest.domains.DataModel


@BindingAdapter("items")
fun setItems(recyclerView: RecyclerView, items: List<DataModel>?) {
    val adapter = recyclerView.adapter as? ItemAdapter
    adapter?.submitList(items)
}