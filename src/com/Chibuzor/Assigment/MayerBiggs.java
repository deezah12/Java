
package com.Chibuzor.Assigment;
import java.util.Scanner;


    public class MayerBiggs {

        public static void main(String[] args) {
            questions();
            display();
        }

        private static final int[][] array = new int[4][2];

        static void arrayWidth() {
            array[0][0] = 0;
            array[0][1] = 0;
            array[1][0] = 0;
            array[1][1] = 0;
            array[2][0] = 0;
            array[2][1] = 0;
            array[3][0] = 0;
            array[3][1] = 0;
        }

        static void questions() {
            Scanner input = new Scanner(System.in);
            String answer;
            System.out.print("Select Options");
            answer = input.nextLine();

            for (int i = 0; i <= 20; i++) {

                switch (i) {
                    case 1:
                        System.out.print("""
                            A. Expended energy, enjoy groups.
                            B. Conserved energy, enjoy one-on-one.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else
                            array[0][1]++;

                        break;
                    case 2:
                        System.out.print("""
                            A. Interpret literally.
                            B. Look for meaning and possibilities.
                          
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[1][0]++;
                        }
                        else
                            array[1][1]++;

                        break;
                    case 3:
                        System.out.print("""
                            A. Logical, thinking, questioning.
                            B. Empathetic,feeling, accommodating.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[2][0]++;
                        }
                        else
                            array[2][1]++;

                        break;
                    case 4:
                        System.out.print("""
                            A. Organized, orderly.
                            B.flexible adaptive.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else
                            array[3][1]++;

                        break;
                    case 5:
                        System.out.print("""
                            A. More out going.
                            B. Thinking out loud.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else
                            array[0][1]++;

                        break;
                    case 6:
                        System.out.print("""
                            A. Practical, realistic, experiential
                            B. Imaginative, innovative, theoretical.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[1][0]++;
                        }
                        else
                            array[1][1]++;

                        break;
                    case 7:
                        System.out.print("""
                            A. Candid, straight forward, frank.
                            B. Tactful, kind, encouraging.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[2][0]++;
                        }
                        else
                            array[2][1]++;

                        break;
                    case 8:
                        System.out.print("""
                            A. Plan, schedule.
                            B. Unplanned, spontaneous.
                          
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else
                            array[3][1]++;

                        break;
                    case 9:
                        System.out.print("""
                            A. Seek many tasks,public activities, interaction with others.
                            B.Seek privately, solitary activities with quiet to concentrate.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else
                            array[0][1]++;

                        break;
                    case 10:
                        System.out.print("""
                            A. Standard, usual, conventional.
                            B. Different, novel, unique.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[1][0]++;
                        }
                        else
                            array[1][1]++;

                        break;
                    case 11:
                        System.out.print("""
                            A. firm, tend to criticize, hold the line.
                            B. Gentle tend to appreciate, conciliate.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[2][0]++;
                        }
                        else
                            array[2][1]++;

                        break;
                    case 12:
                        System.out.print("""
                            A. Regulated, structured.
                            B. Easygoing,"live" and "let live"
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else
                            array[3][1]++;

                        break;
                    case 13:
                        System.out.print("""
                            A. External, communicative,express yourself.
                            B. Internal, reticent, keep to yourself.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else
                            array[0][1]++;

                        break;
                    case 14:
                        System.out.print("""
                            A. Focus here-and-now.
                            B. Look to the future, global perspective,"big picture".
                          
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[1][0]++;
                        }
                        else
                            array[1][1]++;

                        break;
                    case 15:
                        System.out.print("""
                            A. Tough minded, just.
                            B. Tender hearted, merciful.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[2][0]++;
                        }
                        else
                            array[2][1]++;

                        break;
                    case 16:
                        System.out.print("""
                            A. Preparation, plan ahead.
                            B. Go with the flow,adapt as you go.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else
                            array[3][1]++;

                        break;
                    case 17:
                        System.out.print("""
                            A. Active, initiate.
                            B. Reflective, deliberate.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else
                            array[0][1]++;

                        break;
                    case 18:
                        System.out.print("""
                            A. Fact, things, "what is".
                            B. Ideas dreams "what could be",philosophical.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[1][0]++;
                        }
                        else
                            array[1][1]++;

                        break;
                    case 19:
                        System.out.print("""
                            A. Matter of fact, issue-oriented.
                            B. Sensitive,people-oriented,compassionate.
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[2][0]++;
                        }
                        else
                            array[2][1]++;

                        break;
                    case 20:
                        System.out.print("""
                            A. Control, govern.
                            B. Latitude, freedom.
                          
                            """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else
                            array[3][1]++;

                        break;
                    default:
                        break;

                }

            }
        }

        static void display(){
            String self1 = "";
            String self2 = "";
            String self3 = "";
            String self4 = "";



            if (array [0][0] > array [0][1]){
                self1 = "E";
            }
            else
                self1 = "I";

            if (array [1][0] > array [1][1]){
                self2 = "S";
            }
            else
                self2 = "N";
            if (array [2][0] > array [2][1]){
                self3= "T";
            }

            else
                self3 = "F";
            if (array [3][0] > array [3][1]){
                self4 = "J";
            }
            else
                self4 = "P";
            System.out.print("your personality is " + self1 + self2 + self3 + self4);
        }
    }

