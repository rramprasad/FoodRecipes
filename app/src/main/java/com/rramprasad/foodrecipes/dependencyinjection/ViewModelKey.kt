package com.rramprasad.foodrecipes.dependencyinjection

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.ViewModel
import com.rramprasad.foodrecipes.R.id.FUNCTION
import com.rramprasad.foodrecipes.home.MainViewModel
import dagger.MapKey
import java.lang.annotation.*
import java.lang.annotation.Retention
import java.lang.annotation.Target
import kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
import kotlin.reflect.KClass

/**
 * Created by Ramprasad
 */


@Documented
//@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(RetentionPolicy.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)



