package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.databinding.FragmentEhrenamtStellenBinding

class EhrenamtStellenFragment : Fragment() {

    private lateinit var binding: FragmentEhrenamtStellenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEhrenamtStellenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).binding.toolbar.isGone = false

        binding.tvSB6.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.dfb.de/schiedsrichter/interessentin/artikel/wie-werde-ich-schiedsrichter-345/")
                )
            )
        }

        binding.btnSenden.setOnClickListener {
            val name = binding.tietName.text.toString()
            val email = binding.tietEmail.text.toString()
            val taetigkeit = binding.tietTaetigkeit.text.toString()
            val nachricht = binding.tietNachricht.text.toString()

            if (name.isNotBlank() &&
                email.isNotBlank() &&
                taetigkeit.isNotBlank() &&
                nachricht.isNotBlank() &&
                binding.checkBox.isChecked
            ) {
                // Validate email
                if (!email.contains("@")) {
                    Toast.makeText(requireContext(), "Bitte geben Sie eine gültige E-Mail-Adresse ein.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("janmorgenweck@hotmail.com"))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nachricht von $name")
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Name: $name\nE-Mail: $email\nTätigkeit: $taetigkeit\nNachricht: $nachricht\nDatenschutzerklärung: check️"
                )

                if (intent.resolveActivity(requireActivity().packageManager) != null) {
                    startActivity(intent)
                    binding.tietName.text!!.clear()
                    binding.tietEmail.text!!.clear()
                    binding.tietTaetigkeit.text!!.clear()
                    binding.tietNachricht.text!!.clear()
                    binding.checkBox.isChecked = false

                } else {
                    Toast.makeText(
                        requireContext(),
                        "Es wurde keine E-Mail-App gefunden.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(
                    requireContext(),
                    "Es müssen alle Felder ausgefüllt werden.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
