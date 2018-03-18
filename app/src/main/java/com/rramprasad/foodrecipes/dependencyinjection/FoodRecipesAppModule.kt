package com.rramprasad.foodrecipes.dependencyinjection

import com.rramprasad.foodrecipes.FoodRecipesApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FoodRecipesAppModule(val app : FoodRecipesApp) {

    @Provides
    @Singleton
    fun provideApp() = app

}
