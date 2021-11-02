package com.jmonclus.problems;

/**
 * Problem url: https://projecteuler.net/problem=9
 * 
 * @author Josep Monclus
 */
public class Problem0009 {
    public static void main(String[] args) {
        int expectadValue = 1000;

        for(int i = expectadValue; i > 0; i--) {
            for(int j = expectadValue - i; j > 0; j--) {
                for(int l = expectadValue - i - j; l > 0; l--) {
                    if(i * i == (j * j) + (l * l)){
                        if(i + j + l == expectadValue) {
                            System.out.println(i + " - " + j + " - " + l);
                            System.out.println(i * j * l);
                        }
                    }
                }
            }
        }
    }
}
