package de.janmorgenweck.bsgkaliwerratiefenort

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.PopupMenu
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.ActivityMainBinding
import de.janmorgenweck.bsgkaliwerratiefenort.data.Datasource
import de.janmorgenweck.bsgkaliwerratiefenort.R

class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    var datasource = Datasource().loadMannschaften()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backround.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra_KONTUR-1646x2048.jpg?alt=media&token=73dba061-e69f-41ac-a7cb-808632ea5008")
        handleOnBackPressed()

        binding.logoToolbar.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")

        binding.arrowBack.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.startseiteFragment)
        }

        binding.ivMenu.setOnClickListener {
            showPopupMenu()
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    private fun handleOnBackPressed() {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val currentDestination = binding.fragmentContainerView.findNavController().currentDestination
                if (currentDestination?.id == R.id.startseiteFragment){
                    finish()
                }else {
                    binding.fragmentContainerView.findNavController().navigateUp()
                }
            }
        }
        onBackPressedDispatcher.addCallback(callback)
    }

    private fun showPopupMenu(){
        val popupMenu = PopupMenu(this,binding.ivMenu)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.action_startseite -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.startseiteFragment)
                    true
                }
                R.id.action_Neuigkeiten -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.neuigkeitenFragment)
                    true
                }
                R.id.action_verein -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.vereinFragment)
                    true
                }
                R.id.action_manschaften -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.mannschaftFragment)
                    true
                }
                R.id.action_ueberUns -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.ueberUnsFragment)
                    true
                }
                R.id.action_sponsorenPartner -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.sponsorenFragment)
                    true
                }
                R.id.action_onlineShop -> {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://kali-werra-shop.de"))
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
        popupMenu.show()
    }

}