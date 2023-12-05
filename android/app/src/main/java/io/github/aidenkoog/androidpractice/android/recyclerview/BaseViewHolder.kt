package io.github.aidenkoog.androidpractice.android.recyclerview

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

// data-binding
// dependency: buildFeatures { dataBinding = true  }
abstract class BaseViewHolder<B : ViewDataBinding>(binding: B) : RecyclerView.ViewHolder(
    binding.root
) {
    abstract fun onBindViewHolder(position: Int)
}