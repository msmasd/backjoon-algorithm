package me.msmasd.backjoonalgorithm.bronze

import java.util.*

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A+B를 출력한다.

예제 입력 1
1 2
예제 출력 1
3

 */
class Solution1000 {
    fun solution(a: Int, b:Int): Int {
        return a + b
    }
}

fun main(args: Array<String>) {
    val scanner: Scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val solution1000 = Solution1000()
    val result = solution1000.solution(a, b)
    println(result)
}