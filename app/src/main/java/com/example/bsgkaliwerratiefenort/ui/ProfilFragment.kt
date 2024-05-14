package com.example.bsgkaliwerratiefenort.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.R
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
        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }

        binding.ivMenu.setOnClickListener {
            showPopupMenu()
        }
    }
    private fun showPopupMenu(){
        val popupMenu = PopupMenu(requireContext(),binding.ivMenu)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)




        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.action_startseite -> {
                    findNavController().navigate(R.id.startseiteFragment)
                    true
                }
                R.id.action_Neuigkeiten -> {
                    findNavController().navigate(R.id.neuigkeitenFragment)
                    true
                }
                R.id.action_verein -> {
                    findNavController().navigate(R.id.vereinFragment)
                    true
                }
                R.id.action_manschaften -> {
                    findNavController().navigate(R.id.mannschaftFragment)
                    true
                }
                R.id.action_ueberUns -> {
                    findNavController().navigate(R.id.ueberUnsFragment)
                    true
                }
                R.id.action_sponsorenPartner -> {
                    findNavController().navigate(R.id.sponsorenFragment)
                    true
                }
                R.id.action_onlineShop -> {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://kali-werra-shop.de"))
                    startActivity(intent)
                    true
                }

                R.id.action_profil -> {
                    findNavController().navigate(R.id.profilFragment)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun selectImage() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        selectImageLauncher.launch(intent)
    }
}