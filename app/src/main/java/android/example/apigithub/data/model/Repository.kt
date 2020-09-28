package android.example.apigithub.data.model



data class Repository(
    val id:String,
    val title: String,
    val description: String,
    val fork: Int,
    val star: Int,
    val name: String,
    val fullName: String,
    val image: String

)

