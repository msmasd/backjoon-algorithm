package me.msmasd.backjoonalgorithm.bronze

class Solution1259(private val number: CharArray) {
    fun solution(): String {
        // 펠린드롬은 cursor를 통해 처음부터 마지막까지 가는방향으로 진행. 그사이에 틀리다면 no 리턴, 다 통과하면 yes
        val size = number.size / 2
        for (i in 0 until size) {
            if (number[i].equals(number[number.size - i - 1]).not()) {
                return "no"
            }
        }
        return "yes"
    }
}

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val number = this.readLine()
        if (number.equals("0")) break
        println(Solution1259(number.toCharArray()).solution())
    }
}