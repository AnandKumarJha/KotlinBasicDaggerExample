package com.example.kotlinbasicdaggerexample

import android.content.Context
import android.widget.Toast

class Student(val mContext: Context) {

    fun displayStudent() {
        Toast.makeText(mContext, "Student Displayed", Toast.LENGTH_LONG).show()
    }

}