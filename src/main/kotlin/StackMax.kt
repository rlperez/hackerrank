import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scan = Scanner(System.`in`)

    val arrCount = scan.nextLine().trim().toInt()
    val stack: Stack<Long> = Stack()
    val maxStack: Stack<Long> = Stack()

    (0 until arrCount).forEach {
        val line = scan.nextLine().split(" ")
        val instruction = line.first().toInt()
        val value = line.last().toLong()
        when (instruction) {
            1 -> {
                // Push
                stack.push(line.last().toLong())
                if (maxStack.empty() || maxStack.peek() <= value) maxStack.push(value)
            }
            2 -> {
                // Pop
                val popped = stack.pop()
                if (!maxStack.empty() && maxStack.peek() == popped) maxStack.pop()
            }
            3 -> {
                // Max
                if (!maxStack.empty()) println(maxStack.peek())
            }
        }
    }
}
