package com.jmonclus.problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Problem url: https://projecteuler.net/problem=29
 * 
 * @author Josep Monclus
 */
public class Problem0029 {
    public static void main(String[] args) {
        int min = 2, max = 100;

        List<BigDecimal> resultList = new ArrayList<BigDecimal>();

        for(int i = min; i <= max; i++){
            for(int j = min; j <= max; j++) {
                BigDecimal base = new BigDecimal(i);

                resultList.add(base.pow(j));
            }
        }

        LinkedHashSet<BigDecimal> set = new LinkedHashSet<>(resultList);
  
        System.out.println("Size of ordered unique list: " + set.size());
    }
}
