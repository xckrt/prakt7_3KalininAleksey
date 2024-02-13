
fun main()
{
    try
    {
        var t = readLine()!!.toDouble()
        var a = readLine()!!.toDouble()
        var v0 = readLine()!!.toDouble()
        var s = v0*t+(a*Math.pow(t,2.0))/2
        print("Расстояние = " + s)
    }
    catch(e:Exception)
    {
        print("Некорректно введенный тип данных")
    }
}