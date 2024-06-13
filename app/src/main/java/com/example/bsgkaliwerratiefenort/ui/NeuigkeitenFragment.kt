package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bsgkaliwerratiefenort.Adapter.NewsAdapter
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.databinding.FragmentNeuigkeitenBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QueryDocumentSnapshot


class NeuigkeitenFragment : Fragment() {

    private lateinit var binding: FragmentNeuigkeitenBinding
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNeuigkeitenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).binding.toolbar.isGone = false

        getNewsFromFirestore()

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
        binding.rvNews.layoutManager = LinearLayoutManager(context)
    }
}