package com.example.schoolappace1122.di

import android.app.Application

class SchoolsApp: Application() {

    override fun onCreate() {
        super.onCreate()

        schoolsComponent = DaggerSchoolsComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()

    }

    companion object{
        lateinit var schoolsComponent: SchoolsComponent
    }

}