package Str;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Writing {
    public static void main(String[] args) {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        //string a = "dddd";
        char[] array = symbols.toCharArray();
        System.out.println(array);
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            arrayList.add(i, String.valueOf(array[i]));
        }

        Collections.shuffle(arrayList);
        String result = "";
        for (String con : arrayList) {
            result += con;
        }
        if (false) {
            StringBuilder sb = new StringBuilder();
            for (String s : arrayList) {
                sb.append(s);
            }
        }
        System.out.println(result);
    }
}


