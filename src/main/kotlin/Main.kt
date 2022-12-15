import java.lang.Math.abs
import java.util.*

fun main(args: Array<String>) {
    
    val array = makeArrae()
    val maxAbsIndex = findMaxAbsIndexInArray(array)

    printMaxAbsElementInArray(array, maxAbsIndex)
}

fun randomNumber(): Int {
    return Random(System.nanoTime()).nextInt(-100, 100)
}

fun printMaxAbsElementInArray(array: IntArray, MaxAbsInex: Int) {
    for ( item in array ) {
        print("$item, ")
    }
    println()
    print("Максимальный по модулю $MaxAbsInex элемент равен ${array[MaxAbsInex]}")
}
fun findMaxAbsIndexInArray(array: IntArray): Int {
    var i = 0
    var j = 0

    for (i in 1.. array.size - 1) {
        if (abs(array[i]) > abs(array[j])) {
            j = i
        }
    }
    return j
}

fun makeArrae(): IntArray {
    val array = IntArray(13)
    var i = 0

    while (i < array.size) {
        val r = randomNumber()
        var f = 1

        for (j in array) {
            if (abs(j) == abs(r))
                f = 0
            break
        }
        if (f == 1) {
            array[i] = r
            i += 1
        }
    }
    return array
}