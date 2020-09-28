package android.example.apigithub.presentation.repositories

import android.example.apigithub.data.ApiService
import android.example.apigithub.data.model.Owner
import android.example.apigithub.data.model.Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RepositoriesViewModel: ViewModel() {

    val repositoriesLiveData: MutableLiveData<List<Repository>> = MutableLiveData()

    fun getRepositories(){
        //repositoriesLiveData.value = createFakeRepositories()
        ApiService.service.getRepositories(1).

    }

    fun createFakeRepositories(): List<Repository> {
        return listOf(
            Repository(
                "123","Title", "descricxao", "henrique", 345, 50,
                Owner("henrique", "henrique", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4")
            ),
            Repository(
                "321","Title2", "descricxao2", "henrique2", 444, 30,
                Owner("henrique", "henrique", "https://avatars3.githubusercontent.com/u/30707089?s=60&v=4")
            )
        )
    }

}