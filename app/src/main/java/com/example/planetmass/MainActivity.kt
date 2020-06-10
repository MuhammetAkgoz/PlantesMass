package com.example.planetmass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import com.example.planetmass.Calculater.PlanetMassCalculater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var planets = arrayOf("Merkür", "Venüs", "Mars", "Jupiter", "Satürn", "Uranus", "Neptün")
        var spnPlantes = findViewById<Spinner>(R.id.spinnerPlantes)
        var myAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, planets)
        spnPlantes.adapter = myAdapter


        var planetMassCalculater = PlanetMassCalculater()
        var etMass: EditText = findViewById(R.id.etMass)


        if (etMass.text.toString() == "0.0") {
            var personGravity = etMass.text.toString().toDouble()

            spnPlantes.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    var newPersonGravity:Double
                    when (position) {
                        0 -> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,0).toString()
                        }
                        1 -> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,1).toString()
                        }
                        2-> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,2).toString()

                        }
                        3-> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,3).toString()

                        }
                        4 -> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,4).toString()
                        }
                        5 -> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,5).toString()

                        }
                        6 -> {
                                newPersonGravity=planetMassCalculater.kiloToPound(personGravity)
                                tvMass.text = planetMassCalculater.calculateGravity(newPersonGravity,6).toString()

                        }
                    }

                }

            }
        }

    }


}
