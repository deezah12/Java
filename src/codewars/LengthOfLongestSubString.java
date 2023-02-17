package codewars;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class LengthOfLongestSubString {
    public static int lengthOfLongestSubstring(String s) {
      String[] words= s.split("");
        SortedSet<String> lst = new TreeSet<>(Arrays.asList(words));
        if (lst.size() > 1) return lst.size() -1;
        else return lst.size();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}
