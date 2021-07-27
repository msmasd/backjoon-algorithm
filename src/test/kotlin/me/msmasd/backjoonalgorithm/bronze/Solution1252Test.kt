package me.msmasd.backjoonalgorithm.bronze

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Solution1252Test {

    @Test
    fun solution() {
        assertThat(Solution1252("1111", "1111").solution()).isEqualTo("11110")
        assertThat(Solution1252("11111", "1111").solution()).isEqualTo("101110")
        assertThat(Solution1252("0", "0").solution()).isEqualTo("0")
        assertThat(Solution1252("000011111", "00001111").solution()).isEqualTo("101110")
    }
}