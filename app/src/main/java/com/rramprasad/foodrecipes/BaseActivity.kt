package com.rramprasad.foodrecipes

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Ramprasad
 */
abstract class BaseActivity : DaggerAppCompatActivity(){

    protected fun replaceFragmentInActivity(containerId : Int, fragment : Fragment){
        supportFragmentManager
                .beginTransaction().replace(containerId,fragment)
                .commit()
    }
}