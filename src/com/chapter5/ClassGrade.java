package com.chapter5;

import java.util.Scanner;

public class ClassGrade {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade from range 0 - 100" +
                "type the end line indicator tp terminate input" +
                "on LINUX <Ctrl> d then press Enter" +
                "on windows <Ctrl> z then press Enter");


        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;


            switch (grade / 10)
            {
                case 9:
                case 10:
                 ++aCount;
                 break;
                case 8:
                 ++bCount;
                 break;
                case 7:
                  ++cCount;
                  break;
                case 6:
                   ++dCount;
                   break;
                default:
                    ++fCount;
                            break;
            }
        }
        System.out.println("Grade Report");

        if (gradeCounter !=  0){
            double average = (double)  total / gradeCounter;

            System.out.printf("Total of the %d grades entered id %d%n", gradeCounter, total +
                    " Class average is %.2f%n", average +
                    "%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "number of student who received each grade" +
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ",fCount);

        }
        else
            System.out.println("No grades were entered");
    }
    }

