package com.example.bsgkaliwerratiefenort.Adapter

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bsgkaliwerratiefenort.FirebaseViewModel
import com.example.bsgkaliwerratiefenort.databinding.ItemFavoritenBinding
import com.example.kaliwerra.data.Mannschaft

class FavoritenAdapter(
    private var favoriten: List<Mannschaft>,
    private val viewModel: FirebaseViewModel,
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

        viewModel.loadMatchesForLeague(favorit.leagueId)

        with(holder.binding) {
            tvMannschaftsName.text = favorit.name

            viewModel.loadNextMatch(favorit.leagueId, favorit.teamId)

            viewModel.nextMatch.observe(lifecycleOwner) { match ->

                match?.let {
                    tvDateNextMatch.text = match.matchDateTime
                    teamCrestNextMatch.load(match.team1.teamIconUrl)
                    teamNameNextMatch.text = match.team1.teamName
                    if (match.matchIsFinished) {
                        val result = match.matchResults.first{ it.resultName == "Endergebnis" }
                        tvPointsTeam1NextMatch.text = result?.pointsTeam1?.toString() ?: "-"
                        tvPointsTeam2NextMatch.text = result?.pointsTeam2?.toString() ?: "-"
                    } else {
                        tvPointsTeam1NextMatch.text = "-"
                        tvPointsTeam2NextMatch.text = "-"
                    }
                    teamCrest2NextMatch.load(match.team2.teamIconUrl)
                    teamName2NextMatch.text = match.team2.teamName

                }
            }
            holder.binding.clFavorite.setOnLongClickListener {
                val alertDialogBuilder = AlertDialog.Builder(holder.itemView.context)
                alertDialogBuilder.apply {
                    setMessage("Möchten Sie ${favorit.name} aus Favoriten entfernen?")
                    setPositiveButton("Ja") { _, _ ->
                        viewModel.removeFavorite(favorit)
                        favoriten = favoriten.filterNot { it ==favorit }
                        notifyDataSetChanged()
                    }
                    setNegativeButton("Abbrechen") { dialog, _ ->
                        dialog.dismiss()
                    }
                }
                alertDialogBuilder.create().show()
                true
            }
        }
    }
}