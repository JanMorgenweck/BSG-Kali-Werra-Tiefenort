package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import coil.load
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentKontakteBinding

class KontaktDialogFragment : DialogFragment() {

    private var _binding: FragmentKontakteBinding? = null
    private val binding get() = _binding!!


    companion object {
        fun newInstance(): KontaktDialogFragment {
            return KontaktDialogFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKontakteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvEmail.setOnClickListener {
            val email = getString(R.string.kali_werra_tiefenort_outlook_de)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.tvEmail1.setOnClickListener {
            val email = getString(R.string.kali_werra_tiefenort_outlook_de)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.tvEmail2.setOnClickListener {
            val email = getString(R.string.kali_werra_tiefenort_outlook_de)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.tvEmailNachwuchs.setOnClickListener {
            val email = getString(R.string.nachwuchs_kali_werra_de)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.tvEmailSponsoring.setOnClickListener {
            val email = getString(R.string.vermarktung_kali_werra_de)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(Intent.createChooser(intent, "E-Mail senden"))
            } else {
                Toast.makeText(requireContext(), "Keine geeignete App gefunden", Toast.LENGTH_SHORT)
                    .show()
            }
        }


        val imageURL =
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Bildschirmfoto%202024-04-15%20um%2011.16.00.png?alt=media&token=1046f0d4-1ffa-4ff3-9162-c49bc69f350b"
        binding.ivAnfahrt.load(imageURL)


//        val imageUrl = "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Von-der-Bahn-ins-Kaffeetälchen.jpg?alt=media&token=7f903274-3a58-4218-8665-522eda5b4820"
//        binding.ivAnfahrtBahn.load(imageUrl)

        binding.btnClose.setOnClickListener {
            dismiss()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
