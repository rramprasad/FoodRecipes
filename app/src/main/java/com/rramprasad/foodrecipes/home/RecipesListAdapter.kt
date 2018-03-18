package com.rramprasad.foodrecipes.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.rramprasad.foodrecipes.R
import com.squareup.picasso.Picasso

/**
 * Created by Ramprasad
 */
class RecipesListAdapter(val mRecipesArrayList: ArrayList<Recipe>) : RecyclerView.Adapter<RecipesListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.recipes_list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageURL = mRecipesArrayList[position].imageURL

        if (imageURL.isNotEmpty())
            Picasso.get()
                    .load(imageURL)
                    .placeholder(android.R.drawable.gallery_thumb)
                    //.fit()
                    //.resize(holder.mRecipeImageView!!.width, holder.mRecipeImageView?.height!!)
                    .resize(0, 500)
                    .centerCrop()
                    .into(holder.mRecipeImageView)
    }

    override fun getItemCount() = mRecipesArrayList.size

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var mRecipeImageView: ImageView? = null

        init {
            mRecipeImageView = itemView.findViewById<ImageView>(R.id.recipe_imageview)
        }
    }
}