package android.example.apigithub.presentation.repositories

import android.example.apigithub.data.model.Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RepositoriesViewModel: ViewModel() {

    val repositoriesLiveData: MutableLiveData<List<Repository>> = MutableLiveData()

    fun getRepositories(){
        repositoriesLiveData.value = createFakeRepositories()
    }

    fun createFakeRepositories(): List<Repository> {
        return listOf(
            Repository(
                "Title", "descricxao", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4",
                "henrique", "henrique mapa", 345, 50
            ),
            Repository(
                "Title2", "descricxao2", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4",
                "henrique2", "henrique2 mapa", 444, 30
            )
        )
    }

}