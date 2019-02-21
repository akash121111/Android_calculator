package com.example.akashmac.maccalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bnevent(view:View){
        if(isNew){
            valueS.setText("")
        }

         isNew=false
        val bSelect=view as Button
         var bClick:String=valueS.text.toString()
        when(bSelect.id){
            b0.id ->{
                bClick+="0"
            }
            b1.id ->{
                bClick+="1"
            }
            b2.id ->{
                bClick+="2"
            }
            b3.id ->{
                bClick+="3"
            }
            b4.id ->{
                bClick+="4"
            }
            b5.id ->{
                bClick+="5"
            }
            b6.id ->{
                bClick+="6"
            }
            b8.id ->{
                bClick+="8"
            }
            b7.id ->{
                bClick+="7"
            }
            b9.id ->{
                bClick+="9"
            }
            bd.id ->{
                bClick+="."
            }
            bPM.id ->{
                bClick="-"+bClick
            }


        }
        valueS.setText(bClick)
        ba.setText("C")
    }
    var OD="*"
    var oldNu=""
    var isNew=true
    fun OB(view: View){
        val OBS=view as Button

        when(OBS.id) {
            p.id -> {
                OD= "+"
            }
            m.id -> {
                OD="*"
            }
            s.id -> {
                OD="-"
            }
            d.id -> {
                OD="/"
            }

        }
        oldNu=valueS.text.toString()
        isNew=true

    }
    fun bE(view: View){
        val newNum=valueS.text.toString()
        var finalNum:Double?=null
        when(OD){

            "+" ->{
                finalNum=oldNu.toDouble() + newNum.toDouble()
            }
            "-" ->{
                finalNum=oldNu.toDouble() - newNum.toDouble()
            }
            "*" ->{
                finalNum=oldNu.toDouble() * newNum.toDouble()
            }
            "/" ->{
                finalNum=oldNu.toDouble() / newNum.toDouble()
            }

        }
        valueS.setText(finalNum.toString())
        isNew=true
    }
    fun bAC(view: View){
        valueS.setText("0")
        oldNu=""
        isNew=true
        ba.setText("AC")




    }
    fun pers(view: View){
        val num:Double=valueS.text.toString().toDouble()/100
        valueS.setText(num.toString())
         isNew=true
    }
}
