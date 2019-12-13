package com.example.kotlinbasicdaggerexample.module

import android.content.Context
import com.example.kotlinbasicdaggerexample.Student
import dagger.Module
import dagger.Provides

@Module
class StudentModule(val mContext: Context) {

    @Provides
    fun getStudentObject(): Student {
        return Student(mContext)
    }
}