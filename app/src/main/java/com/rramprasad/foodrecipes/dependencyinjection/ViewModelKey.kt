@file:Suppress("DEPRECATED_JAVA_ANNOTATION")

package com.rramprasad.foodrecipes.dependencyinjection

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.ViewModel
import com.rramprasad.foodrecipes.R.id.FUNCTION
import com.rramprasad.foodrecipes.home.MainViewModel
import dagger.MapKey
import java.lang.annotation.*
import java.lang.annotation.Retention
import java.lang.annotation.Target
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

/**
 * Created by Ramprasad
 */


@Documented
//@Target(FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@MapKey
@JvmSuppressWildcards
annotation class ViewModelKey(val value: KClass<out ViewModel>)



