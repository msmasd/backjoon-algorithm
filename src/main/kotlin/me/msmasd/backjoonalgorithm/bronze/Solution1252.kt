package me.msmasd.backjoonalgorithm.bronze

class Solution1252(
    private val a: String,
    private val b: String
) {
    private val result = StringBuffer()

    fun solution(): String {
        var carry = 0
        var i = 0
        while (true) {
            if (a.length <= i && b.length <= i && carry == 0) {
                break
            }
            plus(getValue(a, i), getValue(b, i), carry).let {
                carry = it.first
                result.insert(0, it.second)
            }
            i++
        }
        removeFirstZero()
        return result.toString()
    }

    private fun getValue(target: String, digit: Int): Int {
        if (target.length <= digit) {
            return 0
        }
        return target[target.length - digit - 1].digitToInt()
    }

    private fun plus(a: Int, b: Int, carry: Int): Pair<Int, Int> {
        val result = a + b + carry
        return result / 2 to result % 2
    }

    private fun removeFirstZero() {
        while (result[0] == '0' && result.length > 1) {
            result.deleteCharAt(0)
        }
    }
}

fun main() = with(System.`in`.bufferedReader()) {
    val input = this.readLine().split(" ")
    val solution = Solution1252(input[0], input[1])
    print(solution.solution())
}