public class Reverse {
    public static void main(String[] args) {

        int num = 12345, reversed = 0;

        System.out.println("Original Number: " + num);

        while (num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }


//
//    public static void man(){s
//
//        int num = 1234567, reversed = 0;
//
//        for(;num != 0; num /= 10) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//        }
//
//        System.out.println("Reversed Number: " + reversed);
//    }

 public  void reverse(){

 }

}

