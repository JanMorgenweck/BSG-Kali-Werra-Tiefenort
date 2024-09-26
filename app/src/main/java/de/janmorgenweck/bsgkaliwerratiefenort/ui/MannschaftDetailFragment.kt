package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.FirebaseViewModel
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.data.model.FirestoreDatasource
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentDetailMannschaftBinding

class MannschaftDetailFragment:Fragment() {

    private lateinit var binding: FragmentDetailMannschaftBinding
    private val firebaseDatasource = FirestoreDatasource()
    private val viewModel: FirebaseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailMannschaftBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        firebaseDatasource.loadMannschaften { mannschaften ->
            if (mannschaften != null && position != null && position < mannschaften.size) {
                val mannschaft = mannschaften[position]

                binding.tvMannschaftsName.text = mannschaft.name
                binding.ivMannschaftsImage.load(mannschaft.image)
                binding.tvMannschaftsInfos.text = mannschaft.info
                binding.tvEmail.text = mannschaft.email
                binding.tvFussballde.text = mannschaft.fbde

                binding.tvEmail.setOnClickListener {
                    val email = mannschaft.email
                    val intent = Intent(Intent.ACTION_SEND).apply {
                        type = "message/rfc822"
                        putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                    }
                    if (intent.resolveActivity(requireActivity().packageManager) != null) {
                        startActivity(Intent.createChooser(intent, "E-Mail senden"))
                    } else {
                        Toast.makeText(
                            requireContext(),
                            "Keine geeignete App gefunden",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                binding.tvFussballde.setOnClickListener {
                    val fdeUrl = mannschaft.link
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fdeUrl))
                    startActivity(intent)
                }


                binding.tvTabelle.setOnClickListener {
                    viewModel.loadMannschaften(mannschaft.leagueShortcut, mannschaft.leagueSeason)
                    findNavController().navigate(
                        MannschaftDetailFragmentDirections.actionMannschaftDetailFragmentToTabelleFragment(
                            position
                        )
                    )

                }

                binding.tvSpiele.setOnClickListener {
                    viewModel.loadLastMatch(mannschaft.leagueId, mannschaft.teamId)
                    viewModel.loadNextMatch(mannschaft.leagueId, mannschaft.teamId)
                    findNavController().navigate(
                        MannschaftDetailFragmentDirections.actionMannschaftDetailFragmentToNaechstesUndLetztesSpielFragment(
                            position
                        )
                    )
                }

                (activity as MainActivity).binding.toolbar.isGone = false
            }
        }
    }
}