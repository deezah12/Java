package codingProblems;

public class CharacterOccurance {

//    public  static int occurs(String str, char ch){
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == ch);
//              count++;
//        }
//        return count;
//    }


    public  static long appear(String str, char ch){
        return str.chars().filter(c -> c == ch).count();
    }

    public static void main(String[] args) {
        //System.out.println(occurs("aaaaddddwer", 'a'));
        System.out.println(appear("aaaaddddwer", 'a'));

    }
}
