package com.rramprasad.foodrecipes.home

import android.os.Bundle
import com.rramprasad.foodrecipes.BaseActivity
import com.rramprasad.foodrecipes.R
import javax.inject.Inject


/*
 * Main Activity for Recipes list RecyclerView
 */
class MainActivity : BaseActivity() {

    @Inject
    lateinit var mainFragment : MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            replaceFragmentInActivity(R.id.main_activity_fragment_container,mainFragment)
        }
    }
}
