package org.example.ch4.section5_collection_api

import java.io.File

data class Data(val id: Int, val name: String, val addr: String, val age: String)


fun main() {
    //file읽기
    val file = File("build/resources/main/test.json")
    val inputStream = file.inputStream()
    //json에서 읽은 문자열
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)

    //gson으로 json문자열을 파싱하여 원하는 개체 타입으로 변형.
    val gson = com.google.gson.Gson()
    val list: List<Data> = gson.fromJson(inputString, Array<Data>::class.java).toList()

    println(list)

    //seoul이 포함 된 데이터중 age로 grouping
    list.filter { it.addr == "seoul" }.groupBy { it.age }.forEach {
        println("${it.key} - ${it.value.count()}명")
        it.value.forEach {
            println("${it.name} ${it.addr} ${it.age}")
        }
    }
}
