package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.R
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentKontakteBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class KontaktDialogFragment : DialogFragment(), OnMapReadyCallback, GoogleMap.OnMapLoadedCallback {


    private lateinit var mapView: MapView
    private lateinit var googleMap: GoogleMap


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
    ): View {
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


//        val imageURL =
//            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Bildschirmfoto%202024-04-15%20um%2011.16.00.png?alt=media&token=1046f0d4-1ffa-4ff3-9162-c49bc69f350b"
//        binding.ivAnfahrt.load(imageURL)


        val imageUrl = "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Von-der-Bahn-ins-Kaffeetaelchen.jpg?alt=media&token=ba0ddec0-5140-4409-90be-a892a87ae850"
        binding.ivAnfahrtBahn.load(imageUrl)

        binding.btnClose.setOnClickListener {
            dismiss()
        }

        mapView = binding.mapviewMap
        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        mapView.getMapAsync(this)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val location = LatLng(50.84240822531988, 10.17660949440701)
        googleMap.addMarker(MarkerOptions().position(location).title("Kaffeetälchen 3, 36469 Bad Salzungen"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 17f))
        googleMap.setOnMapLoadedCallback { this }

    }

    override fun onMapLoaded() {
        val location = LatLng(50.84240822531988 ,10.17660949440701)
        val boundsBuilder = LatLngBounds.builder()
        boundsBuilder.include(location)
        val bounds = boundsBuilder.build()
        val padding = resources.getDimensionPixelSize(R.dimen.map_padding)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, padding))
    }
}
