package com.rramprasad.foodrecipes.home

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import dagger.Provides
import javax.inject.Inject

class MainViewModel @Inject constructor(): AndroidViewModel(Application()) {


    @Inject
    lateinit var mutableLiveData : MutableLiveData<String>

    /*@Inject
    lateinit var recipeMutableLiveData : MutableLiveData<ArrayList<Recipe>>*/

    fun loadRecipes() : MutableLiveData<ArrayList<Recipe>>{

        /*val recipeIngredientArrayList = ArrayList<RecipeIngredient>()
        recipeIngredientArrayList.add(RecipeIngredient("Graham Cracker crumbs", "CUP", 2.0))
        recipeIngredientArrayList.add(RecipeIngredient("unsalted butter, melted", "TBLSP", 6.0))
        recipeIngredientArrayList.add(RecipeIngredient("granulated sugar", "CUP", 0.5))

        val recipeStepsArrayList = ArrayList<RecipeStep>()
        recipeStepsArrayList.add(RecipeStep(0, "Recipe Introduction", "Recipe Introduction", "https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd974_-intro-creampie/-intro-creampie.mp4", ""))
        recipeStepsArrayList.add(RecipeStep(1, "Starting prep", "1. Preheat the oven to 350\\u00b0F. Butter a 9\\\" deep dish pie pan.", "", ""))

        val recipesArrayList = ArrayList<Recipe>()
        recipesArrayList.add(Recipe(1, "Nutella Pie", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://www.recipeboy.com/wp-content/uploads/2016/09/No-Bake-Nutella-Pie.jpg"))
        recipesArrayList.add(Recipe(2, "Brownies", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://search.chow.com/thumbnail/800/600/www.chowstatic.com/assets/recipe_photos/29402_gluten_free_brownies2.jpg"))
        recipesArrayList.add(Recipe(3, "Yellow Cake", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://cdn.mycakeschool.com/images/2014/10/yellow-cake-featured-feb22.jpg"))

        recipeMutableLiveData.postValue(recipesArrayList)

        return recipeMutableLiveData*/
        return MutableLiveData()
    }

}
