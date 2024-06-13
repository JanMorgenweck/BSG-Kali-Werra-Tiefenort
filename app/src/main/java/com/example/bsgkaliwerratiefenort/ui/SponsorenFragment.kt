package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.MainActivity
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentSponsorenBinding


class SponsorenFragment : Fragment() {

    private lateinit var binding: FragmentSponsorenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSponsorenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).binding.toolbar.isGone = false

        binding.ivGEWOG.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FGEWOG.jpg?alt=media&token=2da34ce8-e108-4dd3-ba39-e3988e71cd2e")
        binding.ivKrug.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FSpedition-Krug.jpg?alt=media&token=8642e12b-83c0-43ef-ae10-8d68214b076d")
        binding.ivBeck.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FBeck-Elektrogrosshandel.jpg?alt=media&token=43028c28-f836-47ea-9eb8-1ef9d5a2be1c")
        binding.ivMSN.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FMSN-Rechtsanwaltsgesellschaft.jpg?alt=media&token=68e2cc15-e11f-456f-a272-7374face01e4")
        binding.ivKrugIffland.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FKrug-Iffland.jpg?alt=media&token=9e9d5b38-d60c-40eb-a13e-c440131e8858")
        binding.ivSimon.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FSimon-Autohaus.jpg?alt=media&token=799aee5c-88bb-4162-9b9e-80b798d11b4a")
        binding.ivLVM.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FLVM-Katja-Krause.jpg?alt=media&token=a29390e3-ea39-4f6f-b8ce-c1d69fd3ded9")
        binding.ivCarunion.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FCarunion.jpg?alt=media&token=10ef52e3-03de-40fd-a1a9-a37d18984bf0")
        binding.ivFahrradEyring.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FFahrrad-Eyring.jpg?alt=media&token=41c3b05b-eee5-480a-989e-75d2f04ad1ea")
        binding.ivTEAG.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FTEAG.jpg?alt=media&token=8f287887-da2e-4d5f-9a91-f6e52e06cb4b")
        binding.ivTechnicum.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FTechnicum.jpg?alt=media&token=7f770d18-63fb-4b16-86d7-9397c6d2ca0c")
        binding.ivMetallbau.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FSchmiede-Hill.jpg?alt=media&token=590052ea-8b4a-492c-96cf-9fcc759905e7")
        binding.ivWallnusshof.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FWalnusshof.jpg?alt=media&token=f09481eb-c936-4bb8-a248-3a27ddbc253e")
        binding.ivLandhandel.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FLandhandel-Leimbach.jpg?alt=media&token=986e4bb5-05cf-4e71-a270-9c016d11ab0f")
        binding.ivPhysiotherapie.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FPhysiotherapie-Wilhelm.jpg?alt=media&token=61f6b1c4-699c-4718-b4e4-fdb99b616b4d")
        binding.ivAdler.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FFleischerei-Adler.jpg?alt=media&token=77da0e92-7843-4588-b2eb-072f921c7029")
        binding.ivPfau.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FFleischerei-Pfau.jpg?alt=media&token=0fe3be0a-77a0-4230-b56a-a1566e3275ac")
        binding.ivGroundBlogger.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FGroundblogging.jpg?alt=media&token=5222eb17-644e-4fad-9868-6c0ffedf1741")
        binding.ivKomposta.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FKomposta.jpg?alt=media&token=81ba74e5-3378-47cc-866b-de6af03feec3")
        binding.ivLehmann.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FLehmann-Motorgeraete.jpg?alt=media&token=51ab92c6-d2b0-4237-88e1-b2a5b9dda598")
        binding.ivMarcoLinss.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FMaler-Linss.jpg?alt=media&token=d10136fc-a4ce-48ec-b53b-58e7c725a8f8")
        binding.ivMueller.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FMüller-Heizung-Sanitaer.jpg?alt=media&token=25cfe41f-25a7-43f4-a82a-e56b757cc3b1")
        binding.ivKathrinRexroth.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FRexroth-Podologie.jpg?alt=media&token=68ccee26-8d79-46dc-ba1b-4bd84bb0d632")
        binding.ivReboConsult.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FRebo-Consult.jpg?alt=media&token=f6fd0c0a-a4f1-40e8-b8bd-c4fb72ea10eb")
        binding.ivTiefbau.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FTiefbau-Tiefenort.jpg?alt=media&token=2dfb3963-ff32-4800-807b-1b2c7faa9542")
        binding.ivVRBank.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FVR_Bank.jpg?alt=media&token=e59b7151-e4de-4481-aa06-2f8c2ca05aea")
        binding.ivHessCarunion.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FCarunion-Primus.jpg?alt=media&token=35e9ec8e-ee53-44c4-aac2-0bcbc8f2359a")
        binding.ivElektroHossfeld.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FElektro-Hossfeld.jpg?alt=media&token=937ab2bb-6e4c-4b40-a19d-bc577b70c586")
        binding.ivRhoenerEismanufaktur.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FRhoener-Eismanufaktur-768x576.jpg?alt=media&token=716b7b10-f2a6-46a1-83ab-c109d7b27588")
        binding.ivFlamingoDoener.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FFlamingo-Doener-768x576.jpg?alt=media&token=08ebcbde-7637-434a-b589-d19edb61a480")
        binding.ivAutohausBreitungen.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FAutohaus-Breitungen.jpg?alt=media&token=a81919ae-fca5-432d-8b9a-90cce3d23418")
        binding.ivBosporus.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FBosporus.jpg?alt=media&token=51216ee5-b063-451b-b728-557c4179a83e")
        binding.ivGeruestverleih.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FGeruestverleih-Scheel.jpg?alt=media&token=b45e82f6-1817-47cd-8351-0edf75f116bc")
        binding.ivAlternativeEnergien.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FAlternative-Energien.jpg?alt=media&token=5e2f37b2-3196-4065-9ab8-fc72c9a56934")
        binding.ivIntersportSauer.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FIntersport-Sauer.jpg?alt=media&token=64056183-ce2d-4404-acab-cc92698ae4ef")
        binding.ivJako.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Sponsoren%2FJako.jpg?alt=media&token=6f8f540d-4f4a-43d8-ada4-be1025ab43f8")
        binding.ivGroundBloggerMissGermany.load("https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Bild-Groundblogging-x-Miss-Germany.jpg?alt=media&token=1ec550da-126c-433b-8fe0-a9012babbba5")

        binding.btnSenden.setOnClickListener {

            val name = binding.tietName.text.toString()
            val email = binding.tietEmail.text.toString()
            val phone = binding.tietTelefon.text.toString()
            val nachricht = binding.tietNachricht.text.toString()

            if (name.isNotBlank() &&
                email.isNotBlank() &&
                phone.isNotBlank() &&
                nachricht.isNotBlank() &&
                binding.checkBox.isChecked
                ){

                if (!email.contains("@")) {
                    Toast.makeText(requireContext(), "Bitte geben Sie eine gültige E-Mail-Adresse ein.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@kali-werra.de"))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nachricht von $name")
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Name: $name\nE-Mail: $email\nTelefon: $phone\nNachricht: $nachricht\nDatenschutzerklärung: check️"
                )


                if (intent.resolveActivity(requireActivity().packageManager) != null) {
                    startActivity(intent)
                    binding.tietName.text!!.clear()
                    binding.tietEmail.text!!.clear()
                    binding.tietTelefon.text!!.clear()
                    binding.tietNachricht.text!!.clear()
                    binding.checkBox.isChecked = false

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
    }
}