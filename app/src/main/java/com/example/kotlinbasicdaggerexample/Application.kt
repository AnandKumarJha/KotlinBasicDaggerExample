package com.example.kotlinbasicdaggerexample

import android.app.Application
import com.example.kotlinbasicdaggerexample.component.DaggerUserComponent
import com.example.kotlinbasicdaggerexample.component.UserComponent
import com.example.kotlinbasicdaggerexample.module.EmployeeModule
import com.example.kotlinbasicdaggerexample.module.StudentModule

class MyApplication : Application(){

    private lateinit var mUserComponent : UserComponent

    override fun onCreate() {
        super.onCreate()

        mUserComponent = DaggerUserComponent.builder().employeeModule(EmployeeModule(this)).studentModule(StudentModule(this)).build()
    }

    fun getUserComponent() : UserComponent{
        return mUserComponent
    }
}