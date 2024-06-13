package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.R
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentWelcomeBinding
import java.util.Timer
import java.util.TimerTask

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private lateinit var timer: Timer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                activity?.runOnUiThread {
                    // Hier können Sie Ihre Aktion ausführen, z.B. Navigation zum HomeFragment
                    findNavController().navigate(R.id.startseiteFragment)
                }
            }
        }, 3000) // 3 Sekunden Verzögerung

        (activity as MainActivity).binding.toolbar.isGone = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        timer.cancel() // Timer stoppen, um Memory Leaks zu vermeiden
    }
}