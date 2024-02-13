fun main()
{
    try
    {
        var K = readLine()!!.toInt()
        var digit1 =K/100
        var digit2 = (K/10)%10
        var digit3 = K%10
        when((digit1 < digit2 && digit2 < digit3) || (digit1 > digit2 && digit2 > digit3))
        {
            true -> print("Цифры числа K образуют упорядоченную последовательность")
            false -> print("Цифры числа K не образуют упорядоченную последовательность")
        }
    }
    catch(e:Exception)
    {
                print("Некорректно введенный тип данных")
    }
}