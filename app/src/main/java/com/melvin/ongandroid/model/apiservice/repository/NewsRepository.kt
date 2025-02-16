package com.melvin.ongandroid.model.apiservice.repository

/**
 * Esta clase obtiene un response de las novedades de la ONG.
 * Ya sea desde un repositorio remoto o local
 *
 * @author Martin Re
 */
import com.melvin.ongandroid.model.apimodel.NewsModel
import com.melvin.ongandroid.model.apiservice.network.NewsModelService

class NewsRepository {

    private val apiService = NewsModelService()

    suspend fun getAllNewsFromApi(): List<NewsModel>? {
        val response = apiService.getNews()
        if (response.code() == 200 && response.isSuccessful){
            return response.body()?.data
        }else{
            return emptyList()
        }
    }
}