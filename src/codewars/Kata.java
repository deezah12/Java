package codewars;

public class Kata {
        public static int grow(int[] x){
            int total = 1;
            for(int i : x){
                total *= i;
            }

            return total;

        }

    }

