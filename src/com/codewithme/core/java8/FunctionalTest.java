package com.codewithme.core.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalTest {

    public static void main(String[] args) {
        String name = "ilovejavatechie";
        Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(map -> {
                    // System.out.println(map.getKey()+" : " +map.getValue());
                });

        //find more then one or find duplicate

        List<Map.Entry<String, Long>> stringLongEntry = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() == 2).collect(Collectors.toList());

        // System.out.println(stringLongEntry);
        //find first non repeat element
        Map.Entry<String, Long> stringLongEntry1 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(f -> f.getValue() == 1).findFirst().get();
        //  System.out.println(stringLongEntry1);


        //find first char of  non repeat element
        Map.Entry<String, Long> stringLongEntry2 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(f -> f.getValue() == 1)
                .findFirst().get();
        System.out.println(stringLongEntry2);

        // find the second height number
        int[] intValues = {5, 9, 11, 2, 8, 21, 1};

        Integer listOfInt = Arrays.stream(intValues).boxed()
                .sorted((min, max) -> max.compareTo(min))
                .skip(1)
                .findFirst().get();

      //  System.out.println(listOfInt);
        // Find the longest string in array or list
        String[] message={"java"," techie"," javatechie","microservices"};

        String s = Arrays.stream(message).
                reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(s);
    }
}
