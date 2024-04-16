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
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentVereinBinding

class VereinFragment : Fragment() {

    private lateinit var binding: FragmentVereinBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVereinBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSenden.setOnClickListener {
            val name = binding.tietName.text.toString()
            val email = binding.tietEmail.text.toString()
            val nachricht = binding.tietNachricht.text.toString()

            if (name.isNotBlank() &&
                email.isNotBlank() &&
                nachricht.isNotBlank() &&
                binding.checkBox.isChecked) {
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("janmorgenweck@hotmail.com"))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nachricht von $name")
                intent.putExtra(Intent.EXTRA_TEXT, "Name: $name\nE-Mail: $email\nNachricht: $nachricht\nDatenschutzerklärung: check️")


                if (intent.resolveActivity(requireActivity().packageManager) != null) {
                    startActivity(intent)
                    binding.tietName.text!!.clear()
                    binding.tietEmail.text!!.clear()
                    binding.tietNachricht.text!!.clear()
                    binding.checkBox.isChecked = false

                } else {
                     Toast.makeText(requireContext(), "Es wurde keine E-Mail-App gefunden.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(requireContext(), "Es müssen alle Felder ausgefüllt werden.", Toast.LENGTH_SHORT).show()
            }

        }

        binding.ivLogo.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")
        binding.llMitgliedWerden.setOnClickListener {
            findNavController().navigate(R.id.mitgliedWerdenFragment)
        }

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }
    }
}
