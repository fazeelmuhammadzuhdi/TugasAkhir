package com.example.tugasakhir.util

import android.app.Application
import com.example.tugasakhir.core.di.appModule
import com.example.tugasakhir.core.di.repositoryModule
import com.example.tugasakhir.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}