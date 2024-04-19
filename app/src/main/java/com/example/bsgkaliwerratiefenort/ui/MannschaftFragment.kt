package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentMannschaftBinding
import com.example.kaliwerra.Adapter.MannschaftsAdapter
import com.example.kaliwerra.data.Datasource


class MannschaftFragment : Fragment() {

    private lateinit var binding: FragmentMannschaftBinding
    var datasource = Datasource().loadMannschaften()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMannschaftBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.logoToolbar.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")

        binding.recyclerView.adapter = MannschaftsAdapter(datasource)

        val originalText = getString(R.string.Mannschaften_Einleitung_Kurz)
        val fullText = getString(R.string.Mannschaften_Einleitung)
        var isExpanded = false

        binding.textView6.text = originalText

        binding.textView6.setOnClickListener {
            isExpanded = !isExpanded
            binding.textView6.text = if (isExpanded) fullText else originalText
        }

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }
    }

}