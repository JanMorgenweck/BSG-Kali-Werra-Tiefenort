package com.example.bsgkaliwerratiefenort.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bsgkaliwerratiefenort.MyViewModel
import com.example.bsgkaliwerratiefenort.databinding.ItemFavoritenBinding
import com.example.kaliwerra.data.Mannschaft

class FavoritenAdapter(
    private var favoriten: List<Mannschaft>,
    private val viewModel: MyViewModel,
    private val lifecycleOwner: LifecycleOwner

) : RecyclerView.Adapter<FavoritenAdapter.FavoritenViewHolder>() {

    inner class FavoritenViewHolder(val binding: ItemFavoritenBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritenViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFavoritenBinding.inflate(inflater, parent, false)
        return FavoritenViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return favoriten.size
    }

    override fun onBindViewHolder(holder: FavoritenViewHolder, position: Int) {
        val favorit = favoriten[position]

        with(holder.binding) {
            tvMannschaftsName.text = favorit.name

            val match = viewModel.loadNextMatch(favorit.leagueId,favorit.teamId)

            viewModel.nextMatch.observe(lifecycleOwner) {

                tvDateNextMatch.text = it.matchDateTime
                teamCrestNextMatch.load(it.team1.teamIconUrl)
                teamNameNextMatch.text = it.team1.teamName
                if (viewModel.nextMatch.value!!.matchIsFinished) {
                    tvPointsTeam1NextMatch.text =
                        viewModel.nextMatch.value!!.matchResults.first { it.resultName == "Endergebnis" }.pointsTeam1.toString()
                    tvPointsTeam2NextMatch.text =
                        viewModel.nextMatch.value!!.matchResults.first { it.resultName == "Endergebnis" }.pointsTeam2.toString()
                } else {
                    tvPointsTeam1NextMatch.text = "-"
                    tvPointsTeam2NextMatch.text = "-"
                }
                teamCrest2NextMatch.load(viewModel.nextMatch.value!!.team2.teamIconUrl)
                teamName2NextMatch.text = viewModel.nextMatch.value!!.team2.teamName
            }
        }
    }

}