package com.rramprasad.foodrecipes.home

import android.arch.lifecycle.Observer
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
import com.rramprasad.foodrecipes.dependencyinjection.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by Ramprasad
 */
class MainFragment : DaggerFragment() {

    //var viewModelFactory : ViewModelFactory? = null
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    var recyclerViewManager : GridLayoutManager? = null
    var recyclerViewAdapter : RecyclerView.Adapter<*>? = null
    var mRecipesArrayList: ArrayList<Recipe>? = null

    var mainViewModel: MainViewModel? = null

    companion object {
        fun newInstance() : MainFragment {
            return MainFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //AndroidSupportInjection.inject(this)
        mainViewModel = ViewModelProviders
                .of(this,viewModelFactory)
                .get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        loadRecipes()
    }

    private fun loadRecipes() {
        mainViewModel!!.loadRecipes().observe(this, Observer {
            mRecipesArrayList!!.addAll(it!!)
            recyclerViewAdapter!!.notifyDataSetChanged()
        })
    }

    /*
     * Setup Recyclerview for recipes
     */
    private fun setupRecyclerView() {

        recyclerViewManager = GridLayoutManager(activity,1)
        recyclerViewAdapter = RecipesListAdapter(this.mRecipesArrayList!!)

        recipes_list_recyclerview.apply {

            setHasFixedSize(true)

            layoutManager = recyclerViewManager;
            adapter = recyclerViewAdapter
        }

    }


}