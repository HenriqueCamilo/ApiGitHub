package android.example.apigithub

import android.example.apigithub.extension.updateDataList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//class  OnScrollListener(val layoutManager: LinearLayoutManager, val adapter: RecyclerView.Adapter<  MEURECYCLERANDAPTER.ViewHolder>, val dataList: MutableList<Int>) : RecyclerView.OnScrollListener() {
//    var previousTotal = 0
//    var loading = true
//    val visibleThreshold = 10
//    var firstVisibleItem = 0
//    var visibleItemCount = 0
//    var totalItemCount = 0
//
//    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//        super.onScrolled(recyclerView, dx, dy)
//
//        visibleItemCount = recyclerView.childCount
//        totalItemCount = layoutManager.itemCount
//        firstVisibleItem = layoutManager.findFirstVisibleItemPosition()
//
//        if (loading) {
//            if (totalItemCount > previousTotal) {
//                loading = false
//                previousTotal = totalItemCount
//            }
//        }
//
//        if (!loading && (totalItemCount - visibleItemCount) <= (firstVisibleItem + visibleThreshold)) {
//            val initialSize = dataList.size
//            updateDataList(dataList)
//            val updatedSize = dataList.size
//            recyclerView.post { adapter.notifyItemRangeInserted(initialSize, updatedSize) }
//            loading = true
//        }
//    }
//}