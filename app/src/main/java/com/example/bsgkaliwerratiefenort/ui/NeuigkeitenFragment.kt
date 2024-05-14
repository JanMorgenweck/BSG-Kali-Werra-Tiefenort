package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.Adapter.NewsAdapter
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.data.model.News
import com.example.bsgkaliwerratiefenort.databinding.FragmentNeuigkeitenBinding
import com.example.kaliwerra.data.Datasource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QueryDocumentSnapshot


class NeuigkeitenFragment : Fragment() {

    private lateinit var binding: FragmentNeuigkeitenBinding
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNeuigkeitenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoToolbar.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")


        getNewsFromFirestore()

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

    private fun getNewsFromFirestore() {
        val db = FirebaseFirestore.getInstance()
        val newsCollection = db.collection("news")

        newsCollection
            .orderBy("date", Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { documents ->
                val newsList = mutableListOf<QueryDocumentSnapshot>()
                for (document in documents) {
                    newsList.add(document)
                }
                setupRecyclerView(newsList)
            }
            .addOnFailureListener { exception ->
                println("Error getting documents: $exception")
            }
    }

    private fun setupRecyclerView(newsList: MutableList<QueryDocumentSnapshot>) {
        newsAdapter = NewsAdapter(newsList)
        binding.rvNews.adapter = newsAdapter
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


}