package com.example.appforvictor

import retrofit2.http.GET

interface Api {

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("comments?postId=1")
    suspend fun getPosts(): List<User>
}