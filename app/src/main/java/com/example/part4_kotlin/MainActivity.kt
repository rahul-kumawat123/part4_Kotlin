package com.example.part4_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //WAP using Lambda function to calculate the Simple Interest.
        val q1 = ques1()
        q1.simpleInterest()


        //Create a list of Employee which will have name and age as properties. print the name of all employees age >30.
        val q2 = ques2()
        q2.showName()
    }
}