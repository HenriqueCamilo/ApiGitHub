package android.example.apigithub.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PullReponse(
    val pullResults: List<PullResultsResponse>
)

@JsonClass(generateAdapter = true)
data class PullResultsResponse(
    @Json(name = "id")
    val id: String,
    @Json(name = "title")
    val title:String,
    @Json(name = "body")
    val description:String,
    @Json(name="user")
    val user: User

)

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "login")
    var name: String,
    @Json(name = "login")
    var fullName: String,
    @Json(name = "avatar_url")
    var image: String
)

