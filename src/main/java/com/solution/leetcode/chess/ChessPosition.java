package com.solution.leetcode.chess;

public class ChessPosition {
    public static String solution(String position, int right, int top) {

        int zeroIndex = '0';
        int aIndex = 'a';
        int chessBoardSize = 8;

        int row = position.charAt(0) - zeroIndex;
        int column = Character.toLowerCase(position.charAt(1)) - aIndex;

        int newRow = (row + top) % chessBoardSize;
        int newColumn = (column + right) % chessBoardSize;

        String newPosition = ((newRow == 0) ? chessBoardSize : newRow) + "" + (char) (newColumn + aIndex);
        return newPosition;
    }
}
