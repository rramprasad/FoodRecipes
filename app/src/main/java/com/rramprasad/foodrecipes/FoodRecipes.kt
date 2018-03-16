package com.rramprasad.foodrecipes

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

/*
 * Created by Ramprasad
 */
class FoodRecipes : Application() {

    override fun onCreate() {
        super.onCreate()

        //AppCenter CI integration
        AppCenter.start(this, "f9ee3e66-ebdb-4063-8b5e-816fd65a72cd",
                Analytics::class.java, Crashes::class.java)
    }
}