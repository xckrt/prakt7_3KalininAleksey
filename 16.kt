fun main()
{
    try
    {
        var v1 = readLine()!!.toDouble()
        var v2 = readLine()!!.toDouble()
        var s = readLine()!!.toDouble()
        var t = readLine()!!.toDouble()
            var s2 = s - (v1+v2)*t
        print("Расстояние между автомобилями $s2")
    }
    catch (e:Exception)
    {
        print("Некорректно введенный тип данных")
    }
}
