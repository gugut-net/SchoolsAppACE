package com.example.schoolappace1122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.schoolappace1122.di.SchoolsApp
import com.example.schoolappace1122.databinding.ActivityMainBinding

const val TAG = "NYC Schools"
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        SchoolsApp.schoolsComponent.inject(this)

        val navHost = supportFragmentManager.findFragmentById(R.id.frag_container) as NavHostFragment
        setupActionBarWithNavController(navHost.navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.frag_container).navigateUp()
    }
}