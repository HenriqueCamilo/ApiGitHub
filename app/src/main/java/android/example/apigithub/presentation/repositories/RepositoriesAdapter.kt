package android.example.apigithub.presentation.repositories

import android.example.apigithub.R
import android.example.apigithub.data.model.Repository
import android.example.apigithub.extension.loadImage
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_repositorio.view.*

class RepositoriesAdapter(private val repositories: List<Repository>) : RecyclerView.Adapter<RepositoriesAdapter.RepositoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): RepositoriesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_repositorio, parent, false)
        return RepositoriesViewHolder(itemView)
    }

    override fun getItemCount() = repositories.size

    override fun onBindViewHolder(viewHolder: RepositoriesViewHolder, position: Int) {
        viewHolder.bindView(repositories[position])
    }

    class RepositoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val title = itemView.tvTitleRepository
        private val description = itemView.tvDescriptionRepository
        private val image = itemView.civAdvisorImage
        private val userName = itemView.tvUserName
        private val name = itemView.tvName
        private val forks = itemView.tvNumberForks
        private val star = itemView.tvNumberStars


        fun bindView(repository: Repository) {
            title.text = repository.title
            description.text = repository.description
            userName.text = repository.username
            name.text = repository.name
            forks.text = repository.fork.toString()
            star.text = repository.star.toString()
            image.loadImage(repository.image)


        }
    }
}