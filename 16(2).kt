fun main()
{
    try
    {
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()
        val u = readLine()!!.toDouble()
        val v = readLine()!!.toDouble()
        val x0 = -b/(2*a)
        val y0 = a *x0*x0+b*x0+c
        val yu = a * u * u + b * u + c
        val yv = a * v * v + b * v + c
        val minvalue = listOf(yu,yv,y0).minOrNull()
        val maxvalue = listOf(yu,yv,y0).maxOrNull()
        println("Минимальное значение "+ minvalue)
        print("Максимальное значение "+ maxvalue)

    }
    catch (e:Exception)
    {
        print("Некорректно введенный тип данных")
    }
}