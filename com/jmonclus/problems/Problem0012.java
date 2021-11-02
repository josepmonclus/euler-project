package com.jmonclus.problems;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem0012 {

    private static List<BigInteger> primes = new ArrayList<>();

    public static void main(String[] args) {
        
        int n = 1;
        boolean found = false;

        BigInteger sum = BigInteger.ZERO;

        while(!found) {
            
            sum = sum.add(BigInteger.valueOf(n));

            List<BigInteger> divisors = new ArrayList<>();

            BigInteger counter = BigInteger.ONE;
            BigInteger limit = sum;

            while (counter.compareTo(limit) < 0) {
                if(sum.mod(counter).compareTo(BigInteger.ZERO) == 0) {
                    divisors.add(counter);
                    BigInteger divPartner = sum.divide(counter);
                    divisors.add(divPartner);
                    limit = divPartner;
                }

                counter = counter.add(BigInteger.ONE);
            }

            if(divisors.size() >= 500) {
                System.out.println("FOUNDED!! " + "n: " + n + " - sum: " + sum + " - divisors: " + divisors.size());

                found = true;
            } else {
                System.out.println("n: " + n + " - sum: " + sum + " - divisors: " + divisors.size());
            }

            n++;
        }

        
    }
}
