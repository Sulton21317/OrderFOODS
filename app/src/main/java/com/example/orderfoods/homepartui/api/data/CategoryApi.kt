package com.example.orderfoods.homepartui.api.data

import com.example.orderfoods.homepartui.api.model.Category
import retrofit2.Response
import retrofit2.http.GET

interface CategoryApi {

    @GET("/EyWV01aJq")
    suspend fun getAllData(): Response<Category>
}