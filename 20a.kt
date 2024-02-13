import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    try
    {
        var x = readLine()!!.toDouble()

        when (x in -1.0..1.0)
        {
            true ->
            {
                    var y = sqrt(x.pow(2)+1)
                    print(y)
            }
            false ->
            {
                var y = x-1
                print(y)
            }
        }

    }
    catch (e: Exception)
    {
        print("Некорректно введенный тип данных")
    }
}