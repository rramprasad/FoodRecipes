package com.rramprasad.foodrecipes

import com.google.gson.annotations.SerializedName

/**
 * Created by Ramprasad
 */
data class RecipeStep(
        @SerializedName("id") val id : Int,
        @SerializedName("shortDescription") var shortDescription : String,
        @SerializedName("description") var description : String,
        @SerializedName("videoURL") var videoURL : String,
        @SerializedName("thumbnailURL") var thumbnailUrl : String
)