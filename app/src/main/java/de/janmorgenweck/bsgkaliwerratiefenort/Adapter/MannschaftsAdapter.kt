package de.janmorgenweck.bsgkaliwerratiefenort.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import de.janmorgenweck.bsgkaliwerratiefenort.databinding.MannschaftItemBinding
import de.janmorgenweck.bsgkaliwerratiefenort.ui.MannschaftFragmentDirections
import de.janmorgenweck.bsgkaliwerratiefenort.data.Mannschaft


class MannschaftsAdapter(

    private val dataset: List<Mannschaft>
) : RecyclerView.Adapter<MannschaftsAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(val binding: MannschaftItemBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            MannschaftItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val mannschaft = dataset[position]


        holder.binding.tvMannschaftsName.text = mannschaft.name
        holder.binding.ivMannschaftsImage.load(mannschaft.image)


        holder.binding.root.setOnClickListener {
            holder.itemView.findNavController().navigate(
                MannschaftFragmentDirections.actionMannschaftFragmentToMannschaftDetailFragment(
                    position
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}