package com.D121211022.moe.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Items(
    @SerialName("count")
    val count: Int,
    @SerialName("per_page")
    val per_page: Int,
    @SerialName("total")
    val total: Int
) : Parcelable