package com.rramprasad.foodrecipes.dependencyinjection

import android.app.Application
import com.rramprasad.foodrecipes.FoodRecipesApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton
import dagger.multibindings.Multibinds



/**
 * Created by Ramprasad
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, FoodRecipesAppModule::class, FoodRecipesAndroidBindingModule::class))
interface FoodRecipesAppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerApplication>()

    /*@Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): FoodRecipesAppComponent
    }*/

    abstract override fun inject(app: DaggerApplication)

    abstract fun inject(app: FoodRecipesApp)
}