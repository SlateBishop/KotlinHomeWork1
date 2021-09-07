package ru.gb.makulin.homework1

class CyclesTest {

    private val testData = listOf<String>("1", "2", "3", "4")

    fun foreachTest() {
        println("foreachTest")
        for (data in testData) {
            println(data)
        }
    }

    fun forTest() {
        println("forTest")
        for (i in 0 until testData.size) {
            println(testData[i])
        }
    }

    fun downToTest() {
        println("downToTest")
        for (i in testData.size-1 downTo 0){
            println(testData[i])
        }
    }


}