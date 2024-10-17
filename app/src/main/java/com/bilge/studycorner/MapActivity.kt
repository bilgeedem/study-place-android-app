package com.bilge.studycorner

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.bottomnavigation.BottomNavigationView


import org.osmdroid.config.Configuration
import org.osmdroid.views.MapView
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.overlay.Marker
import org.osmdroid.tileprovider.tilesource.TileSourceFactory

class MapActivity : AppCompatActivity() {


    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize OSMDroid configuration
        Configuration.getInstance().load(applicationContext, getSharedPreferences("osm_prefs", MODE_PRIVATE))


        setContentView(R.layout.activity_map)



        // Get MapView from layout
        mapView = findViewById(R.id.mapView)

        // Set the tile source for the map
        mapView.setTileSource(TileSourceFactory.MAPNIK)

        // Enable zoom controls

        mapView.setBuiltInZoomControls(true)
        mapView.setMultiTouchControls(true)


        // Set default zoom level and center the map
        val mapController = mapView.controller
        mapController.setZoom(15.0)

        // Set a point to center the map (Cologne, Germany)
        val startPoint = GeoPoint(50.9375, 6.9603) // Cologne coordinates
        mapController.setCenter(startPoint)





        // Marker 1: Universitäts- und Stadtbibliothek Köln (University and City Library of Cologne)
        val libraryPoint = GeoPoint(50.9271, 6.9284)
        val libraryMarker = Marker(mapView)
        libraryMarker.position = libraryPoint
        libraryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        libraryMarker.title = getString(R.string.university_and_city_library_of_cologne)
        val libraryIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_menu_book_24) // Optional custom icon
        libraryMarker.icon = libraryIcon
        mapView.overlays.add(libraryMarker)

        // Marker 2: Stadtbibliothek Köln
        val cityLibraryPoint = GeoPoint( 50.93713428306219,6.9565667288377995)

        val cityLibraryMarker = Marker(mapView)
        cityLibraryMarker.position = cityLibraryPoint
        cityLibraryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        cityLibraryMarker.title = getString(R.string.city_library_cologne)
        val cityLibraryIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_menu_book_24) // Optional custom icon
        cityLibraryMarker.icon = cityLibraryIcon
        mapView.overlays.add(cityLibraryMarker)

        // Marker 3: Hochschulbibliothek der Technischen Hochschule Köln
        val universityLibraryPoint = GeoPoint( 50.935628880486234, 6.987619554219265)

        val universityLibraryMarker = Marker(mapView)
        universityLibraryMarker.position = universityLibraryPoint
        universityLibraryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        universityLibraryMarker.title =
            getString(R.string.university_library_of_the_cologne_university_of_applied_sciences)
        val universityLibraryIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_menu_book_24) // Optional custom icon
        universityLibraryMarker.icon = universityLibraryIcon
        mapView.overlays.add(universityLibraryMarker)


        // Marker 4 : Bistro / Phil Café
        val bistroPoint = GeoPoint(  50.92823562318384, 6.927729457672513)

        val bistroMarker = Marker(mapView)
        bistroMarker.position = bistroPoint
        bistroMarker.title = "Bistro / Phil Café"
        val bistroIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_coffee_24) // Custom icon for Bistro
        bistroMarker.icon = bistroIcon
        bistroMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(bistroMarker)

        // Marker 5 : Holtz und Kupfer

        val holtzPoint = GeoPoint(   50.92332052289942,  6.9251384057814676)

        val holtzMarker = Marker(mapView)
        holtzMarker.position = holtzPoint
        holtzMarker.title = getString(R.string.holtz_und_kupfer)
        val holtzIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_coffee_24) // Custom icon for Bistro
        holtzMarker.icon = holtzIcon
        holtzMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(holtzMarker)

        // Marker 6 : The Coffice

        val cofficePoint = GeoPoint(   50.94313537588033,   6.9715623460902805)

        val cofficeMarker = Marker(mapView)
        cofficeMarker.position = cofficePoint
        cofficeMarker.title = "The Coffice"
        val cofficeIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_coffee_24) // Custom icon for Bistro
        cofficeMarker.icon = cofficeIcon
        cofficeMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(cofficeMarker)



        // Marker 7 : work hub cologne

        val hubPoint = GeoPoint(    50.93656062830124,   6.933671113987998)

        val hubMarker = Marker(mapView)
        hubMarker.position = hubPoint
        hubMarker.title = " Work Hub Cologne"
        val hubIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_groups_24) // Custom icon for Bistro
        hubMarker.icon = hubIcon
        hubMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(hubMarker)


        //Marker 8:Design Offices Köln Gereon

        val desPoint = GeoPoint(    50.94381911337604,   6.944316105110943)

        val desMarker = Marker(mapView)
        desMarker.position = desPoint
        desMarker.title = "Design Offices Cologne Gereon"
        val desIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.baseline_groups_24) // Custom icon for Bistro
        desMarker.icon = desIcon
        desMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(desMarker)







        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_map
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Home::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_map -> return@setOnItemSelectedListener true
                R.id.bottom_notes -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            NotesActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_Timer -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            TimerActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }














    }


    //map functions

    override fun onResume() {
        super.onResume()
        mapView.onResume() // needed for compass, my location overlays, etc.
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()  // needed for compass, my location overlays, etc.
    }













}