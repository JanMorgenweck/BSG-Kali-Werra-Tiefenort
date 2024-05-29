package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import coil.load
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentUeberUnsBinding


class UeberUnsFragment : Fragment() {

    private lateinit var binding: FragmentUeberUnsBinding
    private lateinit var mediaController: MediaController

    private var mediaPlayer: MediaPlayer? = null
    private val hymnUrl = "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Hymne%2FKali%20Werra%20Hymne%20ohne%20zweite%20Stimme.mp3?alt=media&token=144ff020-d69b-464f-a024-41d02786ecbb"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUeberUnsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.svUeberUns.post {
            binding.svUeberUns.scrollTo(0, 0)
        }

        mediaController = MediaController(requireContext())

        setupImageView(
            binding.ivStadionUmbau1,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild15-Kopie.jpg?alt=media&token=f810e9a0-5ba0-40cf-8788-f284a7785db0",
            "https://kali-werra.de/wp-content/uploads/2022/09/Bild15-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau2,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild7-Kopie.jpg?alt=media&token=a3904bae-9ef5-49ce-968e-a707f342f213",
            "https://kali-werra.de/wp-content/uploads/2022/09/Bild7-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau3,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild13-Kopie.jpg?alt=media&token=95c5d4a8-57ef-4071-936d-2b421fd36ea3",
            "https://kali-werra.de/wp-content/uploads/2022/09/Bild13-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau4,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FBild5-Kopie.jpg?alt=media&token=d8ddedb8-f401-477e-bf79-f99912d0b3c6",
            "https://kali-werra.de/wp-content/uploads/2022/09/Bild5-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau5,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2F122117350_3446027548806393_7339724700147987888_n-Kopie.jpeg?alt=media&token=bb7f6401-743e-488f-9df8-4fe5bf7c7359",
            "https://kali-werra.de/wp-content/uploads/2022/09/122117350_3446027548806393_7339724700147987888_n-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau6,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2F122164055_980629602420074_1064451657179761445_n-Kopie.jpeg?alt=media&token=138f6707-2f89-4580-9ec5-cb13503dd902",
            "https://kali-werra.de/wp-content/uploads/2022/09/122164055_980629602420074_1064451657179761445_n-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau7,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FUmbau2-Kopie.jpeg?alt=media&token=cdf61203-f1cc-4b32-8b88-065f05a9d821",
            "https://kali-werra.de/wp-content/uploads/2022/09/Umbau2-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau8,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2FUmbau-Kaffeetaelchen-Kopie.jpeg?alt=media&token=70162138-851c-45b7-a252-def4fecc008b",
            "https://kali-werra.de/wp-content/uploads/2022/09/Umbau-Kaffeeta%CC%88lchen-Kopie.jpeg"
        )
        setupImageView(
            binding.ivStadionUmbau9,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/bilderStadion%2Fpicture-1600.jpeg?alt=media&token=691ccd81-c086-49b2-b3a7-43fb62c1a99c",
            "https://kali-werra.de/wp-content/uploads/2022/09/picture-1600.jpeg"
        )

        setupVideoView(
            binding.vvFundstueck,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Videos%2FKali%20Werra%20Tiefenort%20-%20Oldiespiel%20zur%20Jahrfeier%202012.mp4?alt=media&token=88d34e52-c334-42ea-9d0e-6122d33d150a"
        )
        setupVideoView(
            binding.vv110Jahre,
            "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Videos%2F110JahreKaliWerra.mp4?alt=media&token=f7692c30-4eb0-4548-b287-7fbe29d730a5"
        )
        setupVideoView(
            binding.vvBundesligaU17,
            "https://58de7a369a9c4.streamlock.net/vod/_definst_/3q/videos/43/2024/04/a7782d002781ac71d9de259cc165d065bc930d3d.mp4/playlist.m3u8"
        )

        (activity as MainActivity).binding.toolbar.isGone = false

        binding.btnPlayHymne.setOnClickListener {
            playHymne()
        }

        mediaPlayer = MediaPlayer().apply {
            try {
                setDataSource(hymnUrl)
                prepare()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun playHymne(){
        mediaPlayer?.let {
            if (it.isPlaying){
                it.pause()
                binding.btnPlayHymne.text = getString(R.string.vereinshymne_abspielen)
            } else{
                it.start()
                binding.btnPlayHymne.setText(R.string.vereinshymne_stoppen)
            }
        }
    }



    private fun setupImageView(imageView: ImageView, imageUrl: String, targetUrl: String) {
        imageView.load(imageUrl)
        imageView.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse(targetUrl))
            )
        }
    }

    private fun setupVideoView(videoView: VideoView, videoUri: String) {
        videoView.setVideoURI(Uri.parse(videoUri))
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(48, 48, 48, 48)
        mediaController.layoutParams = params
    }

    override fun onDestroy() {
       mediaPlayer?.release()
        mediaPlayer = null
        super.onDestroy()
    }
}
