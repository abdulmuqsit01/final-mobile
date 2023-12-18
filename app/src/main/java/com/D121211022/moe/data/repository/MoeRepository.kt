package com.D121211022.moe.data.repository

import com.D121211022.moe.data.response.GetMoeResponse
import com.D121211022.moe.data.source.remote.ApiService

class MoeRepository(private val apiService: ApiService) {

    suspend fun getMoe(): GetMoeResponse {
        return apiService.getMoe()
    }

}