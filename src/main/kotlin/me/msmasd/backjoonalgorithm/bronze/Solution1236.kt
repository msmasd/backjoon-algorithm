package me.msmasd.backjoonalgorithm.bronze

import java.util.*
import kotlin.math.max


/*
문제
영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다. 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.

출력
첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.

예제 입력 1 
4 4
....
....
....
....
예제 출력 1 
4
 */
class Solution2475 {
}


fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val horizontalResult = IntArray(n)
    val verticalResult = IntArray(m)

    for (i in 0 until n) {
        readLine().toCharArray().forEachIndexed { index, c ->
            if (c == 'X') {
                horizontalResult[i] += 1
                verticalResult[index] += 1
            }
        }
    }

    val requiredHorizontal = horizontalResult
        .filter { it == 0 }
        .count()
    val requiredVertical = verticalResult
        .filter { it == 0 }
        .count()
    print(max(requiredHorizontal, requiredVertical))
}