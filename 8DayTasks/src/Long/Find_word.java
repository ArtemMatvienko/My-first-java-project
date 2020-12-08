package Long;

import Reader.Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


class NoSuchLongWord extends java.io.IOException {
    public int size;

    NoSuchLongWord (int size){
        this.size = size;
    }

    public String toString() {
        return "Can not found word with such size";
    }
}

public class Find_word {
    private String path;


    Find_word(String path) {
        this.path = path;

    }

    public static void main(String[] args) {
        int size =75;
        NoSuchLongWord noSuchLongWord = new NoSuchLongWord(size);

        Find_word find_word =  new Find_word("/home/artem/java/project1/My-first-java-project/8DayTasks/src/Long/aaa.txt");
        try {
            String result = find_word.find_longest_word(size);
            System.out.println(result);
        }

        catch (NoSuchLongWord ex){
            System.out.println(String.format("ERROR: so much big word with size : %d", ex.size));
        }

        catch (java.io.IOException ex) {
//        catch (FileNotFoundException ex) {
            //stack trace
            System.out.println("ERROR");
//            System.out.println(String.format("ERROR: %s", ex));
        }

        catch (Exception ex) {
           System.out.println("Something wrong");
        }
        finally {
            System.out.println("Process is end");
        }
    }


    public  String find_longest_word(int size) throws FileNotFoundException, NoSuchLongWord {
        Scanner input_text = null;
        try {
            input_text = new Scanner(new File(this.path));
        }
        catch (FileNotFoundException ex) {
            System.out.println(String.format("ERROR: Can not found file %s", this.path));
            throw ex;
        }
        ArrayList<String> storage = new ArrayList<String>();
        String line;
        String result = "";
        while (input_text.hasNextLine()) {
            line = input_text.nextLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {

                if (words[i].length() == size) {
                    result = words[i];
                    break;
                } else {
                    continue;
                }
            }
        }
        if (result.length() < size) {
           throw new NoSuchLongWord(size);
        }
        return result;
    }
}
