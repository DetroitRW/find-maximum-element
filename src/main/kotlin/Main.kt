import java.lang.Math.abs
import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {
    val r = Random(System.nanoTime()).nextInt(-100, 100)
    val a = 13
    val n = IntArray(13)
    var i = 0
    var j = 0

    while (i < a) {
        val r = Random(System.nanoTime()).nextInt(-100, 100)
        var f = 1
        
        for (j in n) {
            if (abs(j) == abs(r))
            f = 0
            break
        }
        if (f == 1) {
            n[i] = r
            i += 1
        }
    }
