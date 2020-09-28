package android.example.apigithub.presentation.repositories

import android.example.apigithub.R
import android.example.apigithub.data.model.Repositorie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_repositories.*

class RepositoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositories)

        toolbarRepositories.title = getString(R.string.toolbar_repositories)
        setSupportActionBar(toolbarRepositories)

        with(recyclerRepositories) {
            layoutManager =
                LinearLayoutManager(this@RepositoriesActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = RepositoriesAdapter(getRepositories())
        }
    }

    fun getRepositories(): List<Repositorie> {
        return listOf(
            Repositorie(
                "Title", "descricxao", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4",
                "henrique", "henrique mapa", "345", "50"
            ),
            Repositorie(
                "Title2", "descricxao2", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4",
                "henrique2", "henrique2 mapa", "444", "30"
            )
        )
    }
}
