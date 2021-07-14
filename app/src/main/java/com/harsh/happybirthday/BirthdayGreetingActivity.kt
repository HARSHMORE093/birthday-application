package com.harsh.happybirthday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val Name = intent.getStringExtra(Name_Extra)
        birthdayGreeting.text="Happy Birthday $Name"
    }
}