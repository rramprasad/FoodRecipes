package com.rramprasad.foodrecipes.home

import com.google.gson.annotations.SerializedName

/**
 * Created by Ramprasad
 */
data class Recipe (
        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("ingredients") var ingredients : ArrayList<RecipeIngredient>,
        @SerializedName("steps") var steps : ArrayList<RecipeStep>,
        @SerializedName("servings") var servings : Int,
        @SerializedName("image") var imageURL : String
)