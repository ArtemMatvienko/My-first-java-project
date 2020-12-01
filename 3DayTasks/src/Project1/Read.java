package Project1;

import java.io.*;
import java.util.*;

public class Read {
    public static void main(String[] args) throws IOException {
        Reader();
    }
        static void Reader() throws IOException {
            Scanner in = new Scanner(new File("/home/artem/java/project1/My-first-java-project/3DayTasks/src/Project1/aaa.txt"));
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
            static void Print( double counter, int counter_th) {
            System.out.println(counter);
            System.out.println(counter_th);
            double percent = (counter_th / counter) * 100;
            System.out.print(percent + "% ");
        }

}
