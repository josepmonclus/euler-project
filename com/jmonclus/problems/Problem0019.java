package com.jmonclus.problems;

import java.util.Calendar;

/**
 * Problem url: https://projecteuler.net/problem=19
 * 
 * @author Josep Monclus
 */
public class Problem0019 {
    public static void main(String[] args) {
        // 1st January 1901
        Calendar start = Calendar.getInstance();
        start.set(1901, 0, 1);

        // 31st December 2000
        Calendar end = Calendar.getInstance();
        end.set(2000, 11, 31);

        Calendar work = start;

        int countSundays = 0;
        
        while(work.compareTo(end) <= 0){

            if(work.get(Calendar.DAY_OF_MONTH) == 1 && work.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                countSundays++;
            }

            work.add(Calendar.MONTH, 1);
        }

        System.out.println("Sundays on the first of the month during the twentieth century: " + countSundays);
    }
}
