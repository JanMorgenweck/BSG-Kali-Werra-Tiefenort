package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentStartseiteBinding


class StartseiteFragment : Fragment() {

    private lateinit var binding: FragmentStartseiteBinding
    private val viewModel: FirebaseViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartseiteBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.LogoHome.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")
        binding.ivVereinsLogos.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Grafik_Kali-Wappen_Tradition-seit-1913.webp?alt=media&token=924b1ff6-74e8-4057-994f-b2fad6326d05")


        // currentUser LiveData aus dem ViewModel wird beobachtet
        // Wenn currentUser gleich null (also der User nicht mehr eingeloggt ist) wird zum LoginFragment navigiert
        viewModel.currentUser.observe(viewLifecycleOwner) {
            if (it == null) {
                findNavController().navigate(R.id.loginFragment)
            }
        }

        binding.onlineShop.setOnClickListener {
            val url = "https://kali-werra-shop.de"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        binding.facebook.setOnClickListener {
            val fbUrl = "https://www.facebook.com/FSVKaliWerraTiefenort/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fbUrl))
            startActivity(intent)
        }

        binding.fussballde.setOnClickListener {
            val fdeUrl =
                "https://www.fussball.de/verein/fsv-kali-werra-tiefenort-thueringen/-/id/00ES8GNC5C00008NVV0AG08LVUPGND5I#!/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fdeUrl))
            startActivity(intent)
        }

        binding.instagram.setOnClickListener {
            val instUrl = "https://www.instagram.com/kali_werra_tiefenort/?hl=de"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instUrl))
            startActivity(intent)
        }

        binding.neuigkeiten.setOnClickListener {
            findNavController().navigate(R.id.neuigkeitenFragment)
        }

        binding.verein.setOnClickListener {
            findNavController().navigate(R.id.vereinFragment)
        }

        binding.mannschaften.setOnClickListener {
            findNavController().navigate(R.id.mannschaftFragment)
        }

        binding.ueberUns.setOnClickListener {
            findNavController().navigate(R.id.ueberUnsFragment)
        }

        binding.Sponsoren.setOnClickListener {
            findNavController().navigate(R.id.sponsorenFragment)
        }

        binding.Impressum.setOnClickListener {
            showDialogImpressum()
        }

        binding.datenschutz.setOnClickListener {
            showDialogDatenschutz()

        }

        binding.kontakt.setOnClickListener {
            showDialogKontakte()
        }

        binding.ivMenu.setOnClickListener {
            showPopupMenu()
        }

        (activity as MainActivity).binding.toolbar.isGone = true
    }

    private fun showDialogDatenschutz(){
        val dialog = DatenschutzFragment.newInstance()
        dialog.show(childFragmentManager,"DatenschutzFragment")
    }
    private fun showDialogKontakte() {
        val dialog = KontaktDialogFragment.newInstance()
        dialog.show(childFragmentManager, "KontaktDialogFragment")
    }

    private fun showDialogImpressum() {
        val dialog = ImpressumDialogFragment.newInstance()
        dialog.show(childFragmentManager, "ImpressumDialogFragment")
    }

    private fun showPopupMenu(){
        val popupMenu = PopupMenu(requireContext(),binding.ivMenu)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.action_startseite -> {
                    findNavController().navigate(R.id.startseiteFragment)
                    true
                }
                R.id.action_Neuigkeiten -> {
                    findNavController().navigate(R.id.neuigkeitenFragment)
                    true
                }
                R.id.action_verein -> {
                    findNavController().navigate(R.id.vereinFragment)
                    true
                }
                R.id.action_manschaften -> {
                    findNavController().navigate(R.id.mannschaftFragment)
                    true
                }
                R.id.action_ueberUns -> {
                    findNavController().navigate(R.id.ueberUnsFragment)
                    true
                }
                R.id.action_sponsorenPartner -> {
                    findNavController().navigate(R.id.sponsorenFragment)
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