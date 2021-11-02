package com.jmonclus.problems;

/**
 * Problem url: https://projecteuler.net/problem=1
 * 
 * @author Josep Monclus
 */
public class Problem0001 {
    public static void main(String[] args) {
        
        int n = 1000;
        int total = 0;

        while (n > 0) {
            n--;

            if(n % 3 == 0 || n % 5 == 0) {
                total += n;
            }
        }

        System.out.println(total);
    }
}
