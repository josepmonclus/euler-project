package com.jmonclus.problems;
import java.math.BigInteger;

/**
 * Problem url: https://projecteuler.net/problem=14
 * 
 * @author Josep Monclus
 */
public class Problem0014 {
    public static void main(String[] args) {
        
        int nStart = 1000000;
        int nMax = 0, kMax = 0;

        for(int i = nStart; i > 1; i--){
            BigInteger n = BigInteger.valueOf(i);
            int k = 1;

            while (n.compareTo(BigInteger.valueOf(1)) != 0) {
                if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) { // even
                    n = n.divide(BigInteger.valueOf(2));
                } else { // odd
                    n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
                }

                k++;
            }

            if(k > kMax) {
                nMax = i;
                kMax = k;
            }
        }

        System.out.println("n = " + nMax + " - k = " + kMax);
    }
}