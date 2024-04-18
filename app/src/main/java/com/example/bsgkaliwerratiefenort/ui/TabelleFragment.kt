package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.Adapter.TabelleAdapter
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.ViewModel
import com.example.bsgkaliwerratiefenort.data.model.MannschaftAPI

import com.example.bsgkaliwerratiefenort.databinding.FragmentTabelleBinding
import com.example.kaliwerra.data.Datasource


class TabelleFragment : Fragment() {

    private lateinit var binding: FragmentTabelleBinding
    private val viewModel: ViewModel by activityViewModels()
    var datasource = Datasource().loadMannschaften()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabelleBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        viewModel.mannschaften.observe(viewLifecycleOwner){
            binding.recyclerView.adapter = TabelleAdapter(it)
        }

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }

        binding.tvMannschaftsName.text = (activity as MainActivity).datasource[position!!].name
    }


}