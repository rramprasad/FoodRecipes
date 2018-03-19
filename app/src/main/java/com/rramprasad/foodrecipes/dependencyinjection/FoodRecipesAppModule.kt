package com.rramprasad.foodrecipes.dependencyinjection

import android.arch.lifecycle.MutableLiveData
import com.rramprasad.foodrecipes.FoodRecipesApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FoodRecipesAppModule {

    @Provides
    fun provideMutableLiveData(): MutableLiveData<String> {
        return MutableLiveData()
    }

    /*@Provides
    @Singleton
    fun provideApp() = app*/

}
