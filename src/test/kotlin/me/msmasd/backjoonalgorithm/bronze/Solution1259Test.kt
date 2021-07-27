package me.msmasd.backjoonalgorithm.bronze

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Solution1259Test {

    @Test
    fun solution() {
        assertThat(Solution1259("121".toCharArray()).solution()).isEqualTo("yes")
        assertThat(Solution1259("1231".toCharArray()).solution()).isEqualTo("no")
        assertThat(Solution1259("12421".toCharArray()).solution()).isEqualTo("yes")
    }
}