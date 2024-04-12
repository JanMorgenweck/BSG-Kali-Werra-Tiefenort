package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentLoginBinding
import com.example.bsgkaliwerratiefenort.databinding.FragmentWelcomeBinding


class LoginFragment : Fragment() {

private lateinit var binding: FragmentLoginBinding
private val viewModel: FirebaseViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btToRegister.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }

        binding.btSendPasswordReset.setOnClickListener {
            findNavController().navigate(R.id.passwordForgottenFragment)
        }

        binding.btLogin.setOnClickListener {
            val email = binding.tietEmail.text.toString()
            val password = binding.tietPassword.text.toString()

            if (email.isNotBlank() && password.isNotBlank()){
                viewModel.login(email,password)
            }
        }

        viewModel.currentUser.observe(viewLifecycleOwner){
            if (it != null){
                findNavController().navigate(R.id.startseiteFragment)

            }
        }
    }
}