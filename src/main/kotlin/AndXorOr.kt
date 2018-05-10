import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the andXorOr function below.
 */
fun andXorOr(a: Array<Int>): Int {
    /*
     * Write your code here.
     */
    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val aCount = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = andXorOr(a)

    println(result)
}
