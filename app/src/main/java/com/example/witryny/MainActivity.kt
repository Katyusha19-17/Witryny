package com.example.witryny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.material.chip.Chip
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

        var CHIPW1 = findViewById<Chip>(R.id.CHIPW1)
        var CHIPW2 = findViewById<Chip>(R.id.CHIPW2)
        var CHIPW3 = findViewById<Chip>(R.id.CHIPW3)
        var CHIPW4 = findViewById<Chip>(R.id.CHIPW4)
        var CHIPW5 = findViewById<Chip>(R.id.CHIPW5)
        var CHIPW6 = findViewById<Chip>(R.id.CHIPW6)
        var CHIPW7 = findViewById<Chip>(R.id.CHIPW7)
        var CHIPW8 = findViewById<Chip>(R.id.CHIPW8)
        var CHIPW9 = findViewById<Chip>(R.id.CHIPW9)
        var CHIPW10 = findViewById<Chip>(R.id.CHIPW10)

        var CHIPWE1 = findViewById<Chip>(R.id.CHIPWE1)
        var CHIPWE2 = findViewById<Chip>(R.id.CHIPWE2)
        var CHIPWE3 = findViewById<Chip>(R.id.CHIPWE3)
        var CHIPWE4 = findViewById<Chip>(R.id.CHIPWE4)
        var CHIPWE5 = findViewById<Chip>(R.id.CHIPWE5)
        var CHIPWE6 = findViewById<Chip>(R.id.CHIPWE6)
        var CHIPWE7 = findViewById<Chip>(R.id.CHIPWE7)
        var CHIPWE8 = findViewById<Chip>(R.id.CHIPWE8)
        var CHIPWE9 = findViewById<Chip>(R.id.CHIPWE9)
        var CHIPWE10 = findViewById<Chip>(R.id.CHIPWE10)

        var CHIPP1 = findViewById<Chip>(R.id.CHIPP1)
        var CHIPP2 = findViewById<Chip>(R.id.CHIPP2)
        var CHIPP3 = findViewById<Chip>(R.id.CHIPP3)
        var CHIPP4 = findViewById<Chip>(R.id.CHIPP4)
        var CHIPP5 = findViewById<Chip>(R.id.CHIPP5)
        var CHIPP6 = findViewById<Chip>(R.id.CHIPP6)
        var CHIPP7 = findViewById<Chip>(R.id.CHIPP7)
        var CHIPP8 = findViewById<Chip>(R.id.CHIPP8)
        var CHIPP9 = findViewById<Chip>(R.id.CHIPP9)
        var CHIPP10 = findViewById<Chip>(R.id.CHIPP10)

        RadioTrybDodawania.setChecked(true)


        RadioTrybListy.setOnClickListener {
            //Warzywa.visibility = View.INVISIBLE
            //Wedliny.visibility = View.INVISIBLE
            //Pieczywo.visibility = View.INVISIBLE

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

            if(CHBW1.isChecked){
                CHIPW1.visibility = View.VISIBLE
            }
            if(CHBW2.isChecked){
                CHIPW2.visibility = View.VISIBLE
            }
            if(CHBW3.isChecked){
                CHIPW3.visibility = View.VISIBLE
            }
            if(CHBW4.isChecked){
                CHIPW4.visibility = View.VISIBLE
            }
            if(CHBW5.isChecked){
                CHIPW5.visibility = View.VISIBLE
            }
            if(CHBW6.isChecked){
                CHIPW6.visibility = View.VISIBLE
            }
            if(CHBW7.isChecked){
                CHIPW7.visibility = View.VISIBLE
            }
            if(CHBW8.isChecked){
                CHIPW8.visibility = View.VISIBLE
            }
            if(CHBW9.isChecked){
                CHIPW9.visibility = View.VISIBLE
            }
            if(CHBW10.isChecked){
                CHIPW10.visibility = View.VISIBLE
            }


            if(CHBWE1.isChecked){
                CHIPWE1.visibility = View.VISIBLE
            }
            if(CHBWE2.isChecked){
                CHIPWE2.visibility = View.VISIBLE
            }
            if(CHBWE3.isChecked){
                CHIPWE3.visibility = View.VISIBLE
            }
            if(CHBWE4.isChecked){
                CHIPWE4.visibility = View.VISIBLE
            }
            if(CHBWE5.isChecked){
                CHIPWE5.visibility = View.VISIBLE
            }
            if(CHBWE6.isChecked){
                CHIPWE6.visibility = View.VISIBLE
            }
            if(CHBWE7.isChecked){
                CHIPWE7.visibility = View.VISIBLE
            }
            if(CHBWE8.isChecked){
                CHIPWE8.visibility = View.VISIBLE
            }
            if(CHBWE9.isChecked){
                CHIPWE9.visibility = View.VISIBLE
            }
            if(CHBWE10.isChecked){
                CHIPWE10.visibility = View.VISIBLE
            }


            if(CHBP1.isChecked){
                CHIPP1.visibility = View.VISIBLE
            }
            if(CHBP2.isChecked){
                CHIPP2.visibility = View.VISIBLE
            }
            if(CHBP3.isChecked){
                CHIPP3.visibility = View.VISIBLE
            }
            if(CHBP4.isChecked){
                CHIPP4.visibility = View.VISIBLE
            }
            if(CHBP5.isChecked){
                CHIPP5.visibility = View.VISIBLE
            }
            if(CHBP6.isChecked){
                CHIPP6.visibility = View.VISIBLE
            }
            if(CHBP7.isChecked){
                CHIPP7.visibility = View.VISIBLE
            }
            if(CHBP8.isChecked){
                CHIPP8.visibility = View.VISIBLE
            }
            if(CHBP9.isChecked){
                CHIPP9.visibility = View.VISIBLE
            }
            if(CHBP10.isChecked){
                CHIPP10.visibility = View.VISIBLE
            }
        }

        RadioTrybDodawania.setOnClickListener {
            //Warzywa.visibility = View.VISIBLE
            //Wedliny.visibility = View.VISIBLE
            //Pieczywo.visibility = View.VISIBLE

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

            CHIPW1.visibility = View.INVISIBLE
            CHIPW2.visibility = View.INVISIBLE
            CHIPW3.visibility = View.INVISIBLE
            CHIPW4.visibility = View.INVISIBLE
            CHIPW5.visibility = View.INVISIBLE
            CHIPW6.visibility = View.INVISIBLE
            CHIPW7.visibility = View.INVISIBLE
            CHIPW8.visibility = View.INVISIBLE
            CHIPW9.visibility = View.INVISIBLE
            CHIPW10.visibility = View.INVISIBLE

            CHIPWE1.visibility = View.INVISIBLE
            CHIPWE2.visibility = View.INVISIBLE
            CHIPWE3.visibility = View.INVISIBLE
            CHIPWE4.visibility = View.INVISIBLE
            CHIPWE5.visibility = View.INVISIBLE
            CHIPWE6.visibility = View.INVISIBLE
            CHIPWE7.visibility = View.INVISIBLE
            CHIPWE8.visibility = View.INVISIBLE
            CHIPWE9.visibility = View.INVISIBLE
            CHIPWE10.visibility = View.INVISIBLE

            CHIPP1.visibility = View.INVISIBLE
            CHIPP2.visibility = View.INVISIBLE
            CHIPP3.visibility = View.INVISIBLE
            CHIPP4.visibility = View.INVISIBLE
            CHIPP5.visibility = View.INVISIBLE
            CHIPP6.visibility = View.INVISIBLE
            CHIPP7.visibility = View.INVISIBLE
            CHIPP8.visibility = View.INVISIBLE
            CHIPP9.visibility = View.INVISIBLE
            CHIPP10.visibility = View.INVISIBLE
        }

        CHIPW1.setOnClickListener {
            CHBW1.isChecked = false
            CHIPW1.visibility = View.INVISIBLE
        }
        CHIPW2.setOnClickListener {
            CHBW2.isChecked = false
            CHIPW2.visibility = View.INVISIBLE
        }
        CHIPW3.setOnClickListener {
            CHBW3.isChecked = false
            CHIPW3.visibility = View.INVISIBLE
        }
        CHIPW4.setOnClickListener {
            CHBW4.isChecked = false
            CHIPW4.visibility = View.INVISIBLE
        }
        CHIPW5.setOnClickListener {
            CHBW5.isChecked = false
            CHIPW5.visibility = View.INVISIBLE
        }
        CHIPW6.setOnClickListener {
            CHBW6.isChecked = false
            CHIPW6.visibility = View.INVISIBLE
        }
        CHIPW7.setOnClickListener {
            CHBW7.isChecked = false
            CHIPW7.visibility = View.INVISIBLE
        }
        CHIPW8.setOnClickListener {
            CHBW8.isChecked = false
            CHIPW8.visibility = View.INVISIBLE
        }
        CHIPW9.setOnClickListener {
            CHBW9.isChecked = false
            CHIPW9.visibility = View.INVISIBLE
        }
        CHIPW10.setOnClickListener {
            CHBW10.isChecked = false
            CHIPW10.visibility = View.INVISIBLE
        }
        CHIPWE1.setOnClickListener {
            CHBWE1.isChecked = false
            CHIPWE1.visibility = View.INVISIBLE
        }
        CHIPWE2.setOnClickListener {
            CHBWE2.isChecked = false
            CHIPWE2.visibility = View.INVISIBLE
        }
        CHIPWE3.setOnClickListener {
            CHBWE3.isChecked = false
            CHIPWE3.visibility = View.INVISIBLE
        }
        CHIPWE4.setOnClickListener {
            CHBWE4.isChecked = false
            CHIPWE4.visibility = View.INVISIBLE
        }
        CHIPWE5.setOnClickListener {
            CHBWE5.isChecked = false
            CHIPWE5.visibility = View.INVISIBLE
        }
        CHIPWE6.setOnClickListener {
            CHBWE6.isChecked = false
            CHIPWE6.visibility = View.INVISIBLE
        }
        CHIPWE7.setOnClickListener {
            CHBWE7.isChecked = false
            CHIPWE7.visibility = View.INVISIBLE
        }
        CHIPWE8.setOnClickListener {
            CHBWE8.isChecked = false
            CHIPWE8.visibility = View.INVISIBLE
        }
        CHIPWE9.setOnClickListener {
            CHBWE9.isChecked = false
            CHIPWE9.visibility = View.INVISIBLE
        }
        CHIPWE10.setOnClickListener {
            CHBWE10.isChecked = false
            CHIPWE10.visibility = View.INVISIBLE
        }
        CHIPP1.setOnClickListener {
            CHBP1.isChecked = false
            CHIPP1.visibility = View.INVISIBLE
        }
        CHIPP2.setOnClickListener {
            CHBP2.isChecked = false
            CHIPP2.visibility = View.INVISIBLE
        }
        CHIPP3.setOnClickListener {
            CHBP3.isChecked = false
            CHIPP3.visibility = View.INVISIBLE
        }
        CHIPP4.setOnClickListener {
            CHBP4.isChecked = false
            CHIPP4.visibility = View.INVISIBLE
        }
        CHIPP5.setOnClickListener {
            CHBP5.isChecked = false
            CHIPP5.visibility = View.INVISIBLE
        }
        CHIPP6.setOnClickListener {
            CHBP6.isChecked = false
            CHIPP6.visibility = View.INVISIBLE
        }
        CHIPP7.setOnClickListener {
            CHBP7.isChecked = false
            CHIPP7.visibility = View.INVISIBLE
        }
        CHIPP8.setOnClickListener {
            CHBP8.isChecked = false
            CHIPP8.visibility = View.INVISIBLE
        }
        CHIPP9.setOnClickListener {
            CHBP9.isChecked = false
            CHIPP9.visibility = View.INVISIBLE
        }
        CHIPP10.setOnClickListener {
            CHBP10.isChecked = false
            CHIPP10.visibility = View.INVISIBLE
        }

    }
}