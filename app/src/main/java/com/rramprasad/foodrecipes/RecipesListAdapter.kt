package com.rramprasad.foodrecipes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Ramprasad
 */
class RecipesListAdapter : RecyclerView.Adapter<RecipesListAdapter.ViewHolder>() {

    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val textView = LayoutInflater.from(parent.context).inflate(
                R.id.recipes_list_item,
                parent,
                false
        ) as TextView


        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        //holder.textView.text =
    }

    override fun getItemCount(): Int {
    }

}