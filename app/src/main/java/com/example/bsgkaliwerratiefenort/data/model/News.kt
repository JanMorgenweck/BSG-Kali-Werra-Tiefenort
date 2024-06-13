package de.janmorgenweck.bsgkaliwerratiefenort.data.model

data class News(
    val image: String,
    val header: String,
    val date: String,
    val shorttext: String,
    val text: String,
    val linkText: String,
    val link: String,
    val images: List<String>
)
