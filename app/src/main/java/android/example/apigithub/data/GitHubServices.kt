package android.example.apigithub.data

import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubServices {


    @GET("search/repositories")
    fun repositories(@Query("page") page: Int, @Query("sort") sort: String = "stars"
                     , @Query("q") q: String = "language:Java"): Call<List<>>

}
