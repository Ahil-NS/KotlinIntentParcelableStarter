package com.example.kotlinintentparcelablestarter.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_vehicle.*

class VehicleActivity : AppCompatActivity() {

    var selectedVehicle = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle)
    }

    fun vehicleNextBtnClicked(view: View){
        if(selectedVehicle != ""){
            val paintIntent = Intent(this,PaintColorActivity::class.java)
            startActivity(paintIntent)
        }
        else{
            Toast.makeText(this,"Please select vehicle",Toast.LENGTH_LONG).show()
        }
    }

    fun bikeBtnClicked(view: View){
        carBtn.isChecked = false
        jeepBtn.isChecked = false
        selectedVehicle = "bike"
    }
    fun carBtnClicked(view: View){
        bikeBtn.isChecked = false
        jeepBtn.isChecked = false
        selectedVehicle = "car"

    }
    fun jeepBtnClicked(view: View){
        bikeBtn.isChecked = false
        carBtn.isChecked = false
        selectedVehicle = "jeep"

    }

}
//
//
//