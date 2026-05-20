package testing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Java8BasicQuetionPart1Test {
    public static void main(String[] args) {
       String value="i love my net work and hard work";
       String[] arrValue=  value.split(" ");
       //String word ount the words
        System.out.println(arrValue.length);

        //word each latter count
        Map<String, Integer> countWords=Arrays.stream(arrValue).distinct().collect(toMap(s->s, s->s.length()));
        System.out.println(countWords);

        Map<Integer, Long> countWord=Arrays.stream(arrValue).collect(groupingBy(String::length, counting()));
        System.out.println(countWord);

        String[] trimValue =value.trim().split(" ");

        Map fullGroupWord = Arrays.stream(trimValue).collect(Collectors.groupingBy(Function.identity()));
        System.out.println(fullGroupWord);

        Map fullJoinWord = Arrays.stream(trimValue).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fullJoinWord);

        Map fullCnvtToLhm = Arrays.stream(trimValue).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(fullCnvtToLhm);

        Map wordAndLength= Arrays.stream(arrValue).collect(Collectors.groupingBy(Function.identity(),Collectors.mapping(s->s.length(),toList())));
        System.out.println(wordAndLength);

        Map lengthAndWords= Arrays.stream(arrValue).collect(groupingBy(s->s.length(),mapping(s->s,toList())));
        System.out.println(lengthAndWords);

        String peragraph="Using a Functional Interface, with Lambda Expression.";
        String val=  peragraph.replaceAll("[,.]","");

      String longestWord=  Arrays.stream(val.split(" "))
                .reduce((a,b)->a.length()>b.length()? a: b).get();
        System.out.println(longestWord);
    }
}
