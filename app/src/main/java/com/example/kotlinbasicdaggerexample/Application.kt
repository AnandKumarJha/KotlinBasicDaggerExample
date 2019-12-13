package com.example.kotlinbasicdaggerexample

import android.app.Application
import com.example.kotlinbasicdaggerexample.di.component.DaggerUserComponent
import com.example.kotlinbasicdaggerexample.di.component.UserComponent
import com.example.kotlinbasicdaggerexample.di.module.EmployeeModule
import com.example.kotlinbasicdaggerexample.di.module.StudentModule

class MyApplication : Application(){

    private lateinit var mUserComponent : UserComponent

    override fun onCreate() {
        super.onCreate()

        mUserComponent = DaggerUserComponent.builder().employeeModule(
            EmployeeModule(
                this
            )
        ).studentModule(StudentModule(this)).build()
    }

    fun getUserComponent() : UserComponent {
        return mUserComponent
    }
}