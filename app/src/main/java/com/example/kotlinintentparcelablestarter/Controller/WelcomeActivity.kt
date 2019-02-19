package com.example.kotlinintentparcelablestarter.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        goGarageBtn.setOnClickListener {
            val vehicleIntent = Intent(this,VehicleActivity::class.java)
            startActivity(vehicleIntent)
        }
    }
}
