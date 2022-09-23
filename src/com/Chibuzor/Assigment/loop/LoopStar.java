package com.Chibuzor.Assigment.loop;

public class LoopStar {

    public static void main(String[] args) {

        // m is the even number
        int m = 0;
        // number of rows
        int k = 5;

        for (int i = 1; i <= k; ++i, m =0){
            for(int j = 1; j <= k - i; ++j){
                System.out.print("  ");
            }
            while (m != 2 * i - 1){
                System.out.print("* ");
                ++m;
            }
            System.out.println();
        }
    }
}

