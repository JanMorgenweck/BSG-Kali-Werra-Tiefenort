package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentMitgliedWerdenBinding
import java.util.Calendar

class MitgliedWerdenFragment : Fragment() {

    private lateinit var binding: FragmentMitgliedWerdenBinding

    private val mannschaften = arrayOf("    G-Junioren","    F-Junioren", "    E-Junioren", "    E-Juniorinnen","    D-Junioren", "    C-Junioren", "    B-Junioren", "    A-Junioren", "    Herren", "    Alte Herren", "    Passiv")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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

                // Validate email
                if (!email.contains("@")) {
                    Toast.makeText(requireContext(), "Bitte geben Sie eine gültige E-Mail-Adresse ein.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

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
        (activity as MainActivity).binding.toolbar.isGone = false
    }

    private fun openPDFUrl(url: String) {
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

    private fun showDatePickerDialog() {
        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(requireContext(), { _, year, month, dayOfMonth ->
            val selectedDate = "    $dayOfMonth/${month + 1}/$year"
            binding.tietGeburtsdatum.text = selectedDate
        }, year, month, day)

        datePickerDialog.show()
    }
}
