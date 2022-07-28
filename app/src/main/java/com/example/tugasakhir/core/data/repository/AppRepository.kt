package com.example.tugasakhir.core.data.repository

import com.example.tugasakhir.core.data.source.local.LocalDataSource
import com.example.tugasakhir.core.data.source.remote.RemoteDataSource

class AppRepository (val local: LocalDataSource , val remote: RemoteDataSource){

}
