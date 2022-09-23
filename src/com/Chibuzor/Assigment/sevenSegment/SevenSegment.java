package com.Chibuzor.Assigment.sevenSegment;

public class SevenSegment {

        static int[][] board = new int[5][4];

        public static void main(String[] args) {

            setBoard("11011011");
            display();
        }

        public static void display(){
            for (int [] i: board){
                for (int j: i){
                    if (j == 1){
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                } System.out.println();
            }

        }
        static void fillA() {

            board[0][0] = 1;
            board[0][1] = 1;
            board[0][2] = 1;
            board[0][3] = 1;

        }

        static void fillB() {
            board[0][3] = 1;
            board[1][3] = 1;
            board[2][3] = 1;
        }

        static void fillC() {
            board[2][3] = 1;
            board[3][3] = 1;
            board[4][3] = 1;

        }

        static void fillD() {
            board[4][0] = 1;
            board[4][1] = 1;
            board[4][2] = 1;
            board[4][3] = 1;

        }

        static void fillE() {
            board[2][0] = 1;
            board[3][0] = 1;
            board[4][0] = 1;

        }

        static void fillF() {
            board[0][0] = 1;
            board[1][0] = 1;
            board[2][0] = 1;

        }

        static void fillG() {
            board[2][1] = 1;
            board[2][2] = 1;

        }

        static void setBoard(String input) {

            if (input.length() > 8) {
                input = input.substring(0, 8);
            }

            char[] ch = input.toCharArray();

            for (char i : ch) {
                if (!(i == '1' || i == '0')) {
                    throw new IllegalArgumentException("the values are only '1's and '0's ");
                }
            }



            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '1') {
                    switch (i) {
                        case 0 -> fillA();
                        case 1 -> fillB();
                        case 2 -> fillC();
                        case 3 -> fillD();
                        case 4 -> fillE();
                        case 5 -> fillF();
                        case 6 -> fillG();
                    }

                }


            }

        }
    }


