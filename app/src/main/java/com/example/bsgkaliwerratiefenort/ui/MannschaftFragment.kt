package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.R
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentMannschaftBinding
import de.janmorgenweck.bsgkaliwerratiefenort.Adapter.MannschaftsAdapter
import de.janmorgenweck.bsgkaliwerratiefenort.data.Datasource


class MannschaftFragment : Fragment() {

    private lateinit var binding: FragmentMannschaftBinding
    private var datasource = Datasource().loadMannschaften()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMannschaftBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.recyclerView.adapter = MannschaftsAdapter(datasource)

        val originalText = getString(R.string.Mannschaften_Einleitung_Kurz)
        val fullText = getString(R.string.Mannschaften_Einleitung)
        var isExpanded = false

        binding.textView6.text = originalText

        binding.textView6.setOnClickListener {
            isExpanded = !isExpanded
            binding.textView6.text = if (isExpanded) fullText else originalText
        }
        (activity as MainActivity).binding.toolbar.isGone = false
    }

}