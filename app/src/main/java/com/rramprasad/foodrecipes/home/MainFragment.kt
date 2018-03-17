package com.rramprasad.foodrecipes.home

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rramprasad.foodrecipes.*
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by Ramprasad
 */
class MainFragment : Fragment() {

    private lateinit var recyclerViewManager : RecyclerView.LayoutManager
    private lateinit var recyclerViewAdapter : RecyclerView.Adapter<*>
    private lateinit var mRecipesArrayList: ArrayList<Recipe>
    //private lateinit var mainViewModel: MainViewModel

    companion object {
        fun newInstance() : MainFragment {
            return MainFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*mainViewModel = ViewModelProviders
                .of(this,MainViewModel.)
                .get(MainViewModel::class.java)*/
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    /*
     * Setup Recyclerview for recipes
     */
    private fun setupRecyclerView() {
        val recipeIngredientArrayList = ArrayList<RecipeIngredient>()
        recipeIngredientArrayList.add(RecipeIngredient("Graham Cracker crumbs", "CUP", 2.0))
        recipeIngredientArrayList.add(RecipeIngredient("unsalted butter, melted", "TBLSP", 6.0))
        recipeIngredientArrayList.add(RecipeIngredient("granulated sugar", "CUP", 0.5))

        val recipeStepsArrayList = ArrayList<RecipeStep>()
        recipeStepsArrayList.add(RecipeStep(0, "Recipe Introduction", "Recipe Introduction", "https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd974_-intro-creampie/-intro-creampie.mp4", ""))
        recipeStepsArrayList.add(RecipeStep(1, "Starting prep", "1. Preheat the oven to 350\\u00b0F. Butter a 9\\\" deep dish pie pan.", "", ""))

        mRecipesArrayList = ArrayList<Recipe>()
        mRecipesArrayList.add(Recipe(1, "Nutella Pie", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://www.recipeboy.com/wp-content/uploads/2016/09/No-Bake-Nutella-Pie.jpg"))
        mRecipesArrayList.add(Recipe(2, "Brownies", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://search.chow.com/thumbnail/800/600/www.chowstatic.com/assets/recipe_photos/29402_gluten_free_brownies2.jpg"))
        mRecipesArrayList.add(Recipe(3, "Yellow Cake", recipeIngredientArrayList, recipeStepsArrayList, 0, "https://cdn.mycakeschool.com/images/2014/10/yellow-cake-featured-feb22.jpg"))

        recyclerViewManager = GridLayoutManager(activity,1)
        recyclerViewAdapter = RecipesListAdapter(this.mRecipesArrayList)

        recipes_list_recyclerview.apply {

            setHasFixedSize(true)

            layoutManager = recyclerViewManager;
            adapter = recyclerViewAdapter
        }

    }


}