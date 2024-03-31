package com.solution.leetcode.luhn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnAlgorithmTest {

    @Test
    void isValidCard() {
        var actual = LuhnAlgorithm.isValidCard("79927398713");
        assertTrue(actual);
    }
}