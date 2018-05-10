import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the array2D function below.
 */
fun array2D(arr: Array<Array<Int>>): Int {
    /*
     * Write your code here.
     */
    var sums: List<Int> = emptyList()
    for (i in (0..arr.size - 3)) {
        for (j in (0..arr.first().size - 3)) {
            val sum =
                    arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            sums += sum
        }
    }

    return sums.max()!!
}

fun array2D_1(arr: Array<Array<Int>>): Int {
    /*
     * Write your code here.
     */
    var max = Int.MIN_VALUE
    for (i in (0..arr.size - 3)) {
        for (j in (0..arr.first().size - 3)) {
            val sum =
                    arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            if (sum > max) max = sum
        }
    }

    return max
}

/*
            println(arr[i][j].toString() + " " + arr[i + 1][j] + " " + arr[i + 2][j])
            println("  " + arr[i + 1][j + 1])
            println(arr[i + 2][j].toString() + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2])

 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (arrRowItr in 0 until 6) {
        arr[arrRowItr] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = array2D(arr)

    println(result)
}
