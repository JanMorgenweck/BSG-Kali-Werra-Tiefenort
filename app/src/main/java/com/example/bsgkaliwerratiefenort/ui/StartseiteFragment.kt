package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentKontakteBinding
import com.example.bsgkaliwerratiefenort.databinding.FragmentStartseiteBinding


class StartseiteFragment : Fragment() {

    private lateinit var binding: FragmentStartseiteBinding
    private val viewModel: FirebaseViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartseiteBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.LogoHome.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")


        // Beim Klick auf Logout, wird die Logout Funktion im ViewModel aufgerufen
        binding.btLogout.setOnClickListener {
            viewModel.logout()
        }

        // currentUser LiveData aus dem ViewModel wird beobachtet
        // Wenn currentUser gleich null (also der User nicht mehr eingeloggt ist) wird zum LoginFragment navigiert
        viewModel.currentUser.observe(viewLifecycleOwner) {
            if (it == null) {
                findNavController().navigate(R.id.loginFragment)
            }
        }

        binding.onlineShop.setOnClickListener {
            var url = "https://kali-werra-shop.de"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        binding.facebook.setOnClickListener {
            var fbUrl = "https://www.facebook.com/FSVKaliWerraTiefenort/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fbUrl))
            startActivity(intent)
        }

        binding.fussballde.setOnClickListener {
            var fdeUrl =
                "https://www.fussball.de/verein/fsv-kali-werra-tiefenort-thueringen/-/id/00ES8GNC5C00008NVV0AG08LVUPGND5I#!/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fdeUrl))
            startActivity(intent)
        }

        binding.instagram.setOnClickListener {
            var instUrl = "https://www.instagram.com/kali_werra_tiefenort/?hl=de"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instUrl))
            startActivity(intent)
        }

        binding.neuigkeiten.setOnClickListener {

        }

        binding.verein.setOnClickListener {
            findNavController().navigate(R.id.vereinFragment)
        }

        binding.mannschaften.setOnClickListener {
            findNavController().navigate(R.id.mannschaftFragment)
        }

        binding.ueberUns.setOnClickListener {

        }

        binding.Sponsoren.setOnClickListener {

        }

        binding.Impressum.setOnClickListener {
            showDialogImpressum()
        }

        binding.datenschutz.setOnClickListener {

        }

        binding.kontakt.setOnClickListener {
            showDialogKontakte()
        }
    }

    private fun showDialogKontakte() {
        val dialog = KontaktDialogFragment.newInstance()
        dialog.show(childFragmentManager, "KontaktDialogFragment")
    }

    private fun showDialogImpressum() {
        val dialog = ImpressumDialogFragment.newInstance()
        dialog.show(childFragmentManager, "ImpressumDialogFragment")
    }


}