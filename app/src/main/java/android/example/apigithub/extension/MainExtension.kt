package android.example.apigithub.extension

fun updateDataList(dataList: MutableList<Int>) : List<Int> {

    for (i in 1..10) {
        dataList.add(dataList.size + 1)
    }
    return dataList
}

