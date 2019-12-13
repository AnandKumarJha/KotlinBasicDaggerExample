package com.example.kotlinbasicdaggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mStudent : Student

    @Inject
    lateinit var mEmployee: Employee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).getUserComponent().inject(this)

        mStudent.displayStudent()

        Handler().postDelayed(Runnable {
            mEmployee.displayEmployee()
        }, 1000)

    }
}
