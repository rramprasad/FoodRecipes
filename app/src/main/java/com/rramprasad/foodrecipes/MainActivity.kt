package com.rramprasad.foodrecipes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AppCenter CI integration
        AppCenter.start(application, "f9ee3e66-ebdb-4063-8b5e-816fd65a72cd",
                Analytics::class.java, Crashes::class.java)
    }
}
