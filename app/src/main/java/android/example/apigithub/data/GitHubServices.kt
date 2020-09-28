package android.example.apigithub.data

import android.example.apigithub.data.response.RepositoryBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubServices {

//mudar pagina de 1 para o que receber
    @GET("search/repositories")
    fun getRepositories(@Query("page") page: Int = 1, @Query("sort") sort: String = "stars", @Query("q") q: String = "language:Java"): Call<RepositoryBodyResponse>

//    @GET("repos/{owner}/{repo}/pulls")
//    fun pulls(@Path("owner") owner: String,
//              @Path("repo") repo: String) : Call<List<Pull>>

}
