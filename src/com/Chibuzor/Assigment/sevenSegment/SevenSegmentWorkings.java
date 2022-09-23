package com.Chibuzor.Assigment.sevenSegment;


public class SevenSegmentWorkings
    {

        public static void main(String[] args) {

            method1();
        }

        static void method1() {
            int[][] array = new int[3][3];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = 1;
                }
            }
            for (int[] i : array) {
                for (int j : i) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        static void method2() {
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = 1;
            }
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println();
        }

        static void method3() {
            int[][] board = new int[4][5];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = 1;
                }
            }
            for (int[] i : board) {
                for (int j : i) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }

        static void method4() {
            int[][] sweet = new int[5][4];
            for (int i = 0; i < sweet.length; i++) {
                for (int j = 0; j < i; j++) {
                    sweet[0][0]=1;
                    sweet[0][1]=1;
                    sweet[0][2]=1;
                    sweet[0][3]=1;

                }
            }
            for (int[] i : sweet) {
                for (int j : i) {
                    System.out.print(j  );
                }
                System.out.println();
            }
        }


        static void fill(){
            int [][]fill = new int[3][3];
            for (int i = 0; i < fill.length; i++) {
                for (int j = 0; j < i; j++) {
                    fill[0][1]=1;

                }

            }
        }
    }










