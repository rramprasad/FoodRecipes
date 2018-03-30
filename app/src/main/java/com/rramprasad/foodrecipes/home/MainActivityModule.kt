package com.rramprasad.foodrecipes.home

import android.arch.lifecycle.MutableLiveData
import com.rramprasad.foodrecipes.dependencyinjection.ViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ramprasad
 */
@Module
class MainActivityModule @Inject constructor(){

    @Provides
    fun provideMainFragment(): MainFragment {
        return MainFragment.newInstance()
    }

    /*@Provides
    internal fun provideMutableLiveData(): MutableLiveData<ArrayList<Recipe>> {
        return MutableLiveData<ArrayList<Recipe>>()
    }*/

    @Provides
    @Singleton
    fun provideMutableLiveData(): MutableLiveData<String> {
        return MutableLiveData()
    }

}