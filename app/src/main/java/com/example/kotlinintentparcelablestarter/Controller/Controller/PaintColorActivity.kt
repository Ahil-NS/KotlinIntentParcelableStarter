package com.example.kotlinintentparcelablestarter.Controller.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinintentparcelablestarter.Controller.Model.Vehicle
import com.example.kotlinintentparcelablestarter.Controller.Utilities.EXTRA_VEHICLE
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_paint_color.*

class PaintColorActivity : AppCompatActivity() {

    lateinit var vehicle : Vehicle

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_VEHICLE,vehicle)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paint_color)
        vehicle = intent.extras.getParcelable<Vehicle>(EXTRA_VEHICLE)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            vehicle = savedInstanceState.getParcelable(EXTRA_VEHICLE)
        }
    }


    fun blueBtnClicked(view: View){
        greenBtn.isChecked = false
        redBtn.isChecked = false
        vehicle.color = "blue"
    }
    fun greenBtnClicked(view: View){
        blueBtn.isChecked = false
        redBtn.isChecked = false
        vehicle.color = "green"
    }
    fun redBtnClicked(view: View){
        greenBtn.isChecked = false
        blueBtn.isChecked = false
        vehicle.color = "red"
    }

    fun finishBtnClicked(view: View){
        if(vehicle.color != ""){
            val finshIntent = Intent(this,
                FinishActivity::class.java)
            finshIntent.putExtra(EXTRA_VEHICLE, vehicle)
            startActivity(finshIntent)
        }
        else{
            Toast.makeText(this,"Please select vehicle Color",Toast.LENGTH_LONG).show()
        }

    }

}
