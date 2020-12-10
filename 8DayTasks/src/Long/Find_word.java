package Long;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        int size =8;
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


    public String find_longest_word(int size) throws IOException {
        BufferedReader input_text = null;

        try {
            input_text = new BufferedReader(new FileReader(this.path));
        }
        catch (FileNotFoundException ex) {
            System.out.println(String.format("ERROR: Can not found file %s", this.path));
            throw ex;
        }

        //ArrayList <String> storage = new ArrayList<String>();
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = input_text.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }



        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        String temp = new String(stringBuilder);
        String[] text_counter = temp.split(" ");

        List<String> storage = Arrays.asList(text_counter);

        //storage.add(temp);
        //System.out.println(storage);
        return find_word_with(storage, size);
   }



    public String find_word_with(List<String> storage,int size) throws NoSuchLongWord {
        String result =  storage.stream()
                   .filter(x-> x.length() == size)
                   .filter(x-> x.startsWith("a"))
                   //.filter(x-> x.endsWith("d"))
                   .findFirst()
                   .orElse(null);

        if (result == null) {
           throw new NoSuchLongWord(size);
        }

        return result;
    }
}

