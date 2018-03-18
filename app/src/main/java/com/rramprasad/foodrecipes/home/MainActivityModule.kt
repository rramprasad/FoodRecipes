package com.rramprasad.foodrecipes.home

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