package com.rramprasad.foodrecipes.dependencyinjection

import android.app.Application
import com.rramprasad.foodrecipes.FoodRecipesApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import dagger.multibindings.Multibinds



/**
 * Created by Ramprasad
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, FoodRecipesAppModule::class, FoodRecipesAndroidBindingModule::class))
interface FoodRecipesAppComponent : AndroidInjector<FoodRecipesApp> {

    /*@Component.Builder
    abstract class Builder : AndroidInjector.Builder<FoodRecipesApp>()*/

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): FoodRecipesAppComponent
    }

    abstract override fun inject(app: FoodRecipesApp)

    //abstract fun inject(app: FoodRecipesApp)
}