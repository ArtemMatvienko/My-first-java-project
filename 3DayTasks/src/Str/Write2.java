package Str;

import java.util.Random;

public class Write2 {
    public static void main(String[] args) {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(symbols);
        Random random = new Random();
        String result = new String();
        //String matches = "th";
        for (int i=0; i < 10000; i++) {
            char con = symbols.charAt(random.nextInt(symbols.length() - 1));
            result = result + con ;
        }
        //String a = "thafgcth";
        //boolean res = result.regionMatches(true,0, matches, 0, matches.length());
        System.out.println(result);
        System.out.println(result.contains("th"));
        //System.out.println(res);
    }
}
