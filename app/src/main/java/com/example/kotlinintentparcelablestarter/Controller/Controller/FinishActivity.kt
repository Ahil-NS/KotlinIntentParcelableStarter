package com.example.kotlinintentparcelablestarter.Controller.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinintentparcelablestarter.Controller.Model.Vehicle
import com.example.kotlinintentparcelablestarter.Controller.Utilities.EXTRA_VEHICLE
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        var rrr = intent.extras.getParcelable<Vehicle>(EXTRA_VEHICLE)
        vehicleText.text = "${rrr.color} ${rrr.name}"

    }
}
