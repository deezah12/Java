package femi_assign;

import java.util.Scanner;

public class TimeConversion {
   public static void main(String[]args) {

      Scanner input = new Scanner(System.in);
       String time = input.next();


            String[] timeArray = time.split(":");
            String AmPm = timeArray[2].substring(2,4);
            int hh,mm,ss;


            hh = Integer.parseInt(timeArray[0]);
            mm = Integer.parseInt(timeArray[1]);
            ss = Integer.parseInt(timeArray[2].substring(0,2));

            String checkPM = "PM";
            String checkAM ="AM";

            if(AmPm.equals(checkAM) && hh==12)
            {
                hh=0;
            }
            else if(AmPm.equals(checkPM)&& hh<12)
            {
                hh+=12;
            }

            System.out.printf("%02d:%02d:%02d",hh,mm,ss);

        }
    }

