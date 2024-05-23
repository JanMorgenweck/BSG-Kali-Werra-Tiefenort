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
import com.example.bsgkaliwerratiefenort.databinding.FragmentPasswordForgottenBinding

class PasswordForgottenFragment : Fragment() {

private lateinit var binding: FragmentPasswordForgottenBinding
private val viewModel: FirebaseViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPasswordForgottenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSendEmailPasswordReset.setOnClickListener {
            val email = binding.tietEmailPasswordReset.text.toString()

            if (email.isNotBlank()){
                viewModel.sendPasswordReset(email)
            } else {
                Toast.makeText(requireContext(), "Bitte Email eingeben!!", Toast.LENGTH_LONG).show()

            }
        }

        binding.btBackToLogin.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
    }


}