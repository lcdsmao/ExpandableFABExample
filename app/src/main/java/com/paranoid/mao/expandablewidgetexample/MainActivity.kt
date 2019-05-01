package com.paranoid.mao.expandablewidgetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<NavigationView>(R.id.nav_view).setupWithNavController(
                findNavController(R.id.nav_host_fragment)
        )
    }
}
