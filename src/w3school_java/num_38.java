package w3school_java;

public class num_38 {
    public static void main(String[] args) {
        count("my, mother loves me so much!");
    }
    public static void count(String word){
        char [] ch = word.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(ch[i])){
                letter++;
            }
            else if (Character.isDigit(ch[i])){
                number++;
            }
            else if (Character.isSpaceChar(ch[i])){
                space++;
            }
           else {
               other++;
            }
        }
        System.out.println(word);
        System.out.println("letters: " + letter);
        System.out.println("numbers: "+ number);
        System.out.println("space: "+ space);
        System.out.println("others: "+ other);
    }
}
