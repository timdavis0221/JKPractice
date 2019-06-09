package com.jk

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    getContentsFromHttpConnWithKotlin()
//    getContentsFromHttpConnWithJava()
}

private fun getContentsFromHttpConnWithKotlin() {
    val url = URL(
        "http://data.tycg.gov.tw/opendata/datalist/datasetMeta/" +
                "download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f"
    )
    // kotlin's readText() get the contents from the given URL and store it into a string
    println(url.readText())

    // use kotlin's with to refactor the code for http connection handling in Java
    with(url.openConnection() as HttpURLConnection) {
        // lines() to get stream and forEach to iterate
        val bufferedReader = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }
}

private fun getContentsFromHttpConnWithJava() {
    val url = URL(
        "http://data.tycg.gov.tw/opendata/datalist/datasetMeta/" +
                "download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f"
    )
    val httpURLConnection = url.openConnection() as HttpURLConnection
    val bufferReader = BufferedReader(InputStreamReader(httpURLConnection.inputStream))
    var strLine = bufferReader.readLine()
    val jsonStr = StringBuffer()
    while (strLine != null) {
        jsonStr.append(strLine)
        strLine = bufferReader.readLine()
    }
    println(jsonStr.toString())
}