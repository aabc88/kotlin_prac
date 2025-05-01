package org.example.ch4.section2_hof

interface OnDataLoadListener {
    fun onDataLoaded(data: List<String>)
    fun onError(e: Exception)
}

class DataLoader {
    fun loadData(url: String, listener: OnDataLoadListener) {
        try {
            var resultList = mutableListOf<String>().run {
                add("hello")
                add("world")
                toList()
            }
            listener.onDataLoaded(resultList)
        } catch (e: Exception) {
            listener.onError(e)
        }
    }
}

fun main() {
    val loader = DataLoader().run {
        this.loadData("https://example.com/api", object : OnDataLoadListener {
            override fun onDataLoaded(data: List<String>) {
                println("Data loaded successfully: $data")
            }

            override fun onError(e: Exception) {
                println("Error loading data: ${e.message}")
            }
        })
    }

}
