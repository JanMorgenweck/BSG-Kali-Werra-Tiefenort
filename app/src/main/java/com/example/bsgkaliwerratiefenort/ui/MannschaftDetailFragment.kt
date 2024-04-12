package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentDetailMannschaftBinding
import com.example.kaliwerra.data.Datasource

class MannschaftDetailFragment:Fragment() {

    private lateinit var binding: FragmentDetailMannschaftBinding
    var datasource = Datasource().loadMannschaften()

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

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }
    }


}