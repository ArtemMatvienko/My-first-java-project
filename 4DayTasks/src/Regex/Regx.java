package Regex;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class Regx {
    public static void main(String[] args) throws IOException {
        //Reader();
        Regextion();
    }
    static void Reader() throws IOException {
        Scanner in = new Scanner(new File("/home/artem/java/project1/My-first-java-project/4DayTasks/src/Regex/aaa.txt"));
        String s;
        double counter = 0;
        int counter_th = 0;
        while (in.hasNextLine()) {
            int i = 0;
            s = in.nextLine();
            String[] words = s.split(" ");
            for (String word : words) {

                String matches = "th";
                boolean res = word.regionMatches(true, 0, matches, 0, matches.length());
                if (res) {
                    counter_th++;
                }
                //System.out.println(res);

                counter++;

            }

        }
        in.close();
        Print(counter,counter_th);

    }

    private static  void Regextion() {
        //String text = words.toString();
        // ^ $
        // g
        String text = "12 I have Beautiful wifes And   sons Love them 15";
        //Pattern pattern = Pattern.compile("\\b([A-Z]\\S*)\\b");
        Pattern pattern = Pattern.compile("^\\d*\\w");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    static void Print( double counter, int counter_th) {
        System.out.println(counter);
        System.out.println(counter_th);
        double percent = (counter_th / counter) * 100;
        System.out.print(percent + "% ");
    }
}
