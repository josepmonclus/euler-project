package com.jmonclus.problems;

import java.math.BigDecimal;

/**
 * Problem url: https://projecteuler.net/problem=16
 * 
 * @author Josep Monclus
 */
public class Problem0016 {
    public static void main(String[] args) {
        int base = 2;
        int exp = 1000;

        BigDecimal result = new BigDecimal(base).pow(exp);

        System.out.println("Result of " + base + "^" + exp + " = " + result);

        String sResult = result.toString();
        char[] chars = sResult.toCharArray();

        BigDecimal sumOfChars = new BigDecimal(0);

        for(char c : chars) {
            sumOfChars = sumOfChars.add(new BigDecimal(Character.toString(c)));
        }

        System.out.println("Sum of digits: " + sumOfChars);
    }
}
