package com.jmonclus.problems;

import java.math.BigDecimal;

/**
 * Problem url: https://projecteuler.net/problem=28
 * 
 * @author Josep Monclus
 */
public class Problem0028 {
    public static void main(String[] args) {
        int n = 1001;

        int[][] matrix = drawClockWiseMatrix(n);

        /*
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }
        */

        BigDecimal sumDiagonals = new BigDecimal(0);

        // Top left -> Bottom right
        for(int i = 0; i < n; i++) {
            sumDiagonals = sumDiagonals.add(new BigDecimal(matrix[i][i]));
        }

        // Bottom left -> Top right
        for(int i = 0; i < n; i++) {
            int x = (n - 1) - i;
            int y = (n - 1) - x;
            sumDiagonals = sumDiagonals.add(new BigDecimal(matrix[x][y]));
        }

        // Substract 1 again because center is added twice
        sumDiagonals = sumDiagonals.subtract(new BigDecimal(1));

        System.out.println("Sum diagonals = " + sumDiagonals);
    }

    private static int[][] drawClockWiseMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int center = n / 2;
        int max = n * n;

        // Directions:
        //  0 = right
        //  1 = down
        //  2 = left
        //  3 = up
        int direction = 0;

        int x = center, y = center, i = 0, k = 1, c = 1;

        matrix[x][y] = i;

        while(i < max) {
            i++;
            c--;

            matrix[x][y] = i;

            switch (direction){
                case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
            }

            if(c == 0) {
                direction = switchDirection(direction);

                switch (direction){
                    case 0:
                        k++;
                        c = k;
                        break;
                    case 1:
                        c = k;
                        break;
                    case 2:
                        k++;
                        c = k;
                        break;
                    case 3:
                        c = k;
                        break;
                }
            }
        }

        return matrix;
    }

    private static int switchDirection(int actualDirection) {
        if(actualDirection == 3) {
            return 0;
        } else {
            return actualDirection + 1;
        }
    }
}
