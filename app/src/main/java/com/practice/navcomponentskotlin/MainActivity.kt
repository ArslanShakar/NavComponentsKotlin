package com.practice.navcomponentskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val navController = findNavController(R.id.nav_host_fragment_container)
        bottom_navigation_view?.let {
            NavigationUI.setupWithNavController(it, navController)
        }

        navigation_view?.let {
            //attach the nav drawer icon with the toolbar
            NavigationUI.setupWithNavController(
                toolbar,
                navController,
                drawer_layout
            )
            //handle the menu items click events
            NavigationUI.setupWithNavController(it, navController)
        }
    }
}
