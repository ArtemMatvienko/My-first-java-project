package Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    private String path;

    Read(String path) {
        this.path = path;
    }

    public static void main(String[] args) {
        Read read = new Read("/home/artem/java/project1/My-first-java-project/8DayTasks/src/Reader/aa.txt");
        try {
            read.find_longest_word();
        }
        catch (FileNotFoundException ex) {
            //stuck trace
            System.out.println("ERROR");
//            System.out.println(String.format("ERROR: %s", ex));
        }
    }

    
    public  void find_longest_word() throws FileNotFoundException {
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
            for (int i = 1; i < words.length; i++) {
                int j = i - 1;
                if (words[i].length() >= words[j].length()) {
                    storage.add(words[j]);
                } else {
                    storage.add(words[i]);
                }
            }

        }

        if (storage.get(0).length() >= storage.get(1).length()) {
            result = storage.get(0);
        }else {
            result = storage.get(1);
        }
        for (int i = 1; i < storage.size(); i++) {
            if (storage.get(i).length() >= result.length()) {
                result = storage.get(i);
            }
        }



           print(result);

    }

    public static void print(String result) {
        System.out.println(result);
    }


}

