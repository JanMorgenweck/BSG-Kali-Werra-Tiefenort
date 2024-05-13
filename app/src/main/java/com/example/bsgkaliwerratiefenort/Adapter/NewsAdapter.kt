package com.example.bsgkaliwerratiefenort.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bsgkaliwerratiefenort.data.model.News
import com.example.bsgkaliwerratiefenort.databinding.NeuigkeitenItemBinding
import com.google.firebase.firestore.QueryDocumentSnapshot

class NewsAdapter(private val newsList: List<QueryDocumentSnapshot>) : RecyclerView.Adapter<NewsAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: NeuigkeitenItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = NeuigkeitenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val newsDocument = newsList[position]
        val news = convertToNews(newsDocument)
        var isExpanded = false

        holder.binding.ivNews.load(news.image)
        holder.binding.tvNewsHeader.text = news.header
        holder.binding.tvNewsDate.text = news.date
        holder.binding.tvNews.text = news.shorttext

        holder.binding.tvNews.setOnClickListener {
            isExpanded = !isExpanded
            holder.binding.tvNews.text = if (isExpanded) news.text else news.shorttext
        }
    }
    private fun convertToNews(document: QueryDocumentSnapshot): News {
        val image = document.getString("image") ?: ""
        val header = document.getString("header") ?: ""
        val date = document.getString("date") ?: ""
        val shorttext = document.getString("shorttext") ?: ""
        val text = document.getString("text") ?: ""
        return News(image, header, date, shorttext, text)
    }
}
