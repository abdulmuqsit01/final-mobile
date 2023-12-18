package com.D121211022.moe.data

import com.D121211022.moe.data.repository.MoeRepository
import com.D121211022.moe.data.source.remote.ApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val moeRepository: MoeRepository
}

class DefaultAppContainer: AppContainer {

    private val BASE_URL = "https://api.jikan.moe"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(Json { ignoreUnknownKeys = true }.asConverterFactory("application/json".toMediaType()))
        .build()


    private val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    override val moeRepository: MoeRepository
        get() = MoeRepository(retrofitService)

}