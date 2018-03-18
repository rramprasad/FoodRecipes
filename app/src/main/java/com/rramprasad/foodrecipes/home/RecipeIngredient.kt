package com.rramprasad.foodrecipes.home

import com.google.gson.annotations.SerializedName

/**
 * Created by Ramprasad
 */
data class RecipeIngredient(
        @SerializedName("ingredient") var ingredientName : String,
        @SerializedName("measure") var measure : String,
        @SerializedName("quantity") var quantity : Double
)