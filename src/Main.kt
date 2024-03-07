import kotlin.random.Random

fun main() {
    val array = DoubleArray(15)
    for (iy in array.indices) {
        array[iy] = Random.nextDouble(-100.0, 100.0)
    }

    println("Массив дробных чисел:")
    println(array.joinToString(", "))

    var summ = 0.0
    var coun = 0

    var foundNegative = false

    for (number in array) {
        if (number < 0) {
            foundNegative = true
        } else if (foundNegative) {
            summ += number
            coun++
        }
    }

    if (coun > 0) {
        val arage = summ / coun
        println("Среднее арифметическое положительных чисел после первого отрицательного: $arage")
    } else {
        println("После первого отрицательного числа не было найдено положительных чисел.")
    }
}