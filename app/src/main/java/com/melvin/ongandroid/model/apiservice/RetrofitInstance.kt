package com.melvin.ongandroid.model.apiservice

import com.melvin.ongandroid.data.apiservice.ApiConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        fun retrofitBuilder(url: String = ApiConstants.BASE_URL) = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}


/*}


>>>>>>> 7aee8908a915b8f0b3d5eb3e503b7d6bec05e81e

private fun getOkHttpClient(): OkHttpClient {
    var interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BASIC
    val client: OkHttpClient.Builder = OkHttpClient.Builder()
        .cache(null)
        .addInterceptor(interceptor)

    return client.build()

<<<<<<< HEAD
}
=======
    }*/


