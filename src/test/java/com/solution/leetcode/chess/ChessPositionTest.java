package com.solution.leetcode.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessPositionTest {

    @Test
    void solution1() {
        var actual = ChessPosition.solution("5a", 5, 21);
        assertEquals("2f", actual);
    }

    @Test
    void solution2() {
        var actual = ChessPosition.solution("5a", 7, 3);
        assertEquals("8h", actual);
    }

    @Test
    void solution3() {
        var actual = ChessPosition.solution("5a", 8, 4);
        assertEquals("1a", actual);
    }

    @Test
    void solution4() {
        var actual = ChessPosition.solution("5A", 5, 21);
        assertEquals("2f", actual);
    }

    @Test
    void solution5() {
        var actual = ChessPosition.solution("5A", 7, 3);
        assertEquals("8h", actual);
    }

    @Test
    void solution6() {
        var actual = ChessPosition.solution("5A", 8, 4);
        assertEquals("1a", actual);
    }
}