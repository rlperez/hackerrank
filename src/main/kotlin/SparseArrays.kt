import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the findSuffix function below.
 */
fun findSuffix(collections: Array<String>, queryString: String): Int {
    /*
     * Write your code here.
     */
    return Int.MIN_VALUE
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val stringsCount = scan.nextLine().trim().toInt()

    val strings = Array<String>(stringsCount, { "" })
    for (stringsItr in 0 until stringsCount) {
        val stringsItem = scan.nextLine()
        strings[stringsItr] = stringsItem
    }

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val queryString = scan.nextLine()

        val res = findSuffix(strings, queryString)

        println(res)
    }
}
