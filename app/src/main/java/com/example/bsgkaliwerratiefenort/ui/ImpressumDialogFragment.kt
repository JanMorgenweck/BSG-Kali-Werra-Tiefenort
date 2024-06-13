package de.janmorgenweck.bsgkaliwerratiefenort.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.FragmentImpressumBinding

class ImpressumDialogFragment : DialogFragment() {

    private var _binding: FragmentImpressumBinding? = null
    private val binding get() = _binding!!

    companion object{
        fun newInstance(): ImpressumDialogFragment{
            return ImpressumDialogFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImpressumBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClose.setOnClickListener {
            dismiss()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

