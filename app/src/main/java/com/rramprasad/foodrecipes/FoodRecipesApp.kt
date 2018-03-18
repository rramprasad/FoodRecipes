package com.rramprasad.foodrecipes

import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.rramprasad.foodrecipes.dependencyinjection.DaggerFoodRecipesAppComponent
import com.rramprasad.foodrecipes.dependencyinjection.FoodRecipesAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/*
 * Created by Ramprasad
 */
class FoodRecipesApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        //AppCenter CI integration
        AppCenter.start(this, "f9ee3e66-ebdb-4063-8b5e-816fd65a72cd",
                Analytics::class.java, Crashes::class.java)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent : FoodRecipesAppComponent = DaggerFoodRecipesAppComponent
                .builder()
                .application(this)
                .build()
        appComponent.inject(this)
        return appComponent
    }
}