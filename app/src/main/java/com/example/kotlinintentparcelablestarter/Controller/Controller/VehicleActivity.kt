package com.example.kotlinintentparcelablestarter.Controller.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinintentparcelablestarter.Controller.Model.Vehicle
import com.example.kotlinintentparcelablestarter.Controller.Utilities.EXTRA_VEHICLE
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_vehicle.*

class VehicleActivity : AppCompatActivity() {

    //var selectedVehicle = ""
    var selectedVehicle = Vehicle("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_VEHICLE,selectedVehicle)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            selectedVehicle = savedInstanceState.getParcelable(EXTRA_VEHICLE)
        }
    }

    fun vehicleNextBtnClicked(view: View){
        if(selectedVehicle.name != ""){
            val paintIntent = Intent(this,
                PaintColorActivity::class.java)
            paintIntent.putExtra(EXTRA_VEHICLE, selectedVehicle)
            startActivity(paintIntent)
        }
        else{
            Toast.makeText(this,"Please select vehicle",Toast.LENGTH_LONG).show()
        }
    }

    fun bikeBtnClicked(view: View){
        carBtn.isChecked = false
        jeepBtn.isChecked = false
        selectedVehicle.name = "bike"
    }
    fun carBtnClicked(view: View){
        bikeBtn.isChecked = false
        jeepBtn.isChecked = false
        selectedVehicle.name = "car"

    }
    fun jeepBtnClicked(view: View){
        bikeBtn.isChecked = false
        carBtn.isChecked = false
        selectedVehicle.name = "jeep"

    }

}
//
//
//