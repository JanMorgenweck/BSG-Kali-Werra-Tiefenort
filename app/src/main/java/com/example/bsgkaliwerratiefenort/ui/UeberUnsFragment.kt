package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.MediaController
import android.widget.PopupMenu
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentUeberUnsBinding


class UeberUnsFragment : Fragment() {

    private lateinit var binding: FragmentUeberUnsBinding
    private lateinit var mediaController: MediaController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUeberUnsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.svUeberUns.post {
            binding.svUeberUns.scrollTo(0,0)
        }

        binding.ivStadionUmbau1.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild15-Kopie.jpg?alt=media&token=f810e9a0-5ba0-40cf-8788-f284a7785db0")
        binding.ivStadionUmbau1.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Bild15-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau2.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild7-Kopie.jpg?alt=media&token=a3904bae-9ef5-49ce-968e-a707f342f213")
        binding.ivStadionUmbau2.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Bild7-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau3.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild13-Kopie.jpg?alt=media&token=95c5d4a8-57ef-4071-936d-2b421fd36ea3")
        binding.ivStadionUmbau3.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Bild13-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau4.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild5-Kopie.jpg?alt=media&token=d8ddedb8-f401-477e-bf79-f99912d0b3c6")
        binding.ivStadionUmbau4.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Bild5-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau5.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2F122117350_3446027548806393_7339724700147987888_n-Kopie.jpeg?alt=media&token=bb7f6401-743e-488f-9df8-4fe5bf7c7359")
        binding.ivStadionUmbau5.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/122117350_3446027548806393_7339724700147987888_n-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau6.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2F122164055_980629602420074_1064451657179761445_n-Kopie.jpeg?alt=media&token=138f6707-2f89-4580-9ec5-cb13503dd902")
        binding.ivStadionUmbau6.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/122164055_980629602420074_1064451657179761445_n-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau7.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FUmbau2-Kopie.jpeg?alt=media&token=cdf61203-f1cc-4b32-8b88-065f05a9d821")
        binding.ivStadionUmbau7.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Umbau2-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau8.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FUmbau-Kaffeetaelchen-Kopie.jpeg?alt=media&token=70162138-851c-45b7-a252-def4fecc008b")
        binding.ivStadionUmbau8.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/Umbau-Kaffeeta%CC%88lchen-Kopie.jpeg")
                )
            )
        }
        binding.ivStadionUmbau9.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2Fpicture-1600.jpeg?alt=media&token=691ccd81-c086-49b2-b3a7-43fb62c1a99c")
        binding.ivStadionUmbau9.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://kali-werra.de/wp-content/uploads/2022/09/picture-1600.jpeg")
                )
            )
        }

        val videoUri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Videos%2FKali%20Werra%20Tiefenort%20-%20Oldiespiel%20zur%20Jahrfeier%202012.mp4?alt=media&token=88d34e52-c334-42ea-9d0e-6122d33d150a")
        binding.vvFundstueck.setVideoURI(videoUri)
        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.vvFundstueck)
        binding.vvFundstueck.setMediaController(mediaController)

        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(48, 48, 48, 48)
        mediaController.layoutParams = params

        val videoUri110Jahre =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Videos%2F110JahreKaliWerra.mp4?alt=media&token=f7692c30-4eb0-4548-b287-7fbe29d730a5")
        binding.vv110Jahre.setVideoURI(videoUri110Jahre)
        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.vv110Jahre)
        binding.vv110Jahre.setMediaController(mediaController)

        val params1 = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params1.setMargins(48, 48, 48, 0)
        mediaController.layoutParams = params


        val videoUriU17Bundesliga =
            Uri.parse("https://58de7a369a9c4.streamlock.net/vod/_definst_/3q/videos/43/2024/04/a7782d002781ac71d9de259cc165d065bc930d3d.mp4/playlist.m3u8")
        binding.vvBundesligaU17.setVideoURI(videoUriU17Bundesliga)
        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.vvBundesligaU17)
        binding.vvBundesligaU17.setMediaController(mediaController)
        val params2 = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params2.setMargins(48, 48, 48, 48)
        mediaController.layoutParams = params


        (activity as MainActivity).binding.toolbar.isGone = false
    }
}