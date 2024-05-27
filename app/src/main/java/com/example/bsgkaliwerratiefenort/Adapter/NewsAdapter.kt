package com.example.bsgkaliwerratiefenort.Adapter

import android.os.Handler
import android.os.Looper
import android.text.Html
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bsgkaliwerratiefenort.data.model.News
import com.example.bsgkaliwerratiefenort.databinding.NeuigkeitenItemBinding
import com.google.firebase.firestore.QueryDocumentSnapshot
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local

class NewsAdapter(private val newsList: List<QueryDocumentSnapshot>) : RecyclerView.Adapter<NewsAdapter.ItemViewHolder>() {

    private val handler = Handler(Looper.getMainLooper())
    private val runnables = mutableMapOf<Int, Runnable>()

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

        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val formattedDate = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(dateFormat.parse(news.date) ?: Date())
        holder.binding.tvNewsDate.text = formattedDate

        holder.binding.tvNews.text = news.shorttext

        holder.binding.tvNews.setOnClickListener {
            isExpanded = !isExpanded
            holder.binding.tvNews.text = if (isExpanded) news.text else news.shorttext
        }

        val linkText = "<a href='${news.link}'>${news.linkText}</a>"
        holder.binding.tvNewsLink.text = Html.fromHtml(linkText, Html.FROM_HTML_MODE_LEGACY)
        holder.binding.tvNewsLink.movementMethod = LinkMovementMethod.getInstance()
        Log.d("TAG", linkText)

        val images = news.images
        if (images.isNotEmpty()){
            holder.binding.ivNewsImage.visibility = View.VISIBLE
            var imageIndex = 0
            val runnable = object : Runnable{
                override fun run() {
                    holder.binding.ivNewsImage.load(images[imageIndex])
                    imageIndex = (imageIndex + 1) % images.size
                    handler.postDelayed(this,5000)
                }
            }
            runnables[position] = runnable
            handler.post(runnable)
        } else {
            holder.binding.ivNewsImage.visibility = View.GONE
        }

    }
    private fun convertToNews(document: QueryDocumentSnapshot): News {
        val image = document.getString("image") ?: ""
        val header = document.getString("header") ?: ""
        val date = document.getString("date") ?: ""
        val shorttext = document.getString("shorttext") ?: ""
        val text = document.getString("text") ?: ""
        val linkText = document.getString("linktext") ?: ""
        val link = document.getString("link") ?:""
        val images = (document.get("images") as? List<String>) ?: listOf()
        return News(image, header, date, shorttext, text, linkText, link, images)
    }
}
