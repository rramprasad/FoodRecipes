package com.rramprasad.foodrecipes.dependencyinjection

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
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
    abstract fun bindContext(application: Application): Context

    //Bind ViewModel Factory
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory


    /********************** MainActivity ******************************/
    //Bind MainActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel



    //Bind MainFragment
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainFragment(): MainFragment
    /********************** MainActivity ******************************/



}
