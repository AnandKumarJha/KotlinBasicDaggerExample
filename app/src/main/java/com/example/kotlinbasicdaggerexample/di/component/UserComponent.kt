package com.example.kotlinbasicdaggerexample.di.component

import com.example.kotlinbasicdaggerexample.MainActivity
import com.example.kotlinbasicdaggerexample.di.module.EmployeeModule
import com.example.kotlinbasicdaggerexample.di.module.StudentModule
import dagger.Component

@Component(modules = [StudentModule::class, EmployeeModule::class])
interface UserComponent{

    fun inject(activity: MainActivity)

}