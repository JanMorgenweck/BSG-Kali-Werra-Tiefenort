package com.example.bsgkaliwerratiefenort.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.bsgkaliwerratiefenort.data.model.MannschaftAPI
import com.example.bsgkaliwerratiefenort.databinding.TabelleItemBinding

class TabelleAdapter(

    val mannschaft: List<MannschaftAPI>
): RecyclerView.Adapter<TabelleAdapter.ItemViewHolder>() {

    inner class ItemViewHolder( val binding: TabelleItemBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val binding = TabelleItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mannschaft.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val mannschaften = mannschaft[position]
        holder.binding.teamPosition.text = (position + 1).toString()
        holder.binding.teamCrest.load(mannschaften.teamIconUrl)
        holder.binding.teamName.text = mannschaften.teamName
        holder.binding.matchesPlayed.text = mannschaften.matches.toString()
        holder.binding.matchesWon.text = mannschaften.won.toString()
        holder.binding.matchesLost.text = mannschaften.lost.toString()
        holder.binding.matchesDrawn.text = mannschaften.draw.toString()
        holder.binding.teamPoints.text = mannschaften.points.toString()
    }
}