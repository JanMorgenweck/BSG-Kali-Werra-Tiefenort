package com.example.bsgkaliwerratiefenort.ui

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.bsgkaliwerratiefenort.R
import com.example.bsgkaliwerratiefenort.databinding.FragmentMitgliedWerdenBinding
import java.util.Calendar


class MitgliedWerdenFragment : Fragment() {

    private lateinit var binding: FragmentMitgliedWerdenBinding

    private val mannschaften = arrayOf("    G-Junioren","    F-Junioren", "    E-Junioren", "    E-Juniorinnen","    D-Junioren", "    C-Junioren", "    B-Junioren", "    A-Junioren", "    Herren", "    Alte Herren", "    Passiv")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMitgliedWerdenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSenden.setOnClickListener {

            val vorname = binding.tietVorname.text.toString()
            val name = binding.tietName.text.toString()
            val geburtstag = binding.tietGeburtsdatum.text.toString()
            val strasse = binding.tietStraE.text.toString()
            val hausnummer = binding.tietHausnummer.text.toString()
            val postleizahl = binding.tietPostleitzahl.text.toString()
            val wohnort = binding.tietWohnort.text.toString()
            val beruf = binding.tietBeruf.text.toString()
            val mannschaft = binding.tietMannschaft.text.toString()
            val telefon = binding.tietTelefon.text.toString()
            val email = binding.tietEmail.text.toString()
            val iban = binding.tietIBAN.text.toString()
            val bic = binding.tietBIC.text.toString()
            val kontoinhaber = binding.tietKontoinhaber.text.toString()

            if (name.isNotBlank() &&
                vorname.isNotBlank() &&
                geburtstag.isNotBlank() &&
                strasse.isNotBlank() &&
                hausnummer.isNotBlank() &&
                postleizahl.isNotBlank() &&
                wohnort.isNotBlank() &&
                beruf.isNotBlank() &&
                mannschaft.isNotBlank() &&
                telefon.isNotBlank() &&
                email.isNotBlank() &&
                iban.isNotBlank() &&
                bic.isNotBlank() &&
                kontoinhaber.isNotBlank() &&
                binding.cbMitgliedsbekundung.isChecked &&
                binding.cbBeitragseinzug.isChecked &&
                binding.cbEinwilligungPersonendaten.isChecked &&
                binding.cbDatenschutzhinweis.isChecked
            ) {

                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("janmorgenweck@hotmail.com"))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nachricht von $vorname $name")
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Vorname: $vorname\n" +
                            "Name: $name\n" +
                            "Geburtdatum: $geburtstag\n" +
                            "Straße: $strasse\n" +
                            "Hausnummer: $hausnummer\n" +
                            "Postleitzahl: $postleizahl\n" +
                            "Wohnort: $wohnort\n" +
                            "Beruf: $beruf\n" +
                            "Mannschaft: $mannschaft\n" +
                            "Telefon: $telefon\n" +
                            "E-Mail: $email\n" +
                            "IBAN: $iban\n" +
                            "BIC: $bic\n" +
                            "Kontoinhaber: $kontoinhaber\n" +
                            "Mitgliedsbekundung: check\n" +
                            "Beitragseinzug: check\n" +
                            "Einwilligung Personendaten: check\n" +
                            "Datenschutzhinweis: check"
                )

                if (intent.resolveActivity(requireActivity().packageManager) != null) {
                    startActivity(intent)
                    binding.tietVorname.text!!.clear()
                    binding.tietName.text!!.clear()
                    binding.tietGeburtsdatum.text!!.isEmpty()
                    binding.tietStraE.text!!.clear()
                    binding.tietHausnummer.text!!.clear()
                    binding.tietPostleitzahl.text!!.clear()
                    binding.tietWohnort.text!!.clear()
                    binding.tietBeruf.text!!.clear()
                    binding.tietMannschaft.text!!.isEmpty()
                    binding.tietTelefon.text!!.clear()
                    binding.tietEmail.text!!.clear()
                    binding.tietIBAN.text!!.clear()
                    binding.tietBIC.text!!.clear()
                    binding.tietKontoinhaber.text!!.clear()
                    binding.cbMitgliedsbekundung.isChecked = false
                    binding.cbBeitragseinzug.isChecked = false
                    binding.cbEinwilligungPersonendaten.isChecked = false
                    binding.cbDatenschutzhinweis.isChecked = false

                } else {
                    Toast.makeText(
                        requireContext(),
                        "Es wurde keine E-Mail-App gefunden.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(
                    requireContext(),
                    "Es müssen alle Felder ausgefüllt werden.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.tietMannschaft.setOnClickListener {
            showMannschaftPopup()
        }

        binding.tvSpielerlaubnis.setOnClickListener {
            openPDFUrl("https://kali-werra.de/wp-content/uploads/2022/09/Antrag_auf_Erteilung_Spielerlaubnis.pdf")
        }
        binding.tietGeburtsdatum.setOnClickListener {
            showDatePickerDialog()
        }

        binding.logoToolbar.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Logo-BSG-Kali-Werra.jpg?alt=media&token=9af4b237-a4b7-4728-beeb-57f5d0c0b384")

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


    private fun openPDFUrl (url: String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun showMannschaftPopup() {
        val popupMenu = PopupMenu(requireContext(), binding.tietMannschaft)
        for (mannschaft in mannschaften) {
            popupMenu.menu.add(mannschaft)
        }
        popupMenu.setOnMenuItemClickListener { menuItem ->
            binding.tietMannschaft.text = menuItem.title
            true
        }
        popupMenu.show()
    }

    private fun showDatePickerDialog(){
        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(requireContext(),{ _, year, month, dayOfMonth ->
        val selectedDate = "    $dayOfMonth/${month +1 }/$year"
            binding.tietGeburtsdatum.text = selectedDate
        }, year,month,day)

        datePickerDialog.show()
    }




}