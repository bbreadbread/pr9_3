package Chet

open class Klient (var balance:Double) {
    open fun GetChet():Double {
        println("Баланс на вашей банковской карте:")
        balance = readLine()!!.toDouble()
        return  balance
    }
}