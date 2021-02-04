import kotlin.math.*

fun main()
{

    var run = true
    loop@ while (run)
    {
        explorer()
        print("Хотите ли вы продолжить тестирование?[да/нет]>> ")
        var user_choise = readLine()!!.toLowerCase()
        when(user_choise)
        {
            "да","lf","Lf","Да","Yes","yes","da" -> continue@loop
            "нет","ytn","Ytn","Нет","No","no" -> break@loop
        }

    }

}
fun explorer()
{
    println("\nВыберите задачу используя внутренний ситаксис программы[Begin1 = b1]")
    print("Список доступных задач:\n")
    println("Begin12")
    println("Begin20")
    print("Выберите задачу для теста: ")
    var user_choise = readLine()!!.toLowerCase()
    when(user_choise)
    {
        "b12" -> Begin12()
        "b20" -> Begin20()
    }
}
fun Begin12()
{
    println("\nBegin12. Решил *****. ")
    println("Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P.")
    print("Введите а: ")
    var a = readLine()!!.toDouble()
    print("Введите b: ")
    var b = readLine()!!.toDouble()
    var c = sqrt(a.pow(2)+b.pow(2))
    var P = a+b+c
print("Гипотенуза = $c\nПериметр = $P\n")
}
fun Begin20()
{
    println("\nBegin20. Решил *****. ")
    println("Найти расстояние между двумя точками с заданными координатами\n(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле.")
    print("Введите x2: ")
    var x2 = readLine()!!.toDouble()
    print("Введите x1: ")
    var x1 = readLine()!!.toDouble()
    print("Введите y2: ")
    var y2 = readLine()!!.toDouble()
    print("Введите y1: ")
    var y1 = readLine()!!.toDouble()
    var Rasstoyanie = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    print("Расстояние между двумя точками = $Rasstoyanie\n")
}


