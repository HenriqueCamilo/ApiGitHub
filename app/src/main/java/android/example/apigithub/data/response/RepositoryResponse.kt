package android.example.apigithub.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RepositoryBodyResponse(
    @Json(name = "items")
    val repositoryResults: List<RepositoryResultsResponse>
)

@JsonClass(generateAdapter = true)
data class RepositoryResultsResponse(

    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val title: String,
    @Json(name = "description")
    var description: String,
    @Json(name = "forks_count")
    var forks: Int,
    @Json(name = "stargazers_count")
    var stars: Int,
    @Json(name = "owner")
    val owner: Owner

)

@JsonClass(generateAdapter = true)
data class Owner(
    @Json(name = "type")//type
    var name: String,
    @Json(name = "login")
    var fullName: String,
    @Json(name = "avatar_url")
    var image: String
)