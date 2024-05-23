package com.example.bsgkaliwerratiefenort.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import coil.load
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.data.model.Profile
import com.example.bsgkaliwerratiefenort.databinding.FragmentProfilBinding


class ProfilFragment : Fragment() {

    private lateinit var binding: FragmentProfilBinding
    private val viewModel: FirebaseViewModel by activityViewModels()
    private val selectImageLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                data?.data?.let { uri ->
                    binding.ivProfilePicture.setImageURI(uri)

                    viewModel.uploadImage(uri)
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfilBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.profileRef.addSnapshotListener { value, error ->
            if (error == null && value != null) {
                val myProfile = value.toObject(Profile::class.java)
                if (myProfile != null) {
                    binding.tvFirstName.setText(myProfile.firstName)
                }
                if (myProfile != null) {
                    binding.tvLastName.setText(myProfile.lastName)
                }
                if (myProfile != null) {
                    binding.ivProfilePicture.load(myProfile.profilePicture)
                }
            }
        }

        binding.ibProfilePictureEdit.setOnClickListener {
            selectImage()
        }
        binding.btSave.setOnClickListener {
            val firstName = binding.tvFirstName.text.toString()
            val lastName = binding.tvLastName.text.toString()
            val profilePicUri = viewModel.profilePictureUri.value

            if (firstName.isNotEmpty() && lastName.isNotEmpty()) {
                val newProfile = Profile(firstName, lastName, profilePicUri.toString())
                viewModel.updateProfile(newProfile)
                viewModel.updateProfilePicture()
            }
        }
        viewModel.currentUser.observe(viewLifecycleOwner) { user ->
            user?.let {
                binding.tvEmail.text = it.email
            }
        }
        (activity as MainActivity).binding.toolbar.isGone = false
    }


    private fun selectImage() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        selectImageLauncher.launch(intent)
    }
}