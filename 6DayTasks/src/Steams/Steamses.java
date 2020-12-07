package Steams;

import java.util.*;
import java.util.stream.Collectors;

public class Steamses {
    static public void main (String[] args) {
        trying();
    }
    static public void trying () {
        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        Collection<Integer> numbers = Arrays.asList(3,7,2,8,6,4,2,6,4,3,9,1,5);
        Integer numb1 = numbers.stream().reduce(0,Integer::sum);
        OptionalDouble numb2 = numbers.stream().mapToInt(i -> i).average();
        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        String sorted1 = collection.stream().max(String::compareTo).get();
        String sorted2 = collection.stream().min(String::compareTo).get();
        System.out.println("sorted = " + sorted);
        System.out.println("sorted = " + sorted1);
        System.out.println("sorted = " + sorted2);
        System.out.println("sum is " + numb1);
        System.out.println("avg is " + numb2);
    }
}
