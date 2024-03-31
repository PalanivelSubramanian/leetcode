package com.solution.leetcode.polindrome;

import java.util.stream.IntStream;

public class Polyndrome {
    public static boolean isPolyndrome(int x){

        if(x == 0)
            return true;

        if(x < 0)
            return false;

        if((x % 10) == 0)
            return false;

        int reversedX = 0;

        while(x > reversedX){
            reversedX = reversedX * 10 + x % 10;
            x /= 10;
        }

        return x == reversedX || x == reversedX / 10;
    }

}
