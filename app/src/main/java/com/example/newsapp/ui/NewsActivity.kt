package com.example.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.newsapp.R
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.databinding.ActivityNewsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)?.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController!!)

    }
}