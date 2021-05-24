package com.example.parcial3kt.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface LeagueApi {
    @Headers("x-rapidapi-key:35c64c80a8msh725e294301d40e8p18ac17jsn00c0f709149d", "x-rapidapi-host:api-football-beta.p.rapidapi.com")
    @GET( "/leagues")
    fun traerDatos(@Query("season") query: String ): Call<LigasResponse>
}