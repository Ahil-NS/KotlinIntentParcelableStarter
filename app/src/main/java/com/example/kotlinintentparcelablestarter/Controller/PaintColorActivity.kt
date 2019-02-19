package com.example.kotlinintentparcelablestarter.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinintentparcelablestarter.R
import kotlinx.android.synthetic.main.activity_paint_color.*

class PaintColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paint_color)
    }

    fun blueBtnClicked(view: View){
        greenBtn.isChecked = false
        redBtn.isChecked = false
    }
    fun greenBtnClicked(view: View){
        blueBtn.isChecked = false
        redBtn.isChecked = false

    }
    fun redBtnClicked(view: View){
        greenBtn.isChecked = false
        blueBtn.isChecked = false

    }
}
