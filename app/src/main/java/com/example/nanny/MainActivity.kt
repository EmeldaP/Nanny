package com.example.nanny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val draw = findViewById<DrawerLayout>(R.id.drawer_layout)
        val  nav = findViewById<NavigationView>(R.id.nav)
       // nav.setNavigationItemSelectedListener(this)


    }

    override fun onBackPressed() {
     val   drawer  = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }
        else{
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when (item.itemId){
           R.id.setting->{
               val  intent = Intent (this,SettingActivity::class.java)
               startActivity(intent)
               true

           }
           R.id.profile ->{
               val  intent = Intent (this,ProfileActivity::class.java)
               startActivity(intent)
               return true
           }
           else -> super.onOptionsItemSelected(item)
       }

    }
}