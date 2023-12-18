package com.D121211022.moe

import android.app.Application
import com.D121211022.moe.data.AppContainer
import com.D121211022.moe.data.DefaultAppContainer

class MyApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

}