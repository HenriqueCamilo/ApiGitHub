package android.example.apigithub.data.model

import com.squareup.moshi.Json


data class Repository(
    val id:String,
    val title: String,
    val description: String,
    val username: String,
    val fork: Int,
    val star: Int,
    val owner: Owner
)

data class Owner(

    val name: String,
    val fullName: String,
    val image: String
)

