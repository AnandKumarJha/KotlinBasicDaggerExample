package com.example.kotlinbasicdaggerexample.component

import com.example.kotlinbasicdaggerexample.MainActivity
import com.example.kotlinbasicdaggerexample.module.EmployeeModule
import com.example.kotlinbasicdaggerexample.module.StudentModule
import dagger.Component

@Component(modules = [StudentModule::class, EmployeeModule::class])
interface UserComponent{

    fun inject(activity: MainActivity)

}