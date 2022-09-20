package chapter6;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;




        for (int i = 1; i <= 60_000_000 ; i++) {
            int face = 1 + random.nextInt(6);


            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;

            }
        }
        System.out.println("face\tfrequency");
        System.out.printf("1\t%d%n2\t%d%n\t3%d%n\t4%d%n\t5%d%n\t6%d%n",frequency1, frequency2,
                frequency3, frequency4, frequency5, frequency6 );
        }

    }

