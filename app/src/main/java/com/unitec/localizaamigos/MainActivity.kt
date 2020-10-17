package com.unitec.localizaamigos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //La instancia se declara antes de tu ser content view
        //Mapbox.getInstance(this, "pk.eyJ1IjoidGF2b2x1bmFzIiwiYSI6ImNrZzhrdGI5ajAwYmcyeHAydjdtMDc1aXgifQ.Qdz50qg2CoA2dkehGGKV9A")
        Mapbox.getInstance(this,getString(R.string.miToken))
        setContentView(R.layout.activity_main)
        //paso 7b
        mapView?.onCreate(savedInstanceState)
    }
}