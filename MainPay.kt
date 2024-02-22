import Chet.Klient as Chet
import Operations as Oper

fun main()
{
    var Ch = Chet(0.0)
    var money = Ch.GetChet()
    var Op = Oper(0, 0.0,0, 0, money)
    do
    {
        Op.Choice()
        if (Op.answer == 1) Op.One()
        else if (Op.answer == 2) Op.Two()
        else if (Op.answer == 3) Op.Three()
        else if (Op.answer == 4) Op.Four()
        else println("Неизвестное действие")
        if (Op.bb == 5 ) break
    }
    while (Ch.balance > 0 || Op.bb != 5)

}