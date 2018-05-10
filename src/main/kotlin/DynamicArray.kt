import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the dynamicArray function below.
 */
fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    /*
     * Write your code here.
     */
    return emptyArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nq = scan.nextLine().split(" ")

    val n = nq[0].trim().toInt()

    val q = nq[1].trim().toInt()

    val queries = Array<Array<Int>>(q, { Array<Int>(3, { 0 }) })

    for (queriesRowItr in 0 until q) {
        queries[queriesRowItr] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = dynamicArray(n, queries)

    println(result.joinToString("\n"))
}
