package codewars;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[]a2){
        int res = -1;
        for (String x:a1)
            for (String y:a2)
                res = Math.max(res, Math.abs(x.length() - y.length()));


        return res;
    }

    public static void main(String[] args) {
        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"},
                new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
    }
}
