package com.D121211022.moe.data.response

import com.D121211022.moe.data.model.Data
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetMoeResponse(
    @SerialName("data")
    val `data`: List<Data>,
)