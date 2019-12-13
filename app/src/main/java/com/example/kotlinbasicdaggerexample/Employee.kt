package com.example.kotlinbasicdaggerexample

import android.content.Context
import android.widget.Toast

class Employee(val mContext: Context) {

    fun displayEmployee() {
        Toast.makeText(mContext, "Employee Displayed", Toast.LENGTH_LONG).show()
    }

}