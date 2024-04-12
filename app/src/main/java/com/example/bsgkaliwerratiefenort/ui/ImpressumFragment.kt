package com.example.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.bsgkaliwerratiefenort.databinding.FragmentImpressumBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import org.jsoup.Jsoup
import java.io.IOException


class ImpressumFragment : Fragment() {
    private lateinit var binding: FragmentImpressumBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentImpressumBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            fetchData()
    }

    private fun fetchData(){
        GlobalScope.launch (Dispatchers.IO){
            try {
                val document =
                    Jsoup.connect("https://kali-werra.de/impressum/")
                        .get()
                val words = document.text()
                updateUI(words)
            } catch (e:IOException){
                e.printStackTrace()
                updateUI("Failed to fetch data")
            }
        }
    }

    private fun updateUI(words: String) {
        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.Main) {
            binding.webview.loadData(words, "text/html", "UTF-8")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Cancel ongoing coroutines when the Fragment's view is destroyed
        viewLifecycleOwner.lifecycleScope.cancel()
    }
}