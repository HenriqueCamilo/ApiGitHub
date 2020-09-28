package android.example.apigithub.presentation.repositories

import android.example.apigithub.data.ApiService
import android.example.apigithub.data.model.Repository
import android.example.apigithub.data.response.RepositoryBodyResponse
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoriesViewModel: ViewModel() {

    val repositoriesLiveData: MutableLiveData<List<Repository>> = MutableLiveData()

    fun getRepositories(){
        ApiService.service.getRepositories().enqueue(object: Callback<RepositoryBodyResponse>{
            override fun onResponse(call: Call<RepositoryBodyResponse>, response: Response<RepositoryBodyResponse>){
                if(response.isSuccessful){
                    val repositories:MutableList<Repository> = mutableListOf()

                    response.body()?.let{repositoryBodyResponse ->
                        for(result in repositoryBodyResponse.repositoryResults){
                            val repository = Repository(
                                id = result.id,
                                title = result.title,
                                description = result.description,
                                fork = result.forks,
                                star = result.stars,
                                name = result.owner.name,
                                fullName = result.owner.fullName,
                                image = result.owner.image
                            )
                            repositories.add(repository)
                        }
                    }
                    repositoriesLiveData.value = repositories
                }
            }
            override fun onFailure(call: Call<RepositoryBodyResponse>, t: Throwable) {

            }
        })
    }



}