package br.org.fittecnologia.fakenews

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class News(
    val title: String,
    val description: String,
    val imageUrl: String,
    val content: String,
    val author: String,
    val source: String,
    val lastUpdate: String,
    val newsUrl: String
) : Parcelable