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
//        numbers.forEach(it -> {
//            System.out.println(String.format("Our numbers is : %d", it));
//        });
        Integer numb1 = numbers.stream().reduce(0,Integer::sum);
        OptionalDouble numb2 = numbers.stream().mapToInt(i -> i).average();
        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        String sorted1 = collection.stream().max(String::compareTo).get();
        String sorted2 = collection.stream().min(String::compareTo).get();
        List<String> transform = numbers.stream().map((it -> it + "_id")).collect(Collectors.toList());;
        System.out.println("sorted = " + sorted);
        System.out.println("max is  = " + sorted1);
        System.out.println("main is = " + sorted2);
        System.out.println("sum is " + numb1);
        System.out.println("avg is " + numb2);
        System.out.println(transform);
    }
}
