package com.solution.leetcode.polindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PolyndromeTest {

    @Test
    void isPolyndrome1() {
        var actual = Polyndrome.isPolyndrome(123);
        assertFalse(actual);
    }

    @Test
    void isPolyndrome2() {
        var actual = Polyndrome.isPolyndrome(12321);
        assertTrue(actual);
    }

}