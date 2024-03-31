package com.solution.leetcode.luhn;

public class LuhnAlgorithm {

    public static boolean isValidCard(String cardNumber) {

        int sum = 0;

        for(int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.charAt(i) + "");
            if(i % 2 == 1) {
                n = n * 2;

                n = (n % 10) + (n / 10);

            }

            sum += n;
        }

        return sum % 10 == 0;
    }
}
