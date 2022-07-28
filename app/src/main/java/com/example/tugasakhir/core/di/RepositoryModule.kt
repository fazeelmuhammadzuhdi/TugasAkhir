package com.example.tugasakhir.core.di

import com.example.tugasakhir.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}