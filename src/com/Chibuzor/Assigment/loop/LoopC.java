package com.Chibuzor.Assigment.loop;


    public class LoopC {
        public static void main(String[] args) {
            int i, j, k, myInput;
            myInput=6;
            for(i = 0; i<= myInput-1; i++){
                for (j = 0; j<= i; j++ ){
                    System.out.print(" ");
                }
                for (k = 0; k<= myInput-1-i; k++){
                    System.out.print("*" + " ");
                }

                System.out.println();
            }
        }
    }


