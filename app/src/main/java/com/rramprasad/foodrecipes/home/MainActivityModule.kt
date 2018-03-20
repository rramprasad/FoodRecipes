package com.rramprasad.foodrecipes.home

import android.arch.lifecycle.MutableLiveData
import com.rramprasad.foodrecipes.dependencyinjection.ViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 * Created by Ramprasad
 */
@Module
internal class MainActivityModule{

    @Provides
    internal fun provideMainFragment(): MainFragment {
        return MainFragment.newInstance()
    }

    /*@Provides
    internal fun provideMutableLiveData(): MutableLiveData<ArrayList<Recipe>> {
        return MutableLiveData<ArrayList<Recipe>>()
    }*/

    @Provides
    internal fun provideMutableLiveData(): MutableLiveData<String> {
        return MutableLiveData()
    }

}