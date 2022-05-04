package com.jmonclus.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem url: https://projecteuler.net/problem=24
 * 
 * @author Josep Monclus
 */
public class Problem0024 {

    private static List<String> permutations;
    public static void main(String[] args) {
        
        String s = "0123456789";

        permutations = new ArrayList<String>();

        printPermutn(s, "");
        
        System.out.println(permutations.size());
        
        System.out.println(permutations.size() >= 1000000 ? permutations.get(999999) : "Less than 1000000 answers!");
    }

    static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            //System.out.print(ans + " ");
            permutations.add(ans);
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
