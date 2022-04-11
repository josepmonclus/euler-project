package com.jmonclus.problems;

import java.math.BigDecimal;


/**
 * Problem url: https://projecteuler.net/problem=20
 * 
 * @author Josep Monclus
 */
public class Problem0020 {
    public static void main(String[] args) {
        int n = 100;

        System.out.print(n + "! = ");

        BigDecimal factorial = new BigDecimal(1);
        while (n > 0) {
            factorial = factorial.multiply(new BigDecimal(n));

            n--;
        }

        System.out.println(factorial);

        char[] chars = factorial.toString().toCharArray();

        BigDecimal sumOfChars = new BigDecimal(0);

        for(char c : chars) {
            sumOfChars = sumOfChars.add(new BigDecimal(Character.toString(c)));
        }

        System.out.println("Sum of digits: " + sumOfChars);
    }
}
