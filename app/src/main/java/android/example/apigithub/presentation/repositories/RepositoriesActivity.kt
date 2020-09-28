package android.example.apigithub.presentation.repositories

import android.example.apigithub.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_repositories.*

class RepositoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositories)

        toolbarRepositories.title = getString(R.string.toolbar_repositories)
        setSupportActionBar(toolbarRepositories)

        recyclerRepositories.layoutManager
        recyclerRepositories.adapter

        with(recyclerRepositories){
            adapter
        }
    }
}