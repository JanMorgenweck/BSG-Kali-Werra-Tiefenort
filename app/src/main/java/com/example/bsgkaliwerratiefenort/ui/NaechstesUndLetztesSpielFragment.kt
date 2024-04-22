package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.MyViewModel
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.data.model.Match
import com.example.bsgkaliwerratiefenort.databinding.FragmentNaechstesUndLetztesSpielBinding
import kotlinx.coroutines.launch


class NaechstesUndLetztesSpielFragment : Fragment() {

    private lateinit var binding: FragmentNaechstesUndLetztesSpielBinding
    private val viewModel: MyViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNaechstesUndLetztesSpielBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        viewModel.lastMatch.observe(viewLifecycleOwner) { match ->
            binding.tvDate.text = match.matchDateTime
            binding.teamCrest.load(match.team1.teamIconUrl)
            binding.teamName.text = match.team1.teamName
            binding.tvPointsTeam1.text =
                match.matchResults.firstOrNull { it.resultName == "Endergebnis" }?.pointsTeam1.toString()
            binding.tvPointsTeam2.text =
                match.matchResults.firstOrNull { it.resultName == "Endergebnis" }?.pointsTeam2.toString()
            binding.teamName2.text = match.team2.teamName
            binding.teamCrest2.load(match.team2.teamIconUrl)
        }

        viewModel.nextMatch.observe(viewLifecycleOwner) { match ->
            binding.tvDateNextMatch.text = match.matchDateTime
            binding.teamCrestNextMatch.load(match.team1.teamIconUrl)
            binding.teamNameNextMatch.text = match.team1.teamName
            if (match.matchIsFinished){
            binding.tvPointsTeam1NextMatch.text =
                match.matchResults.first{ it.resultName == "Endergebnis" }.pointsTeam1.toString()
            binding.tvPointsTeam2NextMatch.text =
                match.matchResults.first{ it.resultName == "Endergebnis" }.pointsTeam2.toString()
            } else{
                binding.tvPointsTeam1NextMatch.text = "-"
                binding.tvPointsTeam2NextMatch.text = "-"
            }
            binding.teamName2NextMatch.text = match.team2.teamName
            binding.teamCrest2NextMatch.load(match.team2.teamIconUrl)

        }
        binding.tvMannschaftsName.text = (activity as MainActivity).datasource[position!!].name

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }

        binding.ivMenu.setOnClickListener {
            showPopupMenu()
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