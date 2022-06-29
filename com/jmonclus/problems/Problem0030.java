package com.jmonclus.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem url: https://projecteuler.net/problem=30
 * 
 * @author Josep Monclus
 */
public class Problem0030 {
    public static void main(String[] args) {
        int pow = 5;
        List<Integer> equalPowers = new ArrayList<>();
        
        int number = 2;
        while(true) {

            List<Integer> digits = separateDigits(number);

            int sumOfDigitPowers = 0;

            for(Integer digit : digits) {
                sumOfDigitPowers += calculatePower(digit, pow);
            }


            if(number > 10000000) {
                break;
            } else {
                if(number == sumOfDigitPowers){
                    equalPowers.add(number);
                }

                number++;
            }
        }

        System.out.println("Equal number to sum of " + pow + "th powers: " + equalPowers);
        
        int sum = 0;
        for(Integer power : equalPowers) {
            sum += power;
        }
        System.out.println("Sum of powers: " + sum);
    }

    private static int calculatePower(int number, int pow) {
        return (int) Math.pow(number, pow);
    }

    private static List<Integer> separateDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        while(number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        return digits;
    }
}
