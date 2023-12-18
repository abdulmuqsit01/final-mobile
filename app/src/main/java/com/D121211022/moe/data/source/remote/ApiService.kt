package com.D121211022.moe.data.source.remote

import com.D121211022.moe.data.response.GetMoeResponse
import retrofit2.http.GET


interface ApiService {

    @GET("v4/anime")
    suspend fun getMoe(): GetMoeResponse
}