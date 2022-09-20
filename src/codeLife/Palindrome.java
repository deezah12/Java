package codeLife;

public  class Palindrome {

    public  static boolean isPalindrome(String item){
        String rev = "";
        boolean result = false;

        for (int i = item.length()-1; i < 0; i--) {
            rev = rev + item.charAt(i);
        }
        if(item.equals(rev)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String item = "madam im adam";

        item = item.toLowerCase();
        boolean A =isPalindrome(item);
        System.out.println(A);
    }

}