package com.D121211022.moe.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class ImagesX(
    @SerialName("image_url")
    val image_url: String,
    @SerialName("large_image_url")
    val large_image_url: String,
    @SerialName("maximum_image_url")
    val maximum_image_url: String,
    @SerialName("medium_image_url")
    val medium_image_url: String,
    @SerialName("small_image_url")
    val small_image_url: String
) : Parcelable