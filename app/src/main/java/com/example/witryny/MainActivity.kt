package com.example.witryny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var RadioTrybListy = findViewById<RadioButton>(R.id.radioButtonTrybListy)
        var RadioTrybDodawania = findViewById<RadioButton>(R.id.radioButtonTrybDodawania)

        var Warzywa = findViewById<TextView>(R.id.Warzywa)
        var Wedliny = findViewById<TextView>(R.id.Wedliny)
        var Pieczywo = findViewById<TextView>(R.id.Pieczywo)

        var CHBW1 = findViewById<CheckBox>(R.id.CHBWarzywa1)
        var CHBW2 = findViewById<CheckBox>(R.id.CHBWarzywa2)
        var CHBW3 = findViewById<CheckBox>(R.id.CHBWarzywa3)
        var CHBW4 = findViewById<CheckBox>(R.id.CHBWarzywa4)
        var CHBW5 = findViewById<CheckBox>(R.id.CHBWarzywa5)
        var CHBW6 = findViewById<CheckBox>(R.id.CHBWarzywa6)
        var CHBW7 = findViewById<CheckBox>(R.id.CHBWarzywa7)
        var CHBW8 = findViewById<CheckBox>(R.id.CHBWarzywa8)
        var CHBW9 = findViewById<CheckBox>(R.id.CHBWarzywa9)
        var CHBW10 = findViewById<CheckBox>(R.id.CHBWarzywa10)

        var CHBWE1 = findViewById<CheckBox>(R.id.CHBWedliny1)
        var CHBWE2 = findViewById<CheckBox>(R.id.CHBWedliny2)
        var CHBWE3 = findViewById<CheckBox>(R.id.CHBWedliny3)
        var CHBWE4 = findViewById<CheckBox>(R.id.CHBWedliny4)
        var CHBWE5 = findViewById<CheckBox>(R.id.CHBWedliny5)
        var CHBWE6 = findViewById<CheckBox>(R.id.CHBWedliny6)
        var CHBWE7 = findViewById<CheckBox>(R.id.CHBWedliny7)
        var CHBWE8 = findViewById<CheckBox>(R.id.CHBWedliny8)
        var CHBWE9 = findViewById<CheckBox>(R.id.CHBWedliny9)
        var CHBWE10 = findViewById<CheckBox>(R.id.CHBWedliny10)

        var CHBP1 = findViewById<CheckBox>(R.id.CHBPieczywo1)
        var CHBP2 = findViewById<CheckBox>(R.id.CHBPieczywo2)
        var CHBP3 = findViewById<CheckBox>(R.id.CHBPieczywo3)
        var CHBP4 = findViewById<CheckBox>(R.id.CHBPieczywo4)
        var CHBP5 = findViewById<CheckBox>(R.id.CHBPieczywo5)
        var CHBP6 = findViewById<CheckBox>(R.id.CHBPieczywo6)
        var CHBP7 = findViewById<CheckBox>(R.id.CHBPieczywo7)
        var CHBP8 = findViewById<CheckBox>(R.id.CHBPieczywo8)
        var CHBP9 = findViewById<CheckBox>(R.id.CHBPieczywo9)
        var CHBP10 = findViewById<CheckBox>(R.id.CHBPieczywo10)

        RadioTrybDodawania.setChecked(true)


        RadioTrybListy.setOnClickListener {
            Warzywa.visibility = View.INVISIBLE
            Wedliny.visibility = View.INVISIBLE
            Pieczywo.visibility = View.INVISIBLE

            CHBW1.visibility = View.INVISIBLE
            CHBW2.visibility = View.INVISIBLE
            CHBW3.visibility = View.INVISIBLE
            CHBW4.visibility = View.INVISIBLE
            CHBW5.visibility = View.INVISIBLE
            CHBW6.visibility = View.INVISIBLE
            CHBW7.visibility = View.INVISIBLE
            CHBW8.visibility = View.INVISIBLE
            CHBW9.visibility = View.INVISIBLE
            CHBW10.visibility = View.INVISIBLE

            CHBWE1.visibility = View.INVISIBLE
            CHBWE2.visibility = View.INVISIBLE
            CHBWE3.visibility = View.INVISIBLE
            CHBWE4.visibility = View.INVISIBLE
            CHBWE5.visibility = View.INVISIBLE
            CHBWE6.visibility = View.INVISIBLE
            CHBWE7.visibility = View.INVISIBLE
            CHBWE8.visibility = View.INVISIBLE
            CHBWE9.visibility = View.INVISIBLE
            CHBWE10.visibility = View.INVISIBLE

            CHBP1.visibility = View.INVISIBLE
            CHBP2.visibility = View.INVISIBLE
            CHBP3.visibility = View.INVISIBLE
            CHBP4.visibility = View.INVISIBLE
            CHBP5.visibility = View.INVISIBLE
            CHBP6.visibility = View.INVISIBLE
            CHBP7.visibility = View.INVISIBLE
            CHBP8.visibility = View.INVISIBLE
            CHBP9.visibility = View.INVISIBLE
            CHBP10.visibility = View.INVISIBLE
        }

        RadioTrybDodawania.setOnClickListener {
            Warzywa.visibility = View.VISIBLE
            Wedliny.visibility = View.VISIBLE
            Pieczywo.visibility = View.VISIBLE

            CHBW1.visibility = View.VISIBLE
            CHBW2.visibility = View.VISIBLE
            CHBW3.visibility = View.VISIBLE
            CHBW4.visibility = View.VISIBLE
            CHBW5.visibility = View.VISIBLE
            CHBW6.visibility = View.VISIBLE
            CHBW7.visibility = View.VISIBLE
            CHBW8.visibility = View.VISIBLE
            CHBW9.visibility = View.VISIBLE
            CHBW10.visibility = View.VISIBLE

            CHBWE1.visibility = View.VISIBLE
            CHBWE2.visibility = View.VISIBLE
            CHBWE3.visibility = View.VISIBLE
            CHBWE4.visibility = View.VISIBLE
            CHBWE5.visibility = View.VISIBLE
            CHBWE6.visibility = View.VISIBLE
            CHBWE7.visibility = View.VISIBLE
            CHBWE8.visibility = View.VISIBLE
            CHBWE9.visibility = View.VISIBLE
            CHBWE10.visibility = View.VISIBLE

            CHBP1.visibility = View.VISIBLE
            CHBP2.visibility = View.VISIBLE
            CHBP3.visibility = View.VISIBLE
            CHBP4.visibility = View.VISIBLE
            CHBP5.visibility = View.VISIBLE
            CHBP6.visibility = View.VISIBLE
            CHBP7.visibility = View.VISIBLE
            CHBP8.visibility = View.VISIBLE
            CHBP9.visibility = View.VISIBLE
            CHBP10.visibility = View.VISIBLE
        }
    }
}