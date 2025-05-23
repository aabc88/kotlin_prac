package org.example.ch3.section9_object

interface DataHandler {
    fun handleData(data: String)
    fun canProcess(dataType: String): Boolean
}

class DataProcessor(private val name: String) {
    companion object {
        const val MAX_BATCH_SIZE = 100
        private var processedCount = 0

        fun getProcessCount() = processedCount
        fun resetProcessCount() =
            println("resetProcessCount()")
    }

    var isActive: Boolean = true

    fun processData(data: String, dataType: String) {
        val handler = object : DataHandler {
            override fun handleData(data: String) {
                println("handelData()")
            }

            override fun canProcess(dataType: String): Boolean = true
        }

        if (handler.canProcess(dataType)) {
            handler.handleData(data)
        }
    }
}

fun main() {
    val processor1 = DataProcessor("TextProcessor")
    processor1.processData("Hello World!", "text")

    println(DataProcessor.getProcessCount())
    DataProcessor.resetProcessCount()
}
