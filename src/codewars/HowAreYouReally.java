package codewars;

import java.util.Arrays;

public class HowAreYouReally {

    public  static boolean scores(int[] classPoints, int yourPoint){

        return Arrays.stream(classPoints).average().orElse(0) < yourPoint;
    }
}
