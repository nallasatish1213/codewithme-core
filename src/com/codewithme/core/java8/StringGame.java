package com.codewithme.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringGame {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana", "kiwi", "kiwi");
        words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().forEach(map->{
                    if(map.getValue() >1){
                        System.out.println(map.getKey());
                    }
                });

        String s= "springboot was the backbone for building scalable";
        Arrays.stream(s.split(" ")).collect(Collectors.toMap(s1->s1,s2->s2.length()))
                .entrySet().stream().forEach(map->{
                        System.out.println(map.getKey()+":"+map.getValue());
                });
    }


}
