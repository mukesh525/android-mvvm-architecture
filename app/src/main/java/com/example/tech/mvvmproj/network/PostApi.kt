package com.example.tech.mvvmproj.network

import com.example.tech.mvvmproj.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}