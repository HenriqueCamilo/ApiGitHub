package android.example.apigithub.presentation.repositories

import android.example.apigithub.R
import android.example.apigithub.data.model.Repository
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_repositories.*

class RepositoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositories)

        toolbarRepositories.title = getString(R.string.toolbar_repositories)
        setSupportActionBar(toolbarRepositories)

        val viewModel: RepositoriesViewModel = ViewModelProvider(this).get(RepositoriesViewModel::class.java)


        viewModel.repositoriesLiveData.observe(this, Observer{
            it?.let{repositories ->
                with(recyclerRepositories) {
                    layoutManager =
                        LinearLayoutManager(this@RepositoriesActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = RepositoriesAdapter(repositories)
                }
            }
        })

        viewModel.getRepositories()
    }
}
