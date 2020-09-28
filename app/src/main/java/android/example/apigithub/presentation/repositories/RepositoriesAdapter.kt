package android.example.apigithub.presentation.repositories

import android.example.apigithub.R
import android.example.apigithub.data.model.Repositorie
import android.example.apigithub.extension.loadImage
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_repositorio.view.*

class RepositoriesAdapter(private val repositories: List<Repositorie>) : RecyclerView.Adapter<RepositoriesAdapter.RepositoriesViewHolder>() {

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


        fun bindView(repositorie: Repositorie) {
            title.text = repositorie.title
            description.text = repositorie.description
            userName.text = repositorie.username
            name.text = repositorie.name
            forks.text = repositorie.fork
            star.text = repositorie.star
            image.loadImage(repositorie.image)


        }
    }
}