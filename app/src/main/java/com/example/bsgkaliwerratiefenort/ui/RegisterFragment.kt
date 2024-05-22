package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.bsgkaliwerratiefenort.FirebaseViewModel

import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentLoginBinding
import com.example.bsgkaliwerratiefenort.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private val viewModel: FirebaseViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btBack.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }


        binding.btRegister.setOnClickListener {
            val email = binding.tietEmailRegister.text.toString()
            val password = binding.tietPasswordRegister.text.toString()

            if (email.isNotBlank() && password.isNotBlank()) {
                if (isValidEmail(email)) {
                    viewModel.register(email, password)
                    binding.tietEmailRegister.text!!.clear()
                    binding.tietPasswordRegister.text!!.clear()
                    Toast.makeText(
                        requireContext(),
                        "Bitte überprüfen Sie Ihre Email!",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Bitte geben Sie eine gültige E-Mail-Adresse ein.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(
                    requireContext(),
                    "Bitte füllen Sie alle Felder aus.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        viewModel.currentUser.observe(viewLifecycleOwner) {
            if (it != null) {
                findNavController().navigate(R.id.startseiteFragment)
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


}