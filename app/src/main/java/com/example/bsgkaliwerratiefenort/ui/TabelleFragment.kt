package com.example.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.bsgkaliwerratiefenort.Adapter.TabelleAdapter
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.MainActivity
import com.example.bsgkaliwerratiefenort.R

import com.example.bsgkaliwerratiefenort.databinding.FragmentTabelleBinding


class TabelleFragment : Fragment() {

    private lateinit var binding: FragmentTabelleBinding
    private val viewModel: FirebaseViewModel by activityViewModels()
    private lateinit var ballAnimation: AnimatedVectorDrawable
    private val animationCallback = object : Animatable2.AnimationCallback(){
        override fun onAnimationEnd(drawable: Drawable?) {
            ballAnimation.start()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabelleBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position")

        viewModel.mannschaften.observe(viewLifecycleOwner){
            binding.recyclerView.adapter = TabelleAdapter(it)

        }

        binding.arrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.homeicon.setOnClickListener {
            findNavController().navigate(R.id.startseiteFragment)
        }

        binding.tvMannschaftsName.text = (activity as MainActivity).datasource[position!!].name

        startAnimation()

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
                R.id.action_favoriten -> {
                    findNavController().navigate(R.id.favoritenFragment)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    override fun onDestroyView() {
        stopAnimation()
        super.onDestroyView()
    }

    private fun startAnimation(){
        binding.ivAnimation.setImageResource(R.drawable.ball_anim)
        ballAnimation = binding.ivAnimation.drawable as AnimatedVectorDrawable

        ballAnimation.registerAnimationCallback(animationCallback)
        ballAnimation.start()
    }

    private fun stopAnimation(){

        ballAnimation.unregisterAnimationCallback(animationCallback)
        ballAnimation.stop()
    }


}