package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.MyViewModel
import com.example.bsgkaliwerratiefenort.databinding.FragmentDetailMannschaftBinding
import com.example.kaliwerra.data.Datasource

class MannschaftDetailFragment:Fragment() {

    private lateinit var binding: FragmentDetailMannschaftBinding
    var datasource = Datasource().loadMannschaften()
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailMannschaftBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        binding.tvMannschaftsName.text = (activity as MainActivity).datasource[position!!].name
        binding.ivMannschaftsImage.load(datasource[position].image)
        binding.tvMannschaftsInfos.text = (activity as MainActivity).datasource[position].info
        binding.tvEmail.text = (activity as MainActivity).datasource[position].email
        binding.tvFussballde.text = (activity as MainActivity).datasource[position].fbde

        binding.tvEmail.setOnClickListener {
            val email = (activity as MainActivity).datasource[position].email
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT).show()
            }
        }

        binding.tvFussballde.setOnClickListener {
            var fdeUrl = (activity as MainActivity).datasource[position].link
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fdeUrl))
            startActivity(intent)
        }


        binding.tvTabelle.setOnClickListener {
            viewModel.loadMannschaften(datasource[position].leagueShortcut, datasource[position].leagueSeason)
            findNavController().navigate(MannschaftDetailFragmentDirections.actionMannschaftDetailFragmentToTabelleFragment(position))

        }

        binding.tvSpiele.setOnClickListener {
            viewModel.loadLastMatch(datasource[position].leagueId, datasource[position].teamId)
            viewModel.loadNextMatch(datasource[position].leagueId,datasource[position].teamId)
            findNavController().navigate(MannschaftDetailFragmentDirections.actionMannschaftDetailFragmentToNaechstesUndLetztesSpielFragment(position))
        }

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }

        binding.ivMenu.setOnClickListener {
            showPopupMenu()
        }

        binding.tvFavoriten.setOnClickListener {
            var datasource = Datasource().loadMannschaften()
            viewModel.saveFavorite(datasource[position])
        }
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

                R.id.action_profil -> {
                    findNavController().navigate(R.id.profilFragment)
                    true
                }
                R.id.action_favoriten -> {
                    findNavController().navigate(R.id.favoritenFragment)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

}