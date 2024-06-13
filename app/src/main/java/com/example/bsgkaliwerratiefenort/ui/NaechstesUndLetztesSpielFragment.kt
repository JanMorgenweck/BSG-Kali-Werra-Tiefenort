package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.FirebaseViewModel
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentNaechstesUndLetztesSpielBinding

class NaechstesUndLetztesSpielFragment : Fragment() {

    private lateinit var binding: FragmentNaechstesUndLetztesSpielBinding
    private val viewModel: FirebaseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNaechstesUndLetztesSpielBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        binding.tvMannschaftsName.text = (activity as MainActivity).datasource[position!!].name
        (activity as MainActivity).binding.toolbar.isGone = false

        viewModel.clearMatches()

//        // Setze die UI-Komponenten für die Spiele zurück
//        resetUI()
//        resetNextMatchUI()

        viewModel.lastMatch.observe(viewLifecycleOwner) { match ->
            resetUI()
            if (match != null) {
                binding.tvDate.text = match.matchDateTime
                binding.teamCrest.load(match.team1.teamIconUrl)
                binding.teamName.text = match.team1.teamName
                binding.tvPointsTeam1.text =
                    match.matchResults.firstOrNull { it.resultName == "Endergebnis" }?.pointsTeam1.toString()
                binding.tvPointsTeam2.text =
                    match.matchResults.firstOrNull { it.resultName == "Endergebnis" }?.pointsTeam2.toString()
                binding.teamName2.text = match.team2.teamName
                binding.teamCrest2.load(match.team2.teamIconUrl)
                binding.tvSpielortStadion.text = match.location.locationStadium
                binding.tvSpielort.text = match.location.locationCity
            }
        }

        viewModel.nextMatch.observe(viewLifecycleOwner) { match ->
            resetNextMatchUI()
            if (match != null) {
                binding.tvDateNextMatch.text = match.matchDateTime
                binding.teamCrestNextMatch.load(match.team1.teamIconUrl)
                binding.teamNameNextMatch.text = match.team1.teamName

                if (match.matchIsFinished) {
                    binding.tvPointsTeam1NextMatch.text =
                        match.matchResults.first { it.resultName == "Endergebnis" }.pointsTeam1.toString()
                    binding.tvPointsTeam2NextMatch.text =
                        match.matchResults.first { it.resultName == "Endergebnis" }.pointsTeam2.toString()
                } else {
                    binding.tvPointsTeam1NextMatch.text = "-"
                    binding.tvPointsTeam2NextMatch.text = "-"
                }

                binding.teamName2NextMatch.text = match.team2.teamName
                binding.teamCrest2NextMatch.load(match.team2.teamIconUrl)
                binding.tvSpielortStadionNextMatch.text = match.location.locationStadium
                binding.tvSpielortNextMatch.text = match.location.locationCity
            }
        }
    }

    private fun resetUI() {
        // Setze die UI-Komponenten für das letzte Spiel zurück
        binding.tvDate.text = ""
        binding.teamCrest.setImageResource(android.R.color.transparent)
        binding.teamName.text = ""
        binding.tvPointsTeam1.text = ""
        binding.tvPointsTeam2.text = ""
        binding.teamName2.text = ""
        binding.teamCrest2.setImageResource(android.R.color.transparent)
        binding.tvSpielort.text = ""
        binding.tvSpielortStadion.text = ""
    }

    private fun resetNextMatchUI() {
        // Setze die UI-Komponenten für das nächste Spiel zurück
        binding.tvDateNextMatch.text = ""
        binding.teamCrestNextMatch.setImageResource(android.R.color.transparent)
        binding.teamNameNextMatch.text = ""
        binding.tvPointsTeam1NextMatch.text = ""
        binding.tvPointsTeam2NextMatch.text = ""
        binding.teamName2NextMatch.text = ""
        binding.teamCrest2NextMatch.setImageResource(android.R.color.transparent)
        binding.tvSpielortNextMatch.text = ""
        binding.tvSpielortStadionNextMatch.text = ""
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.clearMatches()
    }
}
