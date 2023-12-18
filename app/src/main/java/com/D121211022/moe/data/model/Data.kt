package com.D121211022.moe.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Data(
    @SerialName("duration")
    val duration: String,
    @SerialName("favorites")
    val favorites: Int,
    @SerialName("genres")
    val genres: List<Genre>,
    @SerialName("images")
    val images: Images,
    @SerialName("licensors")
    val licensors: List<Licensor>,
    @SerialName("popularity")
    val popularity: Int,
    @SerialName("producers")
    val producers: List<Producer>,
    @SerialName("rank")
    val rank: Int,
    @SerialName("rating")
    val rating: String,
    @SerialName("source")
    val source: String,
    @SerialName("status")
    val status: String,
    @SerialName("studios")
    val studios: List<Studio>,
    @SerialName("synopsis")
    val synopsis: String,
    @SerialName("themes")
    val themes: List<Theme>,
    @SerialName("title")
    val title: String,
    @SerialName("url")
    val url: String,
) : Parcelable