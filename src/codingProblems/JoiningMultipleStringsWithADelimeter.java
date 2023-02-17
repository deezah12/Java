package codingProblems;

public class JoiningMultipleStringsWithADelimeter {

    public static  String joinMe(String delimeter, String... args){
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;
        for (int i = 0; i < args.length - 1; i++) {
            stringBuilder.append(args[i]).append(delimeter);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinMe(",", "how,are,you"));
    }
}
