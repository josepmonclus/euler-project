package com.jmonclus.problems;

import java.math.BigDecimal;

/**
 * Problem url: https://projecteuler.net/problem=25
 * 
 * @author Josep Monclus
 */
public class Problem0025 {
    public static void main(String[] args) {
        int nDigits = 1000;

        BigDecimal n1 = new BigDecimal(1);
        BigDecimal n2 = new BigDecimal(1);
        int count = 2;
        
        BigDecimal aux;

        while (n2.toString().toCharArray().length != nDigits) {
            aux = n1.add(n2);
            
            n1 = n2;
            n2 = aux;

            count++;
        }

        System.out.println("First Fibonacci term with " + nDigits + " digits is: " + count);
    }
}
