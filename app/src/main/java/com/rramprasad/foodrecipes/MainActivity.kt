package com.rramprasad.foodrecipes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


/*
 * Main Activity for Recipes list RecyclerView
 */
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewManager : RecyclerView.LayoutManager
    private lateinit var recyclerViewAdapter : RecyclerView.Adapter<*>

    private val mRecipesArrayList: Any? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewManager = LinearLayoutManager(this)
        recyclerViewAdapter = RecipesListAdapter(this,mRecipesArrayList)

        recipes_list_recyclerview.apply {

            setHasFixedSize(true)

            layoutManager = recyclerViewManager;
            adapter = recyclerViewAdapter
        }
    }
}