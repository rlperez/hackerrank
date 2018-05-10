import java.util.*

/*
    Sample Input

    5 3
    1 2 100
    2 5 100
    3 4 100

    Sample Output

    200

    Explanation

    After first update list will be 100 100 0 0 0.
    After second update list will be 100 200 100 100 100.
    After third update list will be 100 200 200 200 100.
    So the required answer will be 200.
*/

/*
 * Complete the arrayManipulation function below.
 */
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Int {
    /*
     * Write your code here.
     */
    val values = IntArray(n, { 0 })

    queries.forEach { q ->
        val startIndex = q[0] - 1
        val endIndex: Int = q[1] - 1
        (startIndex..endIndex).forEach({ i -> values[i] += q[2] })
        // println(values.joinToString(","))
    }

    return values.max()!!
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array(m, { Array(3, { 0 }) })

    for (queriesRowItr in 0 until m) {
        queries[queriesRowItr] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
