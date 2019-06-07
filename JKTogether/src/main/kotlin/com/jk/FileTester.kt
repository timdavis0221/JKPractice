package com.jk

import java.io.File

fun main() {
//    writeOutInKotlin()

    // amazing read in kotlin !!
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun writeOutInKotlin() {
//    File("output.txt").writeText("abc")
    /* Note :
     * "use" will auto close printWriter object (FileWriter in java)
     * no need to close like FileWriter in Java.
     */
    File("output1").printWriter().use {
        // same as bufferdWriter.write("first line\n")
        it.println("write first line by printWriter")
        it.println("write second line by printWriter")
    }

    File("output2.txt").bufferedWriter().use {
        it.write("write first line by BufferedWriter\n")
        it.write("write second line by BufferedWriter\n")
    }
}