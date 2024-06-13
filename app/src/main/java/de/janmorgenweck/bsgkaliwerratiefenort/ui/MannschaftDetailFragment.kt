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
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentDetailMannschaftBinding
import de.janmorgenweck.bsgkaliwerratiefenort.data.Datasource

class MannschaftDetailFragment:Fragment() {

    private lateinit var binding: FragmentDetailMannschaftBinding
    private var datasource = Datasource().loadMannschaften()
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
            val fdeUrl = (activity as MainActivity).datasource[position].link
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

        (activity as MainActivity).binding.toolbar.isGone = false
    }
}