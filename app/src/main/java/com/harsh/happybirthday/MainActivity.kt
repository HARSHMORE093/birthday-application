package com.harsh.happybirthday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
    }
    fun createBirthdayCard(view: View) {
        val Name=nameInput.editableText.toString()

        Toast.makeText(this,"Name is $Name",Toast.LENGTH_LONG).show()

        val intent=Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.Name_Extra,Name)
        startActivity(intent)
    }
}