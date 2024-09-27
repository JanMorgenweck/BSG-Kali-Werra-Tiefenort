package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.R
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentWelcomeBinding



class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private val handler = Handler(Looper.getMainLooper())
    private val navigateRunnable = Runnable {
        // Sicherstellen, dass das Fragment noch an den NavController gebunden ist, bevor navigiert wird
        if (isAdded && findNavController().currentDestination?.id == R.id.welcomeFragment) {
            findNavController().navigate(R.id.startseiteFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 3 Sekunden Verzögerung, bevor zur Startseite navigiert wird
        handler.postDelayed(navigateRunnable, 3000)

        // Toolbar ausblenden
        (activity as MainActivity).binding.toolbar.isGone = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Handler-Callbacks entfernen, um Memory Leaks zu vermeiden
        handler.removeCallbacks(navigateRunnable)
    }
}