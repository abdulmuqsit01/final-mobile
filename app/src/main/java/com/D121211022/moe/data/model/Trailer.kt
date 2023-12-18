package com.D121211022.moe.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Trailer(
    @SerialName("embed_url")
    val embed_url: String,
    @SerialName("images")
    val images: ImagesX,
    @SerialName("url")
    val url: String,
    @SerialName("youtube_id")
    val youtube_id: String
) : Parcelable