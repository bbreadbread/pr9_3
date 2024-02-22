import Chet.*

class Operations(var answer: Int, var price: Double, var error: Int = 0, var bb: Int = 0, balance: Double): Klient(balance) {
    fun Choice()
    {
        println("ВАШ БАЛАНС: $balance.")
        println("Выберите действие.")
        println("1. Оплатить заказ.")
        println("2. Сделать платеж на другой счет.")
        println("3. Заблокировать карту.")
        println("4. Аннулировать счет.")
        answer = readLine()!!.toInt()
    }
    fun One()
    {
        println("Введите стоимость заказа: ")
        price = readLine()!!.toDouble()
        if(balance>=price)
        {
            balance -= price
            println("Покупка успешно совершена!")
        }
        else if (error!=2)
        {
            error++
            println("Ошибка! Денег на вашем счете не хватает.")
            println("Предупреждение $error.")
        }
        else
        {
            bb = 5
            println("Получено три предупреждения. Ваш счет заблокирован!")
        }
    }
    fun Two()
    {
        println("Введите, какую сумму желаете перевести на другой счет: ")
        price = readLine()!!.toDouble()
        if(balance>=price)
        {
            balance -= price
            println("Перевод успешно совершен!")
        }
        else if (error!=2)
        {
            error++
            println("Ошибка! Денег на вашем счете не хватает.")
            println("Предупреждение $error.")
        }
        else
        {
            bb = 5
            println("Получено три предупреждения. Ваш счет заблокирован!")
        }
    }
    fun  Three() {
        println("Подтвердите действие. ")
        println("1. Заблокировать карту.")
        println("2. Отмена.")
        var pod = readLine()!!.toInt()
        if (pod == 1)
        {
            bb = 5
            println("Карта успешно заблокирована!")
        }
        else if (pod == 2)
        {
            println("Действие отменено.")
        }
        else println("Неизвестное действие.")
    }
    fun Four() {
        println("Подтвердите действие. ")
        println("1. Аннулировать карту.")
        println("2. Отмена.")
        var pod = readLine()!!.toInt()
        if (pod == 1)
        {
            balance = 0.0
            println("Карта успешно аннулирована!")
        }
        else if (pod == 2)
        {
            println("Действие отменено.")
        }
        else println("Неизвестное действие.")
    }
}