package android.example.apigithub.data.model

data class Repository(
    val title: String,
    val description: String,
    val image: String,
    val username: String,
    val name: String,
    val fork: Int,
    val star: Int
)