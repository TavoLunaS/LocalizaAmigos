package com.unitec.localizaamigos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.Style
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
        //paso 7c
        mapView?.getMapAsync { mapBoxMap->
            mapBoxMap.setStyle(Style.MAPBOX_STREETS){
                //aqui puedes estilizar aun mas los mapas
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        //invocamos si es que se guardo, una instancia del ultimo mapa
        mapView.onSaveInstanceState(outState)

    }

    override fun onDestroy() {
        super.onDestroy()
        //destruimos el mapa cuando no este en la app
        mapView?.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        //para baja memoria
    }

    override fun onPause() {
        super.onPause()
        //para pausar ña actividad del mapa en lo que se realiza otra actividad
        mapView?.onPause()
    }

    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
    }

    override fun onResume() {
        super.onResume()
        mapView?.onResume()
    }





}