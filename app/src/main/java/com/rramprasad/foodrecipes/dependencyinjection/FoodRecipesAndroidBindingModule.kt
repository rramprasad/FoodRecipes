package com.rramprasad.foodrecipes.dependencyinjection

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import com.rramprasad.foodrecipes.home.MainActivity
import com.rramprasad.foodrecipes.home.MainActivityModule
import com.rramprasad.foodrecipes.home.MainFragment
import com.rramprasad.foodrecipes.home.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class FoodRecipesAndroidBindingModule {

    @Binds
    internal abstract fun bindContext(application: Application): Context

    //Bind ViewModel Factory
    @Binds
    internal abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory


    //Bind MainActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainActivity(): MainActivity

    /*@Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(userViewModel: MainViewModel): ViewModel

    //Bind MainFragment
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainFragment(): MainFragment*/
}
