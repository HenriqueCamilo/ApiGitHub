package android.example.apigithub.extension

import android.widget.ImageView
import coil.load

fun updateDataList(dataList: MutableList<Int>) : List<Int> {

    for (i in 1..10) {
        dataList.add(dataList.size + 1)
    }
    return dataList
}

fun ImageView.loadImage(url: String, placeholder: Int = 0) {
    this.load(url) {
        placeholder(placeholder)
        error(placeholder)
    }
}

