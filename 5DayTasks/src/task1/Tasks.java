package task1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) throws IOException {
         Reader();
        //Indexer();
    }

    static void Reader() throws IOException {
        Scanner scanner = new Scanner(new File("/home/artem/java/project1/My-first-java-project/5DayTasks/src/task1/aaa.txt"));

        double counter = 0;

        String line = scanner.nextLine();
        String[] words = line.split(" ");
        counter = words.length;
        work(scanner,words,counter);
    }

    static ArrayList<String> work(Scanner scanner, String[] words, double counter) {
        ArrayList <String> finish = new ArrayList <String>();
        List<String> result = finish.stream().filter(it-> it.indexOf("e")!= -1).collect(Collectors.toList());
//        for (String word : words) {
//            if (word.indexOf("e") != -1){
//                finish.add(word);
//            }
//        }
        System.out.println(result);

        return finish;
    }



    static void Indexer() throws IOException {
        Scanner scanner = new Scanner(new File("/home/artem/java/project1/My-first-java-project/5DayTasks/src/task1/aaa.txt"));
        String line = scanner.nextLine();
        int counter = line.indexOf("e");
        System.out.println(counter);
    }


        static void Print( double counter, int i) {
        System.out.println(counter);
        System.out.println(i);
        double per = i / counter * 100;
        System.out.println(per + "%");
        //System.out.println(i);
    }
}




