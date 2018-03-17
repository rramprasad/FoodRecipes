package com.rramprasad.foodrecipes

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by Ramprasad
 */
abstract class BaseActivity : AppCompatActivity(){

    protected fun replaceFragmentInActivity(containerId : Int, fragment : Fragment){
        supportFragmentManager
                .beginTransaction().replace(containerId,fragment)
                .commit()
    }
}