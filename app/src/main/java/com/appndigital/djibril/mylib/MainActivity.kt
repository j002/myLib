package com.appndigital.djibril.mylib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appndigital.djibril.mylibrary.LatLonDistanceCalculator
import com.appndigital.djibril.mylibrary.Point
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buenosAiresObeliscoPoint = Point((-34.6037389).toFloat(), (-58.3815704).toFloat())

        val nycStatueOfLibertyPoint = Point(40.6892494.toFloat(), (-74.0445004).toFloat())

        val distanceBetweenPoints = LatLonDistanceCalculator.calculateDistance(
            buenosAiresObeliscoPoint,
            nycStatueOfLibertyPoint)


        kilometers_label.text = "Between the Obelisco and the Statue of Liberty there are: \n" + distanceBetweenPoints + "KM"
    }
}
