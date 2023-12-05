package io.github.aidenkoog.androidpractice.android.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView

/*
 * default recyclerview's abstract adapter.
 */
abstract class AbstractAdapter<T>(items: List<T>?) : RecyclerView.Adapter<BaseViewHolder<*>?>() {
    open var itemList: List<T>? = null

    init {
        setItems(items)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        holder.onBindViewHolder(position)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(items: List<T>?) {
        if (!items.isNullOrEmpty()) {
            this.itemList = items
            notifyDataSetChanged()
        }
    }
}