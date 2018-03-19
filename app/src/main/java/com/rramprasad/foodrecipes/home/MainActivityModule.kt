package com.rramprasad.foodrecipes.home

import com.rramprasad.foodrecipes.dependencyinjection.ViewModelFactory
import dagger.Module
import dagger.Provides

/**
 * Created by Ramprasad
 */
@Module
class MainActivityModule{

    @Provides
    fun provideMainFragment(): MainFragment {
        return MainFragment.newInstance()
    }

}