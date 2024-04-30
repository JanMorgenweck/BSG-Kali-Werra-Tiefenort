package com.example.bsgkaliwerratiefenort.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bsgkaliwerratiefenort.data.model.News
import com.example.bsgkaliwerratiefenort.databinding.NeuigkeitenItemBinding

class NewsAdapter(

    private val dataset: List<News>
) : RecyclerView.Adapter<NewsAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(val binding: NeuigkeitenItemBinding):
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = NeuigkeitenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val news = dataset[position]
        var isExpanded = false
        val shortNews = news.shorttext
        val longNews = news.text

        holder.binding.ivNews.load(news.image)
        holder.binding.tvNewsHeader.text = news.header
        holder.binding.tvNewsDate.text = news.date
        holder.binding.tvNews.text = news.shorttext

        holder.binding.tvNews.setOnClickListener {
            isExpanded = !isExpanded
            holder.binding.tvNews.text = if (isExpanded) longNews else shortNews
        }
    }


}