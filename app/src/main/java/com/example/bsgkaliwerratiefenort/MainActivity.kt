package com.example.bsgkaliwerratiefenort

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.databinding.ActivityMainBinding
import com.example.kaliwerra.data.Datasource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    var datasource = Datasource().loadMannschaften()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backround.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra_KONTUR-1646x2048.jpg?alt=media&token=73dba061-e69f-41ac-a7cb-808632ea5008")
        handleOnBackPressed()

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    private fun handleOnBackPressed() {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                binding.fragmentContainerView.findNavController().navigateUp()
            }
        }
        onBackPressedDispatcher.addCallback(callback)
    }
}