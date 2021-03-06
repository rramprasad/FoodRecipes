package com.rramprasad.foodrecipes.dependencyinjection

import android.app.Application
import com.rramprasad.foodrecipes.FoodRecipesApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton


/**
 * Created by Ramprasad
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        FoodRecipesAppModule::class,
        FoodRecipesAndroidBindingModule::class))
interface FoodRecipesAppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): FoodRecipesAppComponent
    }

    fun inject(instance: FoodRecipesApp?)
}