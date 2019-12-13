package com.example.kotlinbasicdaggerexample.di.module

import android.content.Context
import com.example.kotlinbasicdaggerexample.Employee
import dagger.Module
import dagger.Provides

@Module
class EmployeeModule(val mContext : Context) {

    @Provides
    fun getEmployeeObject() : Employee{
        return Employee(mContext)
    }

}